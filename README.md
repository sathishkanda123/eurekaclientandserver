How Eureka Server works
.......................
If you see mostly microservices are depolyed in cloud environments , and in cloud usually if we redeploy the code the url and port will change.Since, it would be very difficult to communicate the microservices with hardcode url and port .


Netflix comes with solution with Service Discovery Pattern called Eureka Service discovery

In my example code i explained with 3 different projects 
1) Eureka server which have all data of client microservices
2) Eurekaclient1 - Jobseeker
3) Eurekaclient2 - Company

The jobseeker and company usually need a communication. so , we should know each local host and port , what we do is we will register our eureka client in eureka server which maintains our client information
Download the application and start EurekaServer first and run http://localhost:8761/ - you will see dashboard with zero clients under
instances currently registered with Eureka

Once you start the client1 and client 2 , just refresh the dashboard you will see 2

EUREKA.CLIENT1	n/a (1)	(1)	UP (1) - localhost:eureka.client1:8383
EUREKA.CLIENT2	n/a (1)	(1)	UP (1) - localhost:eureka.client2:8384

Based on the application name, we will communicate using EurekaClient object with eureka server and we can reterive information of localhost and port 

Ex 1:- we will get eurekaclient2 info from eureka client1
Run http://localhost:8383/api/v1/eurakaclient1/getcompanyfromjobseeker


Ex2:- we will get eurekaclient1 info from eureka client2
Run http://localhost:8384/api/v1/eurakaclient2/getjobseekerfromcompany





