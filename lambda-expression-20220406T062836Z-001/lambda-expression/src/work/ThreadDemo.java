package work;

public class ThreadDemo {

    public static void main(String[] args) throws Exception {

        Runnable r = () -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println(i);


                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };
        Thread t=new Thread(r);
        t.setName("John");
        t.start();

        Runnable r1=() ->{
          for(int i=1; i<=10; i++){
              System.out.println(i*2);

              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

        };

        Thread t2=new Thread(r1);
        t2.start();
    }
}
