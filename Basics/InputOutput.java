import java.util.Scanner;

public class InputOutput {
    public void printNumber(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        InputOutput ip = new InputOutput();
        ip.printNumber(sc);
    }
}
