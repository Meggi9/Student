# Пробный университетский IT-проект "Личный кабинет студента"

### Web-приложение с REST-запросами, реализаующий функционал личного кабинета и электронной зачётки студента

### Список технологий
* Java 
* СУБД PostgreSQL
* Spring Boot
* Spring MVC
* Spring Security (в том числе использование аннотации @AuthenticationPrincipal)
* JPA (также JpaRepository)
* JDBC Template
* RowMapper
* Thymeleaf

### Функционал

* Авторизация студентов (URL: ```http://localhost:8081/login```):

![image](https://user-images.githubusercontent.com/75883965/199621734-16ff050d-57e0-4776-827a-7b6e2472db91.png)

* Регистрация студентов (URL: ```http://localhost:8081/student-create```): 

![image](https://user-images.githubusercontent.com/75883965/199622109-9a046ac0-a5c2-4fee-8a25-2e5b1b76db5f.png)

* Главное меню (URL: ```http://localhost:8081```): 

![image](https://user-images.githubusercontent.com/75883965/199622236-a7b94dd2-9547-46ef-b62a-45821c3bb0c3.png)


* Вывод личной информации о студенте (URL: ```http://localhost:8081/student```):

![image](https://user-images.githubusercontent.com/75883965/199621853-06c10496-18fe-43e8-8149-8c5c3e39565b.png)


* Электронная зачётка (URL: ```http://localhost:8081/tablerat```):

![image](https://user-images.githubusercontent.com/75883965/199621899-f63c8f37-2036-4087-93bf-728cd9780a82.png)

