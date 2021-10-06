

public class SubjectEvaluation {
    public static void main(String[] args) {
        if (args.length<=0){
            System.out.println("Brak ocen cząstkowych, zatem ocena finalna to 2.0");
            return;
        }
        double[] results = new double[args.length];
        for (int i=0; i<args.length; i++){
            results[i] = Double.parseDouble(args[i]);
        }
        double finalMark = evaluate(results);
        System.out.println(String.format("Finalna ocena to %.1f", finalMark));
    }

    public static double evaluate(double ... percentages){
        double overallPercentage = sum(percentages)/percentages.length;

        if (overallPercentage<0.5){
            return 2.0;
        }else {
            return 3.0 + 0.5 * (int)((overallPercentage - 0.5)/0.1);
        }
    }

    private static double sum(double[] percentages) {
        double sum=0;
        for (double percentage:percentages){
            sum+= percentage;
        }
        return sum;
    }
}