package sang1;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PersonList {

    Scanner sc = new Scanner(System.in);
    ArrayList<Person> person = new ArrayList<>();
    Student student = new Student();

    void addStudent(Student student) {

        person.add(student);

    }

    void addTeacher(Teacher teacher) {

        person.add(teacher);

    }

    Person findPersonById(String ID) {

        for (Person p : person) {
            if (p.getId().equals(ID)) {
                {
                    return p;
                }
            }

        }
        return null;
    }

    void updatePerson(String ID) {

        Person update = findPersonById(ID);
        if (update != null) {
            update.updatePerson(ID);
        } else {
            System.out.println("Khong tim thay ID.");
        }
    }

    void deletePersonById() {
        System.out.println("Nhap Id de xoa: ");
        String id = sc.nextLine();
        Person ID = findPersonById(id);
        if (ID != null) {
            
            person.remove(ID);
            System.out.println("Xoa thanh cong ID: "+ id);
        } else {
            System.out.println("Khong tim thay ID.");
        }
    }

    void displayEveryone() {
        for (Person ps : person) {
            ps.disPlayInfor();
        }
    }

    Student findTopStudent() {
        Student top = null;

        for (Person ps : person) {
            if (ps instanceof Student) {
                Student student = (Student) ps;
                if (top == null || student.getGpa() > top.getGpa()) {
                    top = student;
                }
            }
        }
        top.disPlayInfor();
        return null;

    }
    
            
    void findTeacherByDepartment() {
        System.out.println("Nhap Department: ");

        String department = sc.nextLine();
        for (Person person : person) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    teacher.disPlayInfor();
                }
            }
        } 
  
    }
}
