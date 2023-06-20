
In this branch we are using automatic applicationn versioning
=======
<h1>Stage:Increment Version</h1>
<h3>Increment patch version in pom.xml</h3>
<h3>Read new version from pom.xml</h3>
<h3>put together a new Docker img tag</h3>
<h3>Assign it ot env variable</h3>


<h1>Build App</h1>
<h3>Clean target folder</h3>
<h3>Pakage jar files</h3>

<h1>Build Docker Image</h1>
<h3>Build docker image from docker file</h3>
<h3>Tag image with Repo-url and name</h3>
<h3>Login to Docker repo</h3>
<h3>Push to docker repo</h3>

<h2>For doing version update in pom.xml file -here we are doing patch update</h2>
mvn build-helper:parse-version versions:set -DnewVersion=${parsedVersion.majorVersion}.${parsedVersion.minorVersion}.${parsedVersion.nextIncrementalVersion} versions:commit

<img width="928" alt="8" src="https://user-images.githubusercontent.com/59279947/234857269-bde4693d-bc98-43af-ad7a-4631cf93be37.png">
