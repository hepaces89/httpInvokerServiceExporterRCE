package com.icarusfrog.remote.remoting;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.Serializable;

@Slf4j
public class Account implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        log.warn("Code running on deserialization");
        in.defaultReadObject();
    }
}
