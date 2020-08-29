package twodimontionalarray;

public class WithLoop {
    public static void main(String[] args) {
        int[][] num2 = new int[3][3];
        num2[0][0] = 0;
        num2[0][1] = 1;
        num2[0][2] = 2;
        num2[1][0] = 3;
        num2[1][1] = 4;
        num2[1][2] = 5;
        num2[2][0] = 6;
        num2[2][1] = 7;
        num2[2][2] = 8;

        for(int row=0; row<3; row++){
            for(int colum =0; colum <3; colum++){
                System.out.print("   " + num2[row][colum]);
            }
            System.out.println();
        }

    }
}
