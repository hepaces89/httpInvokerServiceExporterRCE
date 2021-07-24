package com.icarusfrog.remote.httpInvokerStuff;

import com.icarusfrog.remote.remoting.AccountService;
import com.icarusfrog.remote.remoting.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 * In this class we are setting up an HttpInvokerServiceExporter that listens on the "/AccountService" end point
 * that will invoke the underlying accountService bean.
 */
@Configuration
public class HttpInvokerConfig {

    @Bean(name = "/AccountService")
    public HttpInvokerServiceExporter accountServiceExporter (AccountService accountService) {
        HttpInvokerServiceExporter httpInvokerServiceExporter = new HttpInvokerServiceExporter();
        httpInvokerServiceExporter.setService(accountService);
        httpInvokerServiceExporter.setServiceInterface(AccountService.class);
        return httpInvokerServiceExporter;
    }

    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl();
    }
}
