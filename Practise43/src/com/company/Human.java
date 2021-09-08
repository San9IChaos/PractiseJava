package com.company;

class Human {
    private final String name, surname;
    private final int friendsAmount;
    public Human(String name,String surname, int friendsAmount){
        this.name = name;
        this.surname = surname;
        this.friendsAmount = friendsAmount;
    }
    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    int getFriendsAmount() {
        return friendsAmount;
    }
public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Name: ").append(name);
        sb.append(", Surname: ").append(surname);
        sb.append(", FriendsAmount: ").append(friendsAmount);
        return sb.toString();
}

}
