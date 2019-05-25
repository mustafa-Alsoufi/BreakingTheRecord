import java.util.Scanner;

public class solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int[] records = new int[2];
        int min=scores[0],max=scores[0],minCounter=0,maxCounter=0;
        
        for (int i=1;i<scores.length;i++)
        {
            if (scores[i] < min)
            {
                min = scores[i];
                minCounter++;
            }
            else if (scores[i] > max)
            {
                max = scores[i];
                maxCounter++;
            }
            records[0] = maxCounter;
            records[1] = minCounter;
        }
        return records;                                                                                                                                                                                                                                               


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.print("Please Enter Number Of Games: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];
        System.out.print("The Scores are: ");
        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        System.out.print("Best \'Highest\' and \'Lowest\' score increased: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}