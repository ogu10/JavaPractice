package Test2_managementSystem;

public class SwapForFL {

    public void swap(int a,int b){
        int x = FreeLength.random[a];
        FreeLength.random[a] = FreeLength.random[b];
        FreeLength.random[b] = x;
    }

}
