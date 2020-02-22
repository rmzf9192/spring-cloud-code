## config客户端使用JWT验证方法
  1.客户端向服务端授权Rest Controller 发送请求并且带上用户名和密码。
  2.服务端返回JWT Token。
  3.客户端查询服务端的配置需要在Header中带上token令牌进行认证。