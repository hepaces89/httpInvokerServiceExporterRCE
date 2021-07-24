package com.icarusfrog.remote.http_invoker;

import com.icarusfrog.remote.remoting.AccountService;
import com.icarusfrog.remote.remoting.SimpleObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class HttpInvokerConfigTestContext {

    @Bean
    public SimpleObject simpleObject(AccountService httpInvokerProxy) {
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.setAccountService(httpInvokerProxy);
        return simpleObject;
    }

    @Bean
    public HttpInvokerProxyFactoryBean httpInvokerProxy() {
        HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean = new HttpInvokerProxyFactoryBean();
        httpInvokerProxyFactoryBean.setServiceUrl("http://localhost:8080/AccountService");
        httpInvokerProxyFactoryBean.setServiceInterface(AccountService.class);
        return httpInvokerProxyFactoryBean;
    }

}
