# spring-auth-sso
Spring Boot Application with SSO authorization implemented with GitHub authentication

# How to check?
Run application on [http://localhost:8080](http://localhost:8080) by command

```
    mvn spring-boot:run
```

There are 3 available endpoints:
1. [http://localhost:8080/public/time](http://localhost:8080/public/time) would return current time in milliseconds
2. [http://localhost:8080/secured/secret](http://localhost:8080/secure/secret) would redirect to GitHub and require authentication, after that would return encoded username
3. [http://localhost:8080/secured/user](http://localhost:8080/secure/user) would return current user, if you are authenticated

