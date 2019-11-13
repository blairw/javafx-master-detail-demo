/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwmasterdetaildemo;

/**
 *
 * @author blair
 */
public class ContactPerson {
    protected String name;
    protected String emailAddress;
    protected String phoneNumber;

    public ContactPerson(String name, String emailAddress, String phoneNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
