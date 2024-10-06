package ver5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major, String id, String fullName, Date dateofBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateofBirth, bookBorrowDate, bookReturnDate);
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

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhap id");
        String id = sc.nextLine();
        setId(id);
        System.out.println("Nhap fullName");
        String fullname = sc.nextLine();
        setFullName(fullname);
  
        System.out.println("Nhap nam sinh dang dd/MM/yyyy");
        
        
        String date = sc.nextLine();
        try {
            Date a = s.parse(date);
            setDateofBirth(a);
        } catch (Exception e) {
            System.out.println("Nhap sai dinh dang. Vui long nhap lai theo dd/MM/yyyy");
        }
        System.out.println("Nhap bookBorrowDate");
        String bookBorrowDate=sc.nextLine();
        
        try {
            Date a = s.parse(bookBorrowDate);
            setBookBorrowDate(a);
        } catch (Exception e) {
            System.out.println("Nhap sai dang dd/MM/yyyy");
        }
        System.out.println("Nhap bookReturnDate");
        String bookReturnDate=sc.nextLine();
        
        try {
            Date a = s.parse(bookReturnDate);
            setBookBorrowDate(a);
        } catch (Exception e) {
            System.out.println("Nhap sai dang dd/MM/yyyy");
        }
        System.out.println("Nhap gpa");
        float gpa = sc.nextFloat();
        setGpa(gpa);
        sc.nextLine();
        System.out.println("Nhap major");
        String major = sc.nextLine();
        setMajor(major);

    }

    @Override
    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");  

        System.out.println("Nhap fullName");
        String fullname = sc.nextLine();
        setFullName(fullname);
        System.out.println("Nhap nam sinh dang dd/MM/yyyy");
        
        
        String date = sc.nextLine();
        try {
            Date a = s.parse(date);
            setDateofBirth(a);
        } catch (Exception e) {
            System.out.println("Nhap sai dinh dang. Vui long nhap lai theo dd/MM/yyyy");
        }
        System.out.println("Nhap bookBorrowDate");
        String bookBorrowDate=sc.nextLine();
        
        try {
            Date a = s.parse(bookBorrowDate);
            setBookBorrowDate(a);
        } catch (Exception e) {
            System.out.println("Nhap sai dang dd/MM/yyyy");
        }
        System.out.println("Nhap bookReturnDate");
        String bookReturnDate=sc.nextLine();
        
        try {
            Date a = s.parse(bookReturnDate);
            setBookBorrowDate(a);
        } catch (Exception e) {
            System.out.println("Nhap sai dang dd/MM/yyyy");
        }
        System.out.println("Nhap gpa");
        float gpa = sc.nextFloat();
        setGpa(gpa);
        sc.nextLine();
        System.out.println("Nhap major");
        String major = sc.nextLine();
        setMajor(major);
    }

    @Override
    public void displayInfor() {
        SimpleDateFormat s = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println("ID: " + getId());
        System.out.println("FullName: " + getFullName());
        System.out.println("DateOfBirth: " + (getDateofBirth() != null ? s.format(getDateofBirth()) : "N/A"));
        System.out.println("Gpa: " + getGpa());
        System.out.println("Major: " + getMajor());
    }

}
