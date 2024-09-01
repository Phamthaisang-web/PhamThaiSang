package buoi8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Huy1");
        names.add("Huy2");
        names.add("Huy3");

        System.out.println("names[] = " + Arrays.toString(names.toArray()));
        System.out.println("names[0] = " + names.get(0));
        System.out.println(names.remove("Huy2"));
        System.out.println(names.remove(1));
        System.out.println("names[] = " + Arrays.toString(names.toArray()));
    }
}
