package Variables;
import java.util.Scanner;
public class patient {public static void main(String[] args) {
    //Enter your code here:
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter seconds:");
    int inputSeconds = scan.nextInt();

    int hours, minutes, seconds;

    hours = inputSeconds/3600;
    minutes = inputSeconds/60%60;
    seconds = inputSeconds%3600%60%60;

    System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");


}
}
