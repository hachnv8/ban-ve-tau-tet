package com.xxxx.ddd.application.service.event.impl;

import com.xxxx.ddd.application.service.event.EventApplicationService;
import com.xxxx.ddd.domain.service.impl.HiDomainServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventAppServiceImpl implements EventApplicationService {
    private final HiDomainServiceImpl hiDomainService;

    @Override
    public String sayHi(String who) {
        return hiDomainService.sayHi(who);
    }
}
