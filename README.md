# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

IDE: Eclipse 

Steps to run the project:
1. Import the project as maven project into eclipse
2. Update Maven dependencies through Maven Update
3. Right click the project from project explorer -> Run as -> Java Application
4. Project will start on inbuilt tomcat server (You can view this in console)
5. You can test the application using exposed rest endpoint (http://localhost:8080/bill/getRetailBillAmount) with proper json request

Sample Json Request:

{
	"RetailBillDTO": {
		"userId": 1,
		"itemList": [{
			"itemId": 1,
			"quantity": 4
		}]
	}
}

Steps to Test the project:
1. Project needs to be imported and updated as said above
2. Right click the project from project explorer -> Run as -> Junit Test
3. You can check the results in Junit Console
