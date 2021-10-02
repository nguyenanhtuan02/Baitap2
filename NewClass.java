/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author ASUS
 */
public class NewClass {
 String name;
 int age;
 String emaildress;
 char gener;

    public NewClass(String name, int age, String emaildress, char gener) {
        this.name = name;
        this.age = age;
        this.emaildress = emaildress;
        this.gener = gener;
    }
    

    public NewClass(int age, String emaildress) {
        this.age = age;
        this.emaildress = emaildress;
    }

    public NewClass(int age, char gener) {
        this.age = age;
        this.gener = gener;
    }
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmaildress() {
        return emaildress;
    }

    public void setEmaildress(String emaildress) {
        this.emaildress = emaildress;
    }

    public char getGener() {
        return gener;
    }

    public void setGener(char gener) {
        this.gener = gener;
    }
 
    
    
}
