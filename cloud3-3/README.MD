1.启动eureka-server 使用命令启动：
mvn spring-boot:run -Dspring.profiles.active=zone1
mvn spring-boot:run -Dspring.profiles.active=zone2
mvn spring-boot:run -Dspring.profiles.active=zone3-region-west
mvn spring-boot:run -Dspring.profiles.active=zone4-region-west
2.启动eureka-client 使用命令启动：
mvn spring-boot:run -Dspring.profiles.active=zone1
mvn spring-boot:run -Dspring.profiles.active=zone2
mvn spring-boot:run -Dspring.profiles.active=zone3
mvn spring-boot:run -Dspring.profiles.active=zone4
3.启动zuul-gateway 使用命令启动：
mvn spring-boot:run -Dspring.profiles.active=zone1
mvn spring-boot:run -Dspring.profiles.active=zone3-region-west

启动之后访问：
 localhost:10001/demo-client/actuator/env
 localhost:10002/demo-client/actuator/env
 
接下来关闭到zone1及zone2的eureka client，在继续访问localhost:10001/demo-client/actuator/env
可以看到经过几个报错之后，自动fallback到remote-region的zone3或zone4的实例，实现了类似异地多活自动转移请求的效果。
