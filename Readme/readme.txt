1.Eureka注册中心对应的集群工程为
  1.1 mymicro-eureka7001、mymicro-eureka7002、mymicro-eureka7003
  1.2 需要配置的本地host为
		127.0.0.1 eureka7001.com
		127.0.0.1 eureka7002.com
		127.0.0.1 eureka7003.com
  1.3 Eureka启动后可以访问关联工具进行访问,下面随便哪个都可以
	  http://localhost:7001/
	  http://localhost:7002/
	  http://localhost:7003/
2.使用Ribbon+RestTemplate 来实现springCloud的调用端调用服务端
	2.1 mymicro-service2 为服务提供者
	2.2 mymicro-service1 为服务消费者，调用 mymicro-service2
	2.3 http://localhost:8764/service1/controlelr/getinfo 来测试 sevice1调用service2
	2.4 service1中 采用Ribbon 来实现客户端(调用端)的负载均衡
