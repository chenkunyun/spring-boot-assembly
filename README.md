## Overview
This is example project to demonstrate how to use maven-assembly-plugin to package a SpringBoot application into a non-fat jar.
<br/>
<br/>
The resulting package structure will be:

```
.
├── bin
│   ├── start.sh
│   └── stop.sh
├── classes
│   ├── application.yml
│   ├── com
│   │   └── kchen
│   │       └── example
│   │           ├── ExampleApplication.class
│   │           └── controller
│   │               └── HomeController.class
│   └── logback-spring.xml
├── lib
│   ├── classmate-1.3.3.jar
│   ├── hibernate-validator-5.3.5.Final.jar
│   ├── jackson-annotations-2.8.0.jar
│   ├── jackson-core-2.8.8.jar
│   ├── jackson-databind-2.8.8.jar
│   ├── jboss-logging-3.3.1.Final.jar
│   ├── jcl-over-slf4j-1.7.25.jar
│   ├── jul-to-slf4j-1.7.25.jar
│   ├── log4j-over-slf4j-1.7.25.jar
│   ├── logback-classic-1.1.11.jar
│   ├── logback-core-1.1.11.jar
│   ├── slf4j-api-1.7.25.jar
│   ├── snakeyaml-1.17.jar
│   ├── spring-aop-4.3.9.RELEASE.jar
│   ├── spring-beans-4.3.9.RELEASE.jar
│   ├── spring-boot-1.5.4.RELEASE.jar
│   ├── spring-boot-autoconfigure-1.5.4.RELEASE.jar
│   ├── spring-boot-starter-1.5.4.RELEASE.jar
│   ├── spring-boot-starter-logging-1.5.4.RELEASE.jar
│   ├── spring-boot-starter-tomcat-1.5.4.RELEASE.jar
│   ├── spring-boot-starter-web-1.5.4.RELEASE.jar
│   ├── spring-context-4.3.9.RELEASE.jar
│   ├── spring-core-4.3.9.RELEASE.jar
│   ├── spring-expression-4.3.9.RELEASE.jar
│   ├── spring-web-4.3.9.RELEASE.jar
│   ├── spring-webmvc-4.3.9.RELEASE.jar
│   ├── tomcat-embed-core-8.5.15.jar
│   ├── tomcat-embed-el-8.5.15.jar
│   ├── tomcat-embed-websocket-8.5.15.jar
│   └── validation-api-1.1.0.Final.jar
└── log
    └── example.log
```

##THANKS
The start.sh and stop.sh scripts borrowed a lot of inspiration from Zhang Kaitao's blog: 
#####[是时候闭环Java应用了](http://jinnianshilongnian.iteye.com/blog/2317830)

Many thanks to Kaitao!