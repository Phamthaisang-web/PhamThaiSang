package ver5;

import java.util.Scanner;

public class Ver5 {

    public static void main(String[] args) {
        Personlist personlist = new Personlist();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add new student\n"
                    + "2. Add new teacher\n"
                    + "3. Update person by id\n"
                    + "4. Delete person by id\n"
                    + "5. Display all students and teachers\n"
                    + "6. Find the student with the highest GPA\n"
                    + "7. Find teachers by department\n"
                    + "8. Notify whether the book's return due date has arrived or not");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    Student student = new Student();
                    student.addPerson();
                    personlist.addStudent(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    teacher.addPerson();
                    personlist.addTeacher(teacher);
                    break;
                case 3:
                    sc.nextLine();  
                    String id = sc.nextLine();
                    personlist.updatePerSon(id);
                    
                    break;
                case 4:
                    sc.nextLine(); 
                    String b = sc.nextLine();
                    personlist.deletePerson(b);
                    break;
                case 5:
                    sc.nextLine(); 
                    personlist.displayInfor();
                    break;
                case 6:
                    personlist.findTopStudent();
                    break;
                case 7:
                    personlist.findTeacherByDepartment();
                    break;
                case 8:
                    personlist.checkbookOverdue();
                    break;
                case 9:

                    return;
                default:
                    System.out.println("");
            }
        }
    }

}
