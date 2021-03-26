package org.iselab.grocery.domain;

public abstract class Person {
    private String name;


    public  Person(String name){
        this.name=name;
    }
    public String sayNyName(){
        return this.name;
    }
    public String dubplicate(String string){
        System.out.println(string);
        return  string;
    }
}
