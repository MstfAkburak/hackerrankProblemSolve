import java.util.Scanner;

public class JavaPrimalityTestProblems {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);)
        {
            System.out.println(scanner.nextBigInteger().isProbablePrime(1) ? "prime" : "not prime");
        }
    }

}
