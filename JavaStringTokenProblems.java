import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaStringTokenProblems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String splits[] = s.split("[!,?._'@ ]");
        splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
        System.out.println(splits.length);
        for (String z : splits)
            System.out.println(z);
    }
}

