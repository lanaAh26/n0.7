package com.example.n07;

public class Person {

    String name;
    String phone;
    Integer image;


    public Person(String name,String phone,int image) {
        this.name = name;
        this.phone = phone;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(String name) {
        this.image = image;
    }
}
