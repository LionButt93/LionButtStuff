package com.revature.models;

public class Owner
{

    private int owners_id;
    private String owner_first_name;
    private String owner_last_name;
    private String owner_address;
    private int owner_zipcode;
    private String phone_number;
    private String email;


    public Owner(String owner_first_name, String owner_last_name, String owner_address, int owner_zipcode, String phone_number, String email) {
        this.owner_first_name = owner_first_name;
        this.owner_last_name = owner_last_name;
        this.owner_address = owner_address;
        this.owner_zipcode = owner_zipcode;
        this.phone_number = phone_number;
        this.email = email;
    }

    public Owner(int owners_id, String owner_first_name, String owner_last_name, String owner_address, int owner_zipcode, String phone_number, String email) {
        this.owners_id = owners_id;
        this.owner_first_name = owner_first_name;
        this.owner_last_name = owner_last_name;
        this.owner_address = owner_address;
        this.owner_zipcode = owner_zipcode;
        this.phone_number = phone_number;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "owner_id=" + owners_id +
                ", owner_first_name='" + owner_first_name + '\'' +
                ", owner_last_name='" + owner_last_name + '\'' +
                ", owner_address='" + owner_address + '\'' +
                ", owner_zipcode=" + owner_zipcode +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getOwner_first_name() {
        return owner_first_name;
    }

    public void setOwner_first_name(String owner_first_name) {
        this.owner_first_name = owner_first_name;
    }

    public String getOwner_last_name() {
        return owner_last_name;
    }

    public void setOwner_last_name(String owner_last_name) {
        this.owner_last_name = owner_last_name;
    }

    public String getOwner_address() {
        return owner_address;
    }

    public void setOwner_address(String owner_address) {
        this.owner_address = owner_address;
    }

    public int getOwner_zipcode() {
        return owner_zipcode;
    }

    public void setOwner_zipcode(int owner_zipcode) {
        this.owner_zipcode = owner_zipcode;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOwners_id() {
        return owners_id;
    }

    public void setOwners_id(int owners_id) {
        this.owners_id = owners_id;
    }
}

