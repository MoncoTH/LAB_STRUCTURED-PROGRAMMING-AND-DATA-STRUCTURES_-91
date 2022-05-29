import java.util.*;

class SimpleArray {
    String[] a; // ref to array

    public SimpleArray(int size) // constructor
    {
        a = new String[size];
    }

    public void setValue(int index, String value) // set value
    {
        a[index] = value;
    }

    public String getValue(int index) // get value
    {
        return a[index];
    }
}

public class Stack {

    public static void main(String[] args) {
        int i, j = 1;
        String msg;

        try (Scanner input = new Scanner(System.in)) {
            SimpleArray arr = new SimpleArray(5);

            for (i = 0; i < 5; i++) {
                System.out.print("Push Data " + j + " : ");
                msg = input.next();
                arr.setValue(i, msg);
                j++;
            }
            j = 1;
            System.out.println("");
            for (i = 5; i > 0; i--) {
                System.out.println("Pop Data " + (j) + " : " + arr.getValue(i - 1));
                j++;
            }
            input.close();
        }
    }

}
