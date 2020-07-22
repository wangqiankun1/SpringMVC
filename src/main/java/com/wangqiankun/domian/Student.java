package com.wangqiankun.domian;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Student implements Serializable {
    private String stuName;
    private int stuAge;
    private BankCard bankCard;

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", bankCard=" + bankCard +
                ", birthday=" + birthday +
                '}';
    }

    private Date birthday;

    public int getStuAge() {
        return stuAge;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
}
