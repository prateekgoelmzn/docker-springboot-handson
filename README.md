**Steps to run the project**
* First compile the project and create jar using command
  ```shell
  mvn compile
  ```
* Go inside project directory and build docker image using command
  ```shell
  docker build -t {any name}/{any name} .
  ```
    * for e.g:
        ```shell
        docker build -t pgoel/springboot-docker-demo .
        ```
* Run generated docker image using command
  ```shell
  docker run {name provided in above step}/{name provided in above step}
  ```
    * for e.g:
      ```shell
      docker run pgoel/springboot-docker-demo
      ```
