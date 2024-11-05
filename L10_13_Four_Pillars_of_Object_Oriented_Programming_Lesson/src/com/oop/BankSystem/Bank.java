package com.oop.BankSystem;

public class Bank {
    private String name;
    private int code;

    public Bank(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getCode() {
    	return this.code;
    }
    
    public void setCode(int code) {
    	this.code = code;
    }
}
