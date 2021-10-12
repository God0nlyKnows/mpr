package pl.pjatk.unit_tests;

public class PrimeNumber {
    public static boolean isPrimeNumber(int number){
        if (number<=1){
            return false;
        }
        for (int i=2; i<=number/2;i++){
            if (number%i==0){
                System.out.println(String.format("Dividable by %d", i));
                return false;
            }
        }
        return true;
    }
}
