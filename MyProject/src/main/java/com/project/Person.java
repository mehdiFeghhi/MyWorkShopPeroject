package com.project;

import java.awt.*;
import java.util.ArrayList;
enum Gender {
        male,female;
        }
public class Person  {
    Gender gender ;
    private  String tokenJnarait;
    private String name ;
    private String lastName;
    private String date_birthday;
    private String user;
    private String pass;
    private String nationalCode;
    private String phoneNumber;
    private String emailAddress;
    private ArrayList<RoleOfWorkShape> roleOfWorkShapes = new ArrayList<RoleOfWorkShape>() ;
    private Image image;

    public Person() {
    }

    public void setRoleOfWorkShapes(ArrayList<RoleOfWorkShape> roleOfWorkShapes) {
        this.roleOfWorkShapes = roleOfWorkShapes;
    }

    public ArrayList<RoleOfWorkShape> getRoleOfWorkShapes() {
        return roleOfWorkShapes;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getTokenJnarait() {
        return tokenJnarait;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDate_birthday() {
        return date_birthday;
    }

    public void setDate_birthday(String date_birthday) {
        this.date_birthday = date_birthday;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    public RoleOfWorkShape findOurType(Type type){

        for (RoleOfWorkShape i : roleOfWorkShapes){
            if (i.getType() == type)
                return i;
        }
        if (type == Type.Student){
            Student student = new Student(this.user);
            this.roleOfWorkShapes.add(student);
            return student;

        }
        else if (type == Type.Greater){
            Greater greater = new Greater(this.getUser());
            this.roleOfWorkShapes.add(greater);
            return greater;
        }
        else if (type == Type.management){
            Managment whoMakeWorkShape = new Managment();
            this.roleOfWorkShapes.add(whoMakeWorkShape);
            return whoMakeWorkShape;
        }
        else
            return null;
    }
    public boolean is_this_role_in_our_person(Type type){
        for (RoleOfWorkShape i : roleOfWorkShapes)
            if (i.getType() == type)
                return true;
        return false;
    }
    public boolean addToArrayListOfRole(RoleOfWorkShape roleOfWorkShape){
        for (RoleOfWorkShape i : this.roleOfWorkShapes)
            if (i.getType() == roleOfWorkShape.getType())
                return false;
        this.roleOfWorkShapes.add(roleOfWorkShape);
        return true;
    }
    public RoleOfWorkShape GetThisRole(Type type){
        for (RoleOfWorkShape i : this.roleOfWorkShapes)
            if(i.getType() == type)
                return i;
        return null;
    }
    @Override
    public String toString() {
        return this.name + " // " + this.lastName + " // " + this.emailAddress;
    }
}
