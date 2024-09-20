package sang1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    float gpa;
    String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhap ID: ");
        String id = sc.nextLine();
        setId(id);
        System.out.println("Nhap Name: ");
        String name = sc.nextLine();
        setFullName(name);
        System.out.println("Nhap date dang dd/MM/yyyy: ");
        String date = sc.nextLine();
        try {
            Date Date = dtf.parse(date);
            setDateOfBirth(Date);
        } catch (Exception e) {
            System.out.println("Nhap loi. Nhap dd/MM/yyyy");
        }
        System.out.println("Nhap GPA: ");
        float gpa = sc.nextFloat();
        setGpa(gpa);
        sc.nextLine();
        System.out.println("Nhap Major: ");
        String major = sc.nextLine();
        setMajor(major);
    }

    public void updatePerson(String id) {
        SimpleDateFormat dtf=new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Student ");
        System.out.println("Update: " + id);

        System.out.print("Nhap ten moi: ");
        String newName = sc.nextLine();
        setFullName(newName);
        System.out.println("Nhap date dang dd/MM/yyyy: ");
        String date = sc.nextLine();
        try {
            Date Date = dtf.parse(date);
            setDateOfBirth(Date);
        } catch (Exception e) {
            System.out.println("Nhap loi. Nhap dd/MM/yyyy");
        }
        System.out.print("Nhap GPA moi: ");
        float newGpa = sc.nextFloat();
        setGpa(newGpa);
        sc.nextLine();

        System.out.print("Nhap Major moi: ");
        String newMajor = sc.nextLine();
        setMajor(newMajor);

        System.out.println("Update thanh cong.");

    }

    public void disPlayInfor() {
        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Date: " + (getDateOfBirth() != null ? a.format(getDateOfBirth()) : "N/A"));
        System.out.println("Gpa: " + getGpa());
        System.out.println("Major: " + getMajor());
    }

}
