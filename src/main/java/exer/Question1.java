package exer;

class Question1 {

    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
        t.join();
        t2.join();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<=20;i++) {
            if (i%2==0)
            System.out.println("Even : "+i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=0;i<=20;i++) {
            if(i%2!=0)
            System.out.println("Odd :"+i);
        }
    }
}
