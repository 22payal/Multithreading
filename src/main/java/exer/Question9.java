package exer;

public class Question9 {
    public static void main(String[] args) throws InterruptedException {
      Thread t1 = new Thread(new Runnable() {
          @Override
          public void run()
          {
             for (int i=1;i<=10;i=i+4)
             {
                 System.out.println("THREAD 1 :"+i);

             }
             }
      },"THREAD 1 :") ;


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
               for(int i=2;i<=10;i=i+4)
               {
                   System.out.println("THREAD 2 :"+i);
               }
            }
        },"THREAD 2 :") ;

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run()
            {

                for(int j=3;j<=10;j=j+4)
                {
                    System.out.println("THREAD 3 :"+j);
                }
            }
        },"THREAD 3 :") ;

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run()
            {

                for(int j=4;j<=10;j=j+4)
                {
                    System.out.println("THREAD 4 : "+j);
                }
            }
        },"THREAD 4 :") ;


     //   System.out.println(nouse.t2.t1.getName());

 t1.start();

 t2.start();
 t3.start();
 t4.start();

 t1.join();
 t2.join();
 t3.join();
 t4.join();



    }
}
