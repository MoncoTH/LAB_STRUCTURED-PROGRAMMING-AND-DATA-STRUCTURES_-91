import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {00000, 11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999};

        System.out.print("Search ID: ");
        int SearchID = input.nextInt();
        int index = binarySearch(arr, 0,arr.length-1,SearchID);

        if (index != -1){
            System.out.println("Found at Number[" + index + "] : " + arr[index]);
        }
        else{
            System.out.println("Not Found!!");
        }
    }
    private static int binarySearch(int[] arr, int start, int end, int SearchID){
        while (start <= end){
            int middle = (start + end)/2;
            System.out.println("high: " + end + " mid:"+ middle + " low: " + start);

            if(SearchID == arr[middle]){
                return middle;
            }
            if(SearchID < arr[middle]){
                end = middle - 1;
            }
            else {
                start = middle +1;
            }
        }

        return -1;
    }
}

/*
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠴⠶⠶⠦⢤⣀⠀⠀⠀⠀⠀
⠀⠀⢀⡠⠖⠛⠉⠉⠙⠓⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠀⢀⡀⠀⠀⠈⠳⣄⠀⠀⠀
⠀⣠⠋⠀⠀⢀⣤⣤⡀⠀⠀⠙⢦⠀⢀⣀⣀⣀⣀⣤⣤⣤⣄⣠⡏⠀⠀⢠⣾⣿⣿⣷⣄⠀⠀⠘⣆⠀⠀
⢰⠃⠀⠀⣴⣿⣿⣿⣿⡆⠀⠀⠘⠛⠉⠉⠉⠁⠀⠀⠀⠀⠀⠈⠁⠀⠀⢸⣿⣿⣿⣿⡿⠀⠀⠀⢸⠀⠀
⢻⡀⠀⠀⠻⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠋⠁⠀⠀⢀⡟⠀⠀
⠈⢳⡀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣄⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣏⠁⠀⠀ ⠀⠀⠀⠀⠀           
⠀⠀⠙⣶⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⠟⠛⢿⣦⠀⠀⠀⠀⠀⢀⡤⠤⠦⢤⣀⠀⠀⠈⢣⡀⠀
⠀⠀⣼⠁⠀⠀⢀⣠⠶⠒⠒⠶⡄⠀⠀⣼⡿⠁⠀⠀⠈⢻⣧⡀⠀⠀⢰⡇⠀⡀⠀⠀⠈⢳⡀⠀⠀⢳⡀
⠀⢰⠇⠀⢀⠖⠉⠀⠀⠀⠀⠀⣿⠀⢠⣿⠇⠀⠀⠀⠀⠈⢿⣧⠀⠀⠈⠳⣀⠀⠀⠀⠀⢀⡷⠀⠀⠈⣧
⠀⣾⠀⠀⡟⠀⠀⠀⠀⠀⢀⣴⠋⠀⢸⣿⠀⠀⠀⠀⠀⠀⠘⣿⣧⠀⠀⠀⠈⠉⠓⠒⠒⠋⠁⠀⠀⠀⣿
⠀⢹⡄⠀⠙⠲⠤⠤⠴⠖⠋⠁⠀⠀⢸⡿⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿
⠀⠘⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣸⠃
⠀⠀⠈⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠋⠀
⠀⠀⠀⠀⠱⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠀
⠀⠀⠀⠀⠀⠈⠑⠦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⠞⠋⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠲⠦⢤⣤⣀⣀⣀⣀⣀⣀⣀⣠⣀⣠⡤⠤⠴⠒⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ 

 */