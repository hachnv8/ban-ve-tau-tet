package com.xxxx.ddd.application.service.event.impl;

import com.xxxx.ddd.application.service.event.EventApplicationService;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventApplicationService {
    @Override
    public String sayHi(String who) {
        return "Hello Application " + who;
    }
}
