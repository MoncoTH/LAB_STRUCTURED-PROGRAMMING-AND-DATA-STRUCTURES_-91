import java.util.Scanner;
import java.util.Arrays;

public class queue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] queue = new int[5];
        int i, j = 1;

        for (i = 0; i < 5; i++) {
            System.out.print("Enqueue Data " + j++ + " : ");
            queue[i] = input.nextInt();
            if (queue[i] <= 0) {
                i--;
                j--;
            }
        }
        System.out.println("\nQueue is full.\n");

        j = 1;
        for (i = 0; i < 5; i++) {

            System.out.println("Dequeue Data " + j++ + " : " + queue[i]);
        }

        System.out.println("\nQueue is Empty.");
    }

}