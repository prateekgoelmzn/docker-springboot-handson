**Steps to run the project**
<ul>
    <li>
        First compile the project and create jar using command `mvn compile`
    </li>
    <li>
        Go inside project directory and build docker image using command `docker build -t {any name}/{any-name} .` <br/> for e.g : `docker build -t pgoel/springboot-docker-demo .`
    </li>
    <li>
        Run generated docker image using command `docker run {name provided in above step}/{name provided in above step}`<br/> for e.g : `docker run pgoel/springboot-docker-demo`
    </li>
</ul>