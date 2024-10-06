package ver5;

import java.util.ArrayList;
import java.util.Scanner;

public class Personlist {

    Scanner sc = new Scanner(System.in);
    ArrayList<Person> peronlist = new ArrayList<>();

    void addStudent(Student student) {
        peronlist.add(student);
    }

    void addTeacher(Teacher teacher) {
        peronlist.add(teacher);
    }

    void updatePerSon(String id) {
        Person a=findplayeEveryOne(id);
        if(a!=null){
            a.updatePerson(id);
        }else{
            System.out.println("Khong tim thay");
        }
    }

    void deletePerson(String id) {
        Person a=findplayeEveryOne(id);
        if(a!=null){
            peronlist.remove(a);
        }else{
            System.out.println("Khong tim thay");
        }
        
    }

    Person findplayeEveryOne(String id) {
        
        for(Person person :peronlist){
            if(person.getId().equals(id)){
                return person;
            }
        }
        return null;

    }

    void displayInfor() {
        for(Person person :peronlist){
            person.displayInfor();
        }
    }

    Student findTopStudent() {
        Student top=null;
        for(Person person :peronlist){
            if(person instanceof Student){
               Student student = (Student) person;
               if(top==null||student.getGpa()>top.getGpa()){
                   top=student;
               }
                   
            }
        }
        top.displayInfor();
        return null;
        

    }

    Teacher findTeacherByDepartment() {
        String ByDepartment=sc.nextLine();
        for(Person person :peronlist){
            if(person instanceof Teacher){
                Teacher teacher=(Teacher) person;
                if(teacher.getDepartment().equals(ByDepartment)){
                    teacher.displayInfor();
                }
            }
        }
        return null;

    }

    void checkbookOverdue() {
        for(Person person :peronlist){
            
            if(person.isBookOverdue() != false){
                displayInfor();
                 System.out.println("The book is overdue");
            }else {
                displayInfor();
                System.out.println("The book is not overdue");
            }
        }
    }
}
