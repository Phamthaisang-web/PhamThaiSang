package ver5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private String department, teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateofBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateofBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
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
        System.out.println("Nhap nam sinh");
        String date = sc.nextLine();
        try {
            Date a = s.parse(date);
            setDateofBirth(a);
        } catch (Exception e) {
            System.out.println("Nhap sai dang dd/MM/yyyy");
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
        System.out.println("Nhap Department");
        String Department = sc.nextLine();
        setDepartment(Department);
       
        System.out.println("Nhap TeachingSubject");
        String TeachingSubject = sc.nextLine();
        setTeachingSubject(TeachingSubject);
    }

    @Override
    public void updatePerson(String id) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat s = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println("Nhap fullName");
        String fullname = sc.nextLine();
        setFullName(fullname);
        System.out.println("Nhap nam sinh dang dd/MM/yyyy");
        String date = sc.nextLine();
        try {
            Date a = s.parse(date);
            setDateofBirth(a);
        } catch (Exception e) {
            System.out.println("Nhap sai dang dd/MM/yyyy");
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
   
        System.out.println("Nhap Department");
        String Department = sc.nextLine();
        setDepartment(Department);
        sc.nextLine();
        System.out.println("Nhap TeachingSubject");
        String TeachingSubject = sc.nextLine();
        setTeachingSubject(TeachingSubject);
    }

    @Override
    public void displayInfor() {
        SimpleDateFormat s = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println("ID: " + getId());
        System.out.println("FullName: " + getFullName());
        System.out.println("DateOfBirth: " + (getDateofBirth() != null ? s.format(getDateofBirth()) : "N/A"));
        System.out.println("Department: " + getDepartment());
        System.out.println("TeachingSubject: " + getTeachingSubject());
    }

}
