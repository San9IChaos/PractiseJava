package com.company;

public class User {
    String name;
    int age;
    public User(String name, int age){
this.name = name;
this.age = age;
    }
   public int getAge(){
        return age;
    }
    void setAge(int age){

        this.age = age;
    }
    public String getName(){

        return name;
    }
    void setName(String name){

        this.name = name;
    }
    public String toString(){
StringBuffer sb = new StringBuffer("User: {");
sb.append("Name: ").append(name);
sb.append(", Age: ").append(age);
sb.append("}");
return sb.toString();
    }

}
