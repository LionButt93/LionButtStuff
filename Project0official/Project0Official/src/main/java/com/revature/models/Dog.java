package com.revature.models;

public class Dog
{
    private int dog_id;
    private String dog_name;
    private String date_born;
    private String dog_breed;
    private String dog_size;
    private String dog_color;
    private String dog_gender;
    private Boolean vaccinations;
    private int owner_id_fk;
    private Owner owner;

    public Dog()
    {

    }

    public Dog(int dog_id, String dog_name, String date_born, String dog_breed, String dog_size, String dog_color, String dog_gender, Boolean vaccinations, int owner_id_fk) {
        this.dog_id = dog_id;
        this.dog_name = dog_name;
        this.date_born = date_born;
        this.dog_breed = dog_breed;
        this.dog_size = dog_size;
        this.dog_color = dog_color;
        this.dog_gender = dog_gender;
        this.vaccinations = vaccinations;
        this.owner_id_fk = owner_id_fk;
    }

    public Dog(String dog_name, String date_born, String dog_breed, String dog_size, String dog_color, String dog_gender, Boolean vaccinations) {
        this.dog_name = dog_name;
        this.date_born = date_born;
        this.dog_breed = dog_breed;
        this.dog_size = dog_size;
        this.dog_color = dog_color;
        this.dog_gender = dog_gender;
        this.vaccinations = vaccinations;
    }

    public Dog(int dog_id, String dog_name, String date_born, String dog_breed, String dog_size, String dog_color, String dog_gender, Boolean vaccinations) {
        this.dog_id = dog_id;
        this.dog_name = dog_name;
        this.date_born = date_born;
        this.dog_breed = dog_breed;
        this.dog_size = dog_size;
        this.dog_color = dog_color;
        this.dog_gender = dog_gender;
        this.vaccinations = vaccinations;
    }

    public Dog(int dog_id, String dog_name, String date_born, String dog_breed, String dog_size, String dog_color, String dog_gender, Boolean vaccinations, Owner owner) {
        this.dog_id = dog_id;
        this.dog_name = dog_name;
        this.date_born = date_born;
        this.dog_breed = dog_breed;
        this.dog_size = dog_size;
        this.dog_color = dog_color;
        this.dog_gender = dog_gender;
        this.vaccinations = vaccinations;
        this.owner = owner;
    }

    public int getDog_id() {
        return dog_id;
    }

    public void setDog_id(int dog_id) {
        this.dog_id = dog_id;
    }

    public String getDog_name() {
        return dog_name;
    }

    public void setDog_name(String dog_name) {
        this.dog_name = dog_name;
    }

    public String getDate_born() {
        return date_born;
    }

    public void setDate_born(String date_born) {
        this.date_born = date_born;
    }

    public String getDog_breed() {
        return dog_breed;
    }

    public void setDog_breed(String dog_breed) {
        this.dog_breed = dog_breed;
    }

    public String getDog_size() {
        return dog_size;
    }

    public void setDog_size(String dog_size) {
        this.dog_size = dog_size;
    }

    public String getDog_color() {
        return dog_color;
    }

    public void setDog_color(String dog_color) {
        this.dog_color = dog_color;
    }

    public String getDog_gender() {
        return dog_gender;
    }

    public void setDog_gender(String dog_gender) {
        this.dog_gender = dog_gender;
    }

    public Boolean getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(Boolean vaccinations) {
        this.vaccinations = vaccinations;
    }

    public int getOwner_id_fk() {
        return owner_id_fk;
    }

    public void setOwner_id_fk(int owner_id_fk) {
        this.owner_id_fk = owner_id_fk;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dog_id=" + dog_id +
                ", dog_name='" + dog_name + '\'' +
                ", date_born='" + date_born + '\'' +
                ", dog_breed='" + dog_breed + '\'' +
                ", dog_size='" + dog_size + '\'' +
                ", dog_color='" + dog_color + '\'' +
                ", dog_gender='" + dog_gender + '\'' +
                ", vaccinations=" + vaccinations +
                '}';
    }
}
