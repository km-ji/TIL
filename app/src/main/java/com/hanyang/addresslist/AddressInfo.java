package com.hanyang.addresslist;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class AddressInfo{
    @PrimaryKey(autoGenerate=true)
    public int id;
    private String address;
    private String phone;
    private String name;
    private int age;

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

