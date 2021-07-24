package com.icarusfrog.remote.httpInvokerStuff;

import com.icarusfrog.remote.remoting.Account;
import com.icarusfrog.remote.remoting.SimpleObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {HttpInvokerConfigTestContext.class})
class HttpInvokerConfigTest {
    @Autowired
    private SimpleObject simpleObject;
    /**
     * This test is designed to be run against a running instance of the local project
     */
    @Test
    void verifyThatHttpInvokerServiceExporterWorks() {
        log.info("Pulling accounts for 'hi' yielded: {}", simpleObject.getAccountsByName("hi"));
        log.info("Adding an account with name 'hi'");
        Account account = new Account();
        account.setName("hi");
        simpleObject.addAccount(account);
        log.info("Pulling accounts for 'hi' yielded: {}", simpleObject.getAccountsByName("hi"));
        Assertions.assertTrue(true);
    }

}