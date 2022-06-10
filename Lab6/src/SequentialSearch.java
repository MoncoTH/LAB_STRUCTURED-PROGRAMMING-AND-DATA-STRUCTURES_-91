import java.util.Scanner;

public class SequentialSearch {
        public static void main(String[] args) {
            int[] exampleVariableOne = {10001, 10022, 10060, 11255, 15022, 20001, 21002, 23003, 25566, 30078, 40000, 50012,66006};
            int target;
    
            Scanner input = new Scanner(System.in);
    
            System.out.print("Search ID : ");
            target = input.nextInt();
            sequentialSearch(exampleVariableOne, target);
          }
    
          public static void sequentialSearch(int[] parameterOne, int parameterTwo) {
            int index = -1;
            // searches each index of the array until it reaches the last index
            for (int i = 0; i < parameterOne.length; i++) {
              if (parameterOne[i] == parameterTwo) {
                // if the target is found, int index is set as the value of i and
                // the for loop is terminated
                index = i;
                break;
              }
            }
            if (index == -1) {
              System.out.println("Not Found!");
            } else {
              System.out.println("Found at A[" + index + "]");
            }
          }
    }
