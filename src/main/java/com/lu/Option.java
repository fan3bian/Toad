package com.lu;

import java.io.Serializable;

public class Option implements Serializable {
    String code;
    String name;

    public Option() {
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}