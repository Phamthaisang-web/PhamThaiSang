package sang1;

import java.util.Scanner;

public class Sang1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList personList = new PersonList();

        while (true) {
            System.out.println("1. Add new student\n"
                    + "2. Add new teacher\n"
                    + "3. Update person by id\n"
                    + "4. Delete person by id\n"
                    + "5. Display all students and teachers\n"
                    + "6. Find the student with the highest GPA\n"
                    + "7. Find teachers by department");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.addPerson();
                    personList.addStudent(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    teacher.addPerson();
                    personList.addTeacher(teacher);
                    break;
                case 3:
                    System.out.print("Nhap ID can cap nhap: ");
                    String ID = sc.nextLine();
                    personList.updatePerson(ID);
                    break;
                case 4:
                    personList.deletePersonById();
                    break;
                case 5:
                    personList.displayEveryone();
                    break;
                case 6:
                    personList.findTopStudent();
                    break;
                case 7:
                    personList.findTeacherByDepartment();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Nhap sai!");
            }
        }
    }
}
