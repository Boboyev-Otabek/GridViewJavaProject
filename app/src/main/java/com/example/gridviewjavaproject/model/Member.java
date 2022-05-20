package com.example.gridviewjavaproject.model;

public class Member {
    private String ism;
    private String familiya;

    public Member(String ism, String familiya){
        this.ism=ism;
        this.familiya=familiya;
    }

    public String getIsm() {
        return ism;
    }

    public String getFamiliya() {
        return familiya;
    }
}
