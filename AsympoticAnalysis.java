import java.io.FileWriter;

class AsympoticAnalysis {

    static long algorithm(int n) {
        long startTime = System.nanoTime();

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j < n) {
                double k = (double) j;
                while (k < n) {
                    double Sum = i * j * k;
                    k += Math.log10(Math.log10(n));
                }
                j += Math.log10(j + 10);
            }
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        return totalTime;
    }


    public static void main(String[] args) {
        // FileWriter output = new FileWriter("AAResult.txt");
        for (int num = 11; num < Math.pow(2, 18); num += 10) {
            // String result = String.valueOf(algorithm(num));
            // output.write(result);
            System.out.print(num + " ");
            System.out.println(algorithm(num));
        }
    }
}

