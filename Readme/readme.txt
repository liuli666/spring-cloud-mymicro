1.Eurekaע�����Ķ�Ӧ�ļ�Ⱥ����Ϊ
  1.1 mymicro-eureka7001��mymicro-eureka7002��mymicro-eureka7003
  1.2 ��Ҫ���õı���hostΪ
		127.0.0.1 eureka7001.com
		127.0.0.1 eureka7002.com
		127.0.0.1 eureka7003.com
  1.3 Eureka��������Է��ʹ������߽��з���,��������ĸ�������
	  http://localhost:7001/
	  http://localhost:7002/
	  http://localhost:7003/
2.ʹ��Ribbon+RestTemplate ��ʵ��springCloud�ĵ��ö˵��÷����
	2.1 mymicro-service2 Ϊ�����ṩ��
	2.2 mymicro-service1 Ϊ���������ߣ����� mymicro-service2
	2.3 http://localhost:8764/service1/controlelr/getinfo ������ sevice1����service2
	2.4 service1�� ����Ribbon ��ʵ�ֿͻ���(���ö�)�ĸ��ؾ���
