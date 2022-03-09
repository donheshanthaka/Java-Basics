import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter < 10){
            int order = counter + 1;
            System.out.println("Enter number #" + order);

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                sum += scanner.nextInt();
                counter ++;
            } else {
                System.out.println("Invalid Number!");
            }

            scanner.nextLine(); // handles the next line character
        }
        scanner.close();
        System.out.println("Sum: " + sum);
    }
}