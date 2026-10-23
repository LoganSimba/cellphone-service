package com.pluralsight;

public class CellPhone {
    //private date members
    private int serialNumber;
    private String model;
    private String career;
    private String phoneNumber;
    private String owner;


    // constructor, it has the same name as the class
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.career = "";
        this.phoneNumber = "";
        this.owner = "";

    }


    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCareer() {
        return career;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "serialNumber=" + serialNumber +
                ", model='" + model + '\'' +
                ", career='" + career + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public void dial(String phoneNumber){
        System.out.println(getOwner() + " is calling "  + phoneNumber);
    }
}
