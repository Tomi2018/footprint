package com.example.asus.footprint;



public class UsersInfo {
    public int _id;
    public String name;//count
    public String allname;
    //public String lastname;
    public String password;
    public int age;
    public String info;

    public UsersInfo(){

    }

    public UsersInfo(String name){
        this.name = name;
    }
    public UsersInfo(String name, String password){
        this.name = name;
        this.password = password;
    }

    public UsersInfo(String name, int age, String info){
        this.name = name;
        this.age = age;
        this.info = info;
    }
    public UsersInfo(String name, String password, int age, String info){
        this.name = name;
        this.password = password;
        this.age = age;
        this.info = info;
    }


}