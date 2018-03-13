package exer;

class Thread10 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("hello from thread 10:");
    }
}

class Thread9 extends Thread
{
    @Override
    public void run()
    {

        Thread10 t10= new Thread10();
        t10.run();
        try {
            t10.join();
            System.out.println("hello from thread 9 :");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread8 extends Thread
{
    @Override
    public void run()
    {

        Thread9 t9= new Thread9();
        t9.run();
        try {
            t9.join();
            System.out.println("hello from thread 8 :");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



class Thread7 extends Thread
{
    @Override
    public void run()
    {

        Thread8 t8= new Thread8();
        t8.run();
        try {
            t8.join();
            System.out.println("hello from thread 7 :");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Thread6 extends Thread
{
    @Override
    public void run()
    {

        Thread7 t7= new Thread7();
        t7.run();
        try {
            t7.join();
            System.out.println("hello from thread 6 :");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Thread5 extends Thread
{
    @Override
    public void run()
    {

        Thread6 t6= new Thread6();
        t6.run();
        try {
            t6.join();
            System.out.println("hello from thread 5 :");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Thread4 extends Thread
{
    @Override
    public void run()
    {

        Thread5 t5= new Thread5();
        t5.run();
        try {
            t5.join();
            System.out.println("hello from thread 4 :");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
            System.out.println("hello from thread 3 :");
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
            System.out.println("hello from thread 2:");
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
            System.out.println(" hello from Thread 1 :");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class ReverseHello extends Thread
{
    @Override
    public void run() {
        Thread1 t1 =new Thread1();
        t1.run();
    }
}

public class Question4 {
    public static void main(String[] args) {
       ReverseHello t= new ReverseHello();
       t.run();
    }
}
