# Jove

![](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)

Designed and implemented a project management system as end-of-semster project to be submitted for the university.

## Getting Started
1. Clone the repository
```git
$ git clone https://github.com/yeganathan18/jove.git 
```

2. Open terminal inside the project directory

3. Make sure your connect to db either with the docker setup as mentioned below or with pgadmin and proceed further.

3. Install dependencies and start the server, by running the following command
```bash
$ ./mvnw spring-boot:run
``` 

## Connect to postgres db

- [Install pgAdmin4](https://www.pgadmin.org/download/)
- Config [application.properties](src/main/resources/application.properties) file with pgadmin4 credentials
- Run the pgadmin4 server

## Lazy to connect with pgAdmin?
If you are lazy like me to start postgres server & pgadmin manually each time, then you can connect to the postgres db using the docker, which makes the development ease.

- [Install Docker engine](https://docs.docker.com/engine/install/) and run the docker engine 

- Make sure your inside the [docker directory](docker/), and build the postgres docker image, by running the following command
```bash
$ docker compose build
```

- Start docker postgres service
```bash
$ docker compose up -d
```

## Navigation
Open [localhost:8080](localhost:8080) in your browser, you will be able to access the application.

[//]: # (#TODO: Add navigations for the project)

## Reference Documentation
For further reference, please consider the following sections:

[//]: # (#TODO: Add project final report link & db architecture)
* [Project Final Report](https://amritauniv-my.sharepoint.com/:w:/g/personal/amenu4cse20376_am_students_amrita_edu/EcsiKfafh9lNgnEQgXbL4M4B_lyInZwD3CmaoqjFjxuPCw?e=3T01RQ)
* [Database Architecture](https://amritauniv-my.sharepoint.com/:w:/g/personal/amenu4cse20376_am_students_amrita_edu/EWA3o_8g4YFMkqhrUbvCB4oBp7o-gWE4C7R8pewulMEqTw?e=pBrQXt)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.0/maven-plugin/reference/html/#build-image)

## Authors
- Yeganathan S
- Gautham Vijay
- Sethulakshmi Santhosh

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
This project is licensed under the [MIT Licensed](https://choosealicense.com/licenses/mit/).
