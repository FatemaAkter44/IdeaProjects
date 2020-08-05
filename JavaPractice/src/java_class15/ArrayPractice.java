package java_class15;

import java.util.Scanner;

public class ArrayPractice {

    public void testArray(){
        int[] id = new int[4];
        id[0] =101;
        id[1]= 102;
        id[2]=103;
        id[3]=104;

        System.out.println(id);

    }
    public void testArrayManual(){
        int[] ids = new int[4];
        ids[0] =101;
        ids[1]= 102;
        ids[2]=103;
        ids[3]=104;
        //ids[4]=105;

        System.out.println(ids[0]);
        System.out.println(ids[3]);
    }
    public static void textForLoop(){

    }

    public void salary(){
        float[] salaryEmp = new float[4];
        salaryEmp[0]=5000.30f;
        salaryEmp[3]=5000.50f;
        int sum = (int)salaryEmp[0]+(int)salaryEmp[3];
        float sum1 = salaryEmp[0]+salaryEmp[1];
        System.out.println(sum1);
        System.out.println("Array custing and addition: " + sum);
        System.out.println(salaryEmp[2]);
        System.out.println(salaryEmp.length);


    }
    public void testTwoArray(){
        int[] x = new int[2], y = new int[3], z = new int[3];

    }

    public static void userInputArray(){
        Scanner input = new Scanner(System.in);
        double[] number = new double[4];
        double sum =0;
        System.out.println("please enter four numbers: ");
       try {
           number[0] = input.nextDouble();
           number[1] = input.nextDouble();
           number[2] = input.nextDouble();
           number[3] = input.nextDouble();
           number[4] = input.nextDouble();
       }
       catch(Exception problem){
           problem.printStackTrace();
       }
        sum = number[0]+number[1]+number[2]+number[3]+number[3];
        System.out.println("sum = " + sum);
        int c = number.length;
        System.out.println("length of array: " + c);

    }
     public void userInputLoop(){
        Scanner s= new Scanner(System.in);
        int[] num = new int[4];
        int sumLoop = 0;
        int l=num.length;
         System.out.print("please enter 100 number: ");
        for(int i = 0; i<l; i++){
            num[i] =s.nextInt();
        }
        for(int i =0; i<4; i++){
            sumLoop = sumLoop + num[i];
        }

         System.out.println("total sum : " + sumLoop);
         System.out.println("length : " + l);
         //System.out.println("average: " + (sumLoop/l));
         double avg =(double)sumLoop/(double)l;
         System.out.println(avg);
     }


    public static void main(String[] args) {
        ArrayPractice test = new ArrayPractice();
        //test.userInputLoop();
        //test.testArray();

        //test.testArrayManual();
        //test.salary();
        test.userInputArray();

        AneDimArray demo = new AneDimArray();



    }
}
