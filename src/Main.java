public class Main {
    public static void main(String[] args) {

//        int[][] a = new int[10][10];
//        int s = 1;
//        //заполняем с 1-го
//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//            for (int j = 0; j < 10; j++) {
//                a[i][j] = s++;
//                System.out.print(a[i][j]);
//                System.out.print(" ");
//            }
//        }


        int[][] result = new int[4][5];


        for (int i = 0; i < result.length; i++)
            result[i] = new int[i + 1];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();


        }
    }
}