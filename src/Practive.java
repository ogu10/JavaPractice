public class Practive {

    public int a = 1;
    public int b = 2;
    public final int c = 3;
    public static int d = 4;
    public static final int e = 5;


    public void test1() {
        a = a + 2;
        System.out.println(this.a);
    }


    public void test2() {

        int a = 10;

        System.out.println(a);
        System.out.println(this.a);
    }


    public void test3() {

        System.out.println(a);
    }


    public static void main(String[] args) {
        Practive pv = new Practive();
        pv.test1();
        pv.test2();
        pv.test3();
    }
}
