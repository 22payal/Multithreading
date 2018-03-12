package exer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MaxThread extends Thread
{

    private int from,to, max;
    private int arr[]={1,3,4,6,7,8,9,22,55,33,11,2};

    MaxThread(int from ,int to)
    {
        this.from = from;
        this.to = to;
        max = 0;
    }


    public void run( )
    {
        for(int i = from; i <= to; i++)
        {
          if(arr[i]>=max)
            max =arr[i];
        }
    }

    public int getMax( )
    {

        return max;
    }


}


public class Question6 {
    public static void main(String args[]) {


        MaxThread t1 = new MaxThread(0,2);
        MaxThread t2 = new MaxThread(3,5);
        MaxThread t3 = new MaxThread(6,8);
        MaxThread t4 = new MaxThread(9,12);

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


        ArrayList<Integer> list = new ArrayList<> ();

//        System.out.println(t1.getMax());
//        System.out.println(t2.getMax());
//        System.out.println(t3.getMax());
//        System.out.println(t4.getMax());

        list.add(t1.getMax( ));
        list.add(t2.getMax( ));
        list.add(t3.getMax( ));
        list.add(t4.getMax( ));




        System.out.printf("The maximum element of array is %d.\n", Collections.max(list));
    }

}