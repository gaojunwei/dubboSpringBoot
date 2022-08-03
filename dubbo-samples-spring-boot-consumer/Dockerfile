#基础镜像使用java
FROM java:8
#作者
MAINTAINER jack<jack.5@qq.com>
#暴露端口为微服务
EXPOSE 9001

#将jar包添加到容器中并更名为 gjw_docker.jar
ADD dubbo-samples-spring-boot-consumer.jar /dubbo-samples-spring-boot-consumer.jar

#运行jar包
RUN bash -c 'touch /dubbo-samples-spring-boot-consumer.jar'
ENTRYPOINT ["java","-jar","/dubbo-samples-spring-boot-consumer.jar"]

