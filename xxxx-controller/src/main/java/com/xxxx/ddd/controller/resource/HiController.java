package com.xxxx.ddd.controller.resource;

import com.xxxx.ddd.application.service.event.impl.EventAppServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HiController {
    private final EventAppServiceImpl eventAppService;
    @GetMapping("hi")
    public String hello() {
        return eventAppService.sayHi("Hach");
    }
}
