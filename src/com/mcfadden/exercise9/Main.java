package com.mcfadden.exercise9;
//Ean McFadden
//Exercise 9
//March 13, 2018
abstract class Contacts{
    private String name;
    public Contacts (){

    }
    public Contacts(String name) {
        this.name = name;
    }
    abstract public void contactMethod();
}
class Email extends Contacts{
    private String email;
    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contactMethod() {
        System.out.println("Emailing " + email);
    }
}
class PhoneNumber extends Contacts{
    private String phoneNumber;
    public PhoneNumber(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contactMethod() {
        System.out.println("Calling " + phoneNumber);
    }
}
public class Main {

    public static void main(String[] args) {
        Email num1 = new Email("Jeremy Johnson", "hi_de_hi_de_ho@gmail.com");
        PhoneNumber num2 = new PhoneNumber("Warlord Katsumori", "(632)-796-3456");
        num1.contactMethod();
        num2.contactMethod();
    }
}
