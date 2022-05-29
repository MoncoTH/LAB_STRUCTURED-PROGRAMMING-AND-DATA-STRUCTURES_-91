import java.util.Scanner;

public class Lab4ForStd {
    public static int maxsize = 5;
    public static int[] number = new int[maxsize];

    public static void main(String[] args) {
        // Declare variables
        int i;
        try (Scanner scanner = new Scanner(System.in)) {
            for (i = 0; i < maxsize; i++) {
                int num = 0;
                while (num <= 0) {
                    // input
                    System.out.printf("Enqueue Data %d : ", i + 1, number[i]);
                    num = scanner.nextInt();
                    enqueue(i, num);
                }
            }
        }
        if (number.length == maxsize) {
            System.out.printf("Queue is full.");
        }
        dequeue();
    }

    public static void dequeue() {
        // dequeue
        for (int i = 0; i < number.length; i++) {
            System.out.printf("\nDequeue Data %d : %d", i + 1, number[i]);
            number[i] = 0;
        }
        if (number[0] == 0) {
            System.out.println("\nQueue is empty.");
        }
    }

    public static void enqueue(int i, int num) {
        // enqueue
        number[i] = num;
    }

}