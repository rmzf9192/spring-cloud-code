## Sleuth深入用法
1.TraceFilter 
   对于提供Http接口的服务方来说，它接收客户端Span信息的方式是filter。
sleuth通过Brave的TracingFilter达到获取Span信息的目的。
#注意:自定义的filter优先级比TracingFilter优先级低，不然无法拿到TracingFilter处理之后的信息
2.Baggage
  Baggage是存储在Span的上下文中的一组Key/Value键值对，跟traceId和spanId不同，它不是必选项。
  在Sleuth中，由Sleuth帮我们沿着调用链路一路往下传递。
  它相当于Sleuth暴露的功能接口，通过它，你可以让你的数据随着Sleuth一起往后接连传递。
  典型应用场景：登录信息的传递
  
案例说明：
  consumer使用自定义的Filter获取前端传来的sessionId,放入Baggage中，通过feign调用的方式将
  sessionId传递给Provider。
  
  访问：http://localhost:8081/hello?name=scbook