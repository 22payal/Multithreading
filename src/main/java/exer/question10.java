package exer;

public class question10 {
    public static void main(String[] args) throws InterruptedException {
      SharedCounter counter = new SharedCounter();

      Thread t1 =new Thread(new Runnable()
      {
           public void run()
           {
               for (int i = 0;i<1000;i++)
               {
                   counter.increment();
               }
           }
      });

        Thread t2 =new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0;i<1000;i++)
                {
                    counter.increment();
                }
            }
        });

        Thread t3 =new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0;i<1000;i++)
                {
                    counter.increment();
                }
            }
        });

        Thread t4 =new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0;i<1000;i++)
                {
                    counter.increment();
                }
            }
        });

        Thread t5 =new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0;i<1000;i++)
                {
                    counter.increment();
                }
            }
        });




        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("final count is :"+counter.count);
    }
}

 class SharedCounter
{
    int count=0;

   public synchronized void  increment()
    {
    count++;
    }
}

