package pl.pjatk.tdd.arrays;

import java.util.Arrays;

public class ArraysStatistics {
    public static int max(int[] numbers){
        Arrays.sort(numbers);


        return numbers[numbers.length -1];
    }

    public static int min(int[] numbers){
        Arrays.sort(numbers);


        return numbers[0];
    }

    public static double avg(int[] numbers){
        
        int sum = 0;
        for (int i : numbers) {
            sum += i;    
        }

        return (double)sum/numbers.length;
    }

    public static int sum(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum += i;    
        }

        return sum;
    }
}
