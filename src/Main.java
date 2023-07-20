import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Driver driver=new Driver("Baikal","Asanov",15);
        Car car=new Car("Bugati",'S', driver,"Blue");
         System.out.println(car.toString());
        Scanner scanner= new Scanner(System.in);
        System.out.println("Команды: start, turn left, turn right, stop.");
        for (int i = 0; i < 100; i++) {
            System.out.println("Напишите команду: ");
            System.out.println(car.Mehods(scanner.nextLine()));
        }
    }
}