public class multiDimArray {
    public static void main(String[] args) {
        int[][] m1 = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3},
        };
        int[][] m2 = {
                {3, 3, 3},
                {2, 2, 2},
                {1, 1, 1},
        };
        int[][] result = new int[3][3];
        if (m1.length != m2.length)
            System.out.println("Arrays are not of same size");
        else
        {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1.length; j++) {
                    result[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(result[i][j]+"  ");
                }
                System.out.println();
            }
        }
    }
}
