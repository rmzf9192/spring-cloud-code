##
 sleuth-comsumer、sleuth-provider,使用Feign、RestTemplate
 、新建的子线程的方式请求sleuth-provider
 
 访问：http://localhost:8081/helloByNewThread?name=scbook
 http://localhost:8081/helloByFeign?name=scbook
 http://localhost:8081/helloByRestTemplate?name=scbook
 
 结论：
    引入spring-cloud-sleuth之后，我们的日志组件自动打印Span信息，然后
    span信息不仅可以随着feign、restTemplate往服务端传递，还可以在父子
    线程之间传递。
 Sleuth如何做到Span信息传递的？
  1.Sleuth对Feign的支持
  2.Sleuth对RestTemplate的支持
  3.Sleuth对多线程的支持
  