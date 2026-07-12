package oop;

import java.util.Scanner;

public class AssociateEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Associate a = new Associate();
        a.setId(101);
        a.setName("Abhijith");
        a.setTechnology("Java");
        a.setExperienceInYears(2);

        System.out.println("ID: " + a.getId());
        System.out.println("Name: " + a.getName());
        System.out.println("Technology: " + a.getTechnology());
        System.out.println("Experience: " + a.getExperienceInYears() + " years");

        sc.close();
    }
}

// Encapsulation: all fields are private, accessed only via public getters/setters
class Associate {
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
