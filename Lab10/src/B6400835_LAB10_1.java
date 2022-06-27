import java.util.Scanner;

public class B6400835_LAB10_1 {
    private int n;

    private int[][] g = new int[10][10];

    B6400835_LAB10_1(int x) {
        this.n = x;
        int i, j;

        for (i = 0; i < n; ++i) {
            for (j = 0; j < n; ++j) {
                g[i][j] = 0;
            }
        }
    }

    public void AdjacencyMatrixdisplay() {
        System.out.print("Adjacency Matrix:\n");
        System.out.print("  | ");

        for (int i = 0; i < n; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < n; ++i) {
            System.out.print("---");
        }

        for (int i = 0; i < n; ++i) {

            System.out.println();
            System.out.print(i + " |");
            for (int j = 0; j < n; ++j)

            {
                System.out.print(" " + g[i][j]);
            }
        }
    }

    public void addEdge(int x, int y, int i) {

        if ((x >= n) || (y > n)) {
            System.out.println("Vertex does not exists!");
        } else {

            g[y][x] = 1;
            g[x][i] = 1;
            g[x][y] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many vertices?: ");
        int nodeCount = input.nextInt();

        B6400835_LAB10_1 wanttosleep = new B6400835_LAB10_1(nodeCount); 

        for (int i = 0; i < nodeCount; i++) {
            System.out.println("Adjacent of vertex : " + i);

            while (true) {
                int src = input.nextInt();
                if (src == -1)
                    break;
                int dest = input.nextInt();

                wanttosleep.addEdge(i, src, dest);
            }

        }
        wanttosleep.AdjacencyMatrixdisplay();

    }
}
