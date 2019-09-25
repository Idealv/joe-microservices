package com.joe.provider.service;

import com.joe.api.ProviderService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String hello(String name) {
        return "Hello Dubbo " + name;
    }
}
