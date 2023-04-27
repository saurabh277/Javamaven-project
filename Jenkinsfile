pipeline {
    agent any
    tools {
    maven 'my-maven'
    }
    stages {
        stage('version increment') {
            steps {
                script {
                 echo 'incrementing app version...'
                    sh 'mvn build-helper:parse-version versions:set \
                        -DnewVersion=\\\${parsedVersion.majorVersion}.\\\${parsedVersion.minorVersion}.\\\${parsedVersion.nextIncrementalVersion} \
                        versions:commit'
                    def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
                    def version = matcher[0][1]
                    env.IMAGE_NAME = "$version-$BUILD_NUMBER"

                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    echo 'building jar file'
                    sh 'mvn clean package'
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "building the docker image..."
                    withCredentials([usernamePassword(credentialsId: 'dockerhub-credential', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh "docker build -t saurabh277/version-app:${IMAGE_NAME} ."
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh "docker push saurabh277/version-app:${IMAGE_NAME}"
                    }

                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "deploying to EC2"
                }
            }
        }
    }
}
