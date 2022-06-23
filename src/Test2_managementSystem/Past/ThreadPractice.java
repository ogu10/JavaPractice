public class ThreadPractivce extends Thread {


    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


    public static void main(String[] args) throws InterruptedException {
        ThreadPractivce practivce = new ThreadPractivce();
        practivce.start();



        ThreadPractivce practivce1 = new ThreadPractivce();
        practivce1.start();


    }
}



