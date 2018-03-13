package exer;

class Thread4 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("in thread 4:");
    }
}

class Thread3 extends Thread
{
    @Override
    public void run()
    {

        Thread4 t4= new Thread4();
        t4.run();
        try {
            t4.join();
            System.out.println("in thread 3 :");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread
{
    @Override
    public void run()
    {
        Thread3 t3 = new Thread3();
       t3.run();
        try {
            t3.join();
            System.out.println("in thread 2:");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Thread1 extends Thread
{
    @Override
    public void run()
    {
        Thread2 t2 =new Thread2();
        t2.run();
        try {
            t2.join();
            System.out.println(" in Thread 1 :");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

public class Question4 {
    public static void main(String[] args) {
       Thread1 t1= new Thread1();
       t1.run();
    }
}
