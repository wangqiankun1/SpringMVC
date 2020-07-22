package com.wangqiankun.domian;

import java.io.Serializable;

public class BankCard implements Serializable {
    String name;
    String password;

    @Override
    public String toString() {
        return "BankCard{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
