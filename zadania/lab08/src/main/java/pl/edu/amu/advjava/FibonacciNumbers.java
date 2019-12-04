package pl.edu.amu.advjava;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

final class FibonacciNumbersExercise {

    /*
         ZADANIE: dopasuj implementację klasy FibonacciSupplier tak, żeby generowała kolejne liczby ciągu
         Fibonacciego.
     */
    static int[] generateFibonacciNumbers(int n) {
        return IntStream.generate(new FibonacciSupplier()).limit(n).toArray();
    }

    /*
     *   ZADANIE: dopasuj implementację wyrażenia lambda tak, żeby generowało kolejne liczby ciągu Fibonacciego.
     */
    static int[] generateFibonacciNumbersWithLambda(int n) {
        return IntStream.generate(() -> {
            Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(n).toArray();
        }
    }

}

final class FibonacciSupplier implements IntSupplier {

    private int a = 0;
    private int b = 1;

    @Override
    public int getAsInt() {
        int c = b;
        b = a+b;
        a = c;
        return a;
    }
}

