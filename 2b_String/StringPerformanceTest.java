package github;
public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;
        String textToAppend = "AIET";

        // Testing StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(textToAppend);
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

        // Testing StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(textToAppend);
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("\nStringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("\nStringBuffer is faster than StringBuilder.");
        }
    }
}
