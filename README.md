<<<<<<< HEAD
In this branch we are using automatic applicationn versioning
=======
<h1>Stage:Increment Version</h1>
<h2>Increment patch version in pom.xml</h2>
<h2>Read new version from pom.xml</h2>
<h2>put together a new Docker img tag</h2>
<h2>Assign it ot env variable</h2>


<h1>Build App</h1>
<h2>Clean target folder</h2>
<h2>Pakage jar files</h2>

<h1>Build Docker Image</h1>
<h2>Build docker image from docker file</h2>
<h2>Tag image with Repo-url and name</h2>
<h2>Login to Docker repo</h2>
<h2>Push to docker repo</h2>

<h2>For doing version update in pom.xml file -here we are doing patch update</h2>
mvn build-helper:parse-version versions:set -DnewVersion=${parsedVersion.majorVersion}.${parsedVersion.minorVersion}.${parsedVersion.nextIncrementalVersion} versions:commit

