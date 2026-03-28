import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class numericalAnalysisApp {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        // not sure why there is an error under console? - because I didnt close it?

        System.out.print("Enter input file name: ");
        String fileName = console.nextLine();

        Scanner input = new Scanner(new File(fileName));

        int count = 0;
        double sum = 0;

        // initialize min and max properly
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        while (input.hasNextDouble()) {
            double num = input.nextDouble();

            count++;
            sum += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        input.close();

        double average = sum / count;
        double range = max - min;

        System.out.println("\nResults:");
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        System.out.println("Range: " + range);
    }
}
    
