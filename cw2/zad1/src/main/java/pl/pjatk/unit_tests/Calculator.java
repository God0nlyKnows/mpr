package pl.pjatk.unit_tests;

public class Calculator {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int pow = 1;
        for(int i = 1; i<=n;i++){
            pow *= x;
        }

        return pow;
    }

    public static boolean func2(int x, int y){

        if(x%y == 0){
            return true;
        }else {
            return false;
        }
    }

    public static int func3(int x, int y){

        if (y == 0) 
        {
            return x;  
        }
        else
        {   
            return func3(y, x%y); 
        }
    }

    public static int func4(int x, int n) {
        
        int pow = 0;
        for(int i = 1; i<=n;i++){
            pow += x;
        }

        return pow;
    }
}
