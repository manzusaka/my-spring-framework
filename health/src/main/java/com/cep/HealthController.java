package com.cep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HealthController {

    @RequestMapping("/health")
    public String health() {
        return "{“application\": \"health test web\"}";
    }
}
