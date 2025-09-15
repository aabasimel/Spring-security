package org.abasimel.spring_security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "welcome to my page" + request.getSession().getId();
    }

}
