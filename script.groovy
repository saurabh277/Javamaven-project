def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credential', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t saurabh277/jenkinsapp:2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push saurabh277/jenkinsapp:1.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
