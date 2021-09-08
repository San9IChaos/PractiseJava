package com.company;
public class Animal {
    private String tip;
    private String family;
    void Voice(){
        System.out.println("Голос");
    }
    public String getTip(){
        return tip;
    }
    public void setTip(String a){
        tip=a;
    }
    public String getFamily(){
        return family;
    }
    public void setFamily(String b){
        family=b;
    }
    public Animal(String Tip, String Family){
        tip=Tip;
        family=Family;
    }

}
