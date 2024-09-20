package sang1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    String department, teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
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

    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Teacher");
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
        System.out.println("Nhap department");
        String department = sc.nextLine();
        setDepartment(department);
        System.out.println("Nhap teachingSubject");
        String teachingSubject = sc.nextLine();
        setTeachingSubject(teachingSubject);
    }

    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dtf=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Teacher");
        System.out.println("ID: " + id);

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
        System.out.print("Nhap Department moi: ");
        String newDepartment = sc.nextLine();
        setDepartment(newDepartment);

        System.out.print("Nhap TeachingSubject moi: ");
        String newTeachingSubject = sc.nextLine();
        setTeachingSubject(newTeachingSubject);

        System.out.println("Update thanh cong.");

    }

    public void disPlayInfor() {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Date: " + (getDateOfBirth() != null ? s.format(getDateOfBirth()) : "N/A"));
        System.out.println("Nhap department: " + getDepartment());
        System.out.println("Nhap teachingSubject" + getTeachingSubject());
    }

}
