package com.example.Springboot_Resilance4j_service2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
@GetMapping("/test")
    public String test()
{
    return "demo service two ... for circuit breaker";
}

@GetMapping("/test2")
public String test2()
{
    return "demo service two...for retry";
}
}
