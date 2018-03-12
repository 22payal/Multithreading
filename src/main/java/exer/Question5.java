package exer;

import java.util.Scanner;

class SumThread extends Thread
{

    private int from,to, sum=0;
    private int arr[]={1,3,4,6,7,8,9,22,55,33,11,2};

    SumThread(int from ,int to)
    {
        this.from = from;
        this.to = to;
        sum = 0;
    }


    public void run( )
    {
        for(int i = from; i <= to; i++)
        {

            sum +=arr[i];
        }
    }

    public int getSum( )
    {

        return sum;
    }


}


public class Question5 {
    public static void main(String args[]) {

//
//        System.out.println("enter how many elements of an array");
//
//        Scanner in = new Scanner(System.in);
//
//        int num = in.nextInt();
//
//        int arr[]=new int[num];
//
//        System.out.println("enter elements");
//
//        for(int i=0;i<num;i++){//for reading array
//            arr[i]=in.nextInt();
//
//        }

//        int a=arr[0];
//        int b=arr[num/4];
//        int x=arr[num/2];
//        int c= arr[3*num/4];
//
//

        SumThread t1 = new SumThread(0,2);
        SumThread t2 = new SumThread(3,5);
        SumThread t3 = new SumThread(6,8);
        SumThread t4 = new SumThread(9,12);

        t1.start( );
        t2.start( );
        t3.start();
        t4.start();

        /* wait for the threads to finish! */
        try {
            t1.join( );
            t2.join( );
            t3.join();
            t4.join();

        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }


        int d =t1.getSum( ) + t2.getSum( ) +t3.getSum()+t4.getSum();

        System.out.printf("The sum of array is %d.\n", d);
    }
}