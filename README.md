Hi,

Please find links and steps to each of the tasks below :

1. Task1
	a. Service1 : GET : http://3.134.91.215:8081/first/up
						Its a get request without any path or query parameter and without any request body.
						ResponseBody : Up..
				  
				  POST : http://3.134.91.215:8081/first/concatAll
						 Its a post request and the request body should be like below :
						 Request Body : {"name" : "Gursheen" , "lastName" : "Ubeja"}// You can pass any parameter value in name and lastname
						 Response Body : Hi..Gursheen Ubeja
				
	b. Service2:  GET :  http://3.134.91.215:8082/second/hello
						 Its a get request and only returns hi
						 Response Body : Hi..
						 
	
	c. Service3 : POST :  http://3.134.91.215:8083/third/contactName
						  Its a post request and its request reponse looks like below : 
						  Request Body : {"name" : "Gursheen" , "lastName" : "Ubeja"} // You can pass any parameter value in name and lastname
						  Response Body : Gursheen Ubeja 
						
						
						
	All the services are working independently, also as required eturning responses  by communicating with each other.
	
2. Task2

	Data for this task is inserted into H2 db at the time of application startup through schema.sql and data.sql files.

	a. Service1 : GET : http://3.134.91.215:8080/color/getAll
						This service fetches all records.
						ResponseBody : [{"SubClasses":[{"name":"Wizard"},{"name":"Priest"},{"name":"Ranger"},{"name":"Cleric"}],"name":"Warrior"},{"SubClasses":[{"name":"Paladin"}],"name":"Wizard"},{"SubClasses":[{"name":"Mage"}],"name":"Priest"},{"SubClasses":[{"name":"Thief"},{"name":"Bard"},{"name":"Assassin"}],"name":"Paladin"},{"SubClasses":[{"name":"Cleric"},{"name":"Druid"},{"name":"Specialist wizard"}],"name":"Ranger"}]
	
	b. Service2 : GET : http://3.134.91.215:8080/color/getColor?id=1
						This service accepts id as query parameter.
						ResponseBody : {"parent":0,"color":"Red","name":"Warrior"}
						
	c. Database console : http://3.134.91.215:8080/h2-console/login.do?jsessionid=0e5ec535a22d821b377d2c7db01b802c
	
	





	
	


