package com.bus1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class BusController {

    @Value("${application.name}")
    private String name;

    @GetMapping("/main")
    public String main() {
        return name;
    }
}
