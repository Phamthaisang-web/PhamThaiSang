/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

/**
 *
 * @author Pham Thai Sang
 */
public class FlawedAlgorithm {

    public static void main(String[] args) {
        int[] numbers = {11, 42, -5, 27, 0, 89};
        for (int i = 0; i < numbers.length/2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+" ");
        }
        
    }

}
