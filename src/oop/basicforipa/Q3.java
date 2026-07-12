package oop.basicforipa;

import java.util.*;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Hospital[] arr = new Hospital[n];

        for (int i = 0; i < n; i++) {

            int hospid = sc.nextInt();
            sc.nextLine();

            String hospName = sc.nextLine();

            String city = sc.nextLine();

            int doctorid = sc.nextInt();
            sc.nextLine();

            String doctorName = sc.nextLine();

            String specialization = sc.nextLine();

            int experience = sc.nextInt();
            sc.nextLine();

            Doctor d = new Doctor(doctorid, doctorName, specialization, experience);

            arr[i] = new Hospital(hospid, hospName, city, d);
        }

        int minimumExperience = sc.nextInt();

        Hospital[] res = findHospitalsByDoctorExperience(arr, minimumExperience);

        if (res == null) {
            System.out.println("No Hospital Found");
        } else {
            for (Hospital h : res) {
                System.out.println(h.getHId());
                System.out.println(h.getHName());
                System.out.println(h.getCity());
                System.out.println(h.getDoc().getName());
                System.out.println(h.getDoc().getExp());
            }
        }

        sc.close();
    }

    public static Hospital[] findHospitalsByDoctorExperience(Hospital[] hospitals, int minimumExperience) {

        if (hospitals == null || hospitals.length == 0) {
            return null;
        }

        Hospital[] temp = new Hospital[hospitals.length];
        int index = 0;

        for (Hospital h : hospitals) {

            if (h.getDoc().getExp() >= minimumExperience) {
                temp[index] = h;
                index++;
            }

        }

        if (index == 0) {
            return null;
        }

        Hospital[] finalRes = new Hospital[index];

        for (int i = 0; i < index; i++) {
            finalRes[i] = temp[i];
        }

        return finalRes;
    }
}

class Doctor {

    private int doctorid;
    private String doctorName;
    private String specialization;
    private int experience;

    public Doctor(int doctorid, String doctorName, String specialization, int experience) {
        this.doctorid = doctorid;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.experience = experience;
    }

    public int getId() {
        return doctorid;
    }

    public String getName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExp() {
        return experience;
    }
}

class Hospital {

    private int hospid;
    private String hospName;
    private String city;
    private Doctor doctor;

    public Hospital(int hospid, String hospName, String city, Doctor doctor) {
        this.hospid = hospid;
        this.hospName = hospName;
        this.city = city;
        this.doctor = doctor;
    }

    public int getHId() {
        return hospid;
    }

    public String getHName() {
        return hospName;
    }

    public String getCity() {
        return city;
    }

    public Doctor getDoc() {
        return doctor;
    }
}