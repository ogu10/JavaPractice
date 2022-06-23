public class ThreadPractice extends Thread {


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
        ThreadPractice practivce = new ThreadPractice();
        practivce.start();



        ThreadPractice practivce1 = new ThreadPractice();
        practivce1.start();


    }
}



