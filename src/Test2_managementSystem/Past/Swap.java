package Test2_managementSystem;

public class Swap {

    public void swap(int a,int b){
        int x = NumberingSwap.random[a];
        NumberingSwap.random[a] = NumberingSwap.random[b];
        NumberingSwap.random[b] = x;
    }

}
