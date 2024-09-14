package ontap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    float gpa;
    String major;

    public Student() {
    }

    public Student(String id, String fullname, Date dateOfBirth, float gpa, String major) {
        super(id, fullname, dateOfBirth);
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

    public void addStudent() {

        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ID: ");
        String id = sc.nextLine();  
        setId(id);  

        System.out.println("Nhap ho ten: ");
        String fullname = sc.nextLine();  
        setFullname(fullname);  
        
        System.out.println("Nhap ngay sinh (dd/MM/yyyy): ");
        String dateOfBirthStr = sc.nextLine();
        try {
            Date dateOfBirth = a.parse(dateOfBirthStr);  
            setDateOfBirth(dateOfBirth);  
        } catch (Exception e) {
            System.out.println("Bi loi nhap dd/MM/yyyy.");
        }
        System.out.println("Nhap GPA: ");
        float Gpa=sc.nextFloat();
        setGpa(Gpa);
        
        System.out.println("Nhap Major: ");
        sc.nextLine();
        String Major=sc.nextLine();
        setMajor(Major);
    }

    public void displayInfo(){
        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+ getFullname());
        System.out.println("DateOfBirth: "+  (getDateOfBirth() != null ? a.format(getDateOfBirth()) : "N/A"));
        System.out.println("GPA: "+getGpa());
        System.out.println("Major: "+getMajor());
    }

}
