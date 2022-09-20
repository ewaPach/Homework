import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! what's your name?");
        String name = scanner.nextLine();
        System.out.println("Please enter your last name.");
        String lastName = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if(age<21) {
            System.out.println(name + " " + lastName + ", you are too young to come in.");
        }else {
            System.out.println(name + " " + lastName + ", you can come in.");
        }



            }
}
