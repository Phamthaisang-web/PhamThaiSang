
package lecture4vs5;



public class While {
    public static void main(String[] args) {
        int n=91;
        int factor=2;
        while(n%factor!=0){
            factor++;
        }
        System.out.println("First factor is "+factor);
    }
}
