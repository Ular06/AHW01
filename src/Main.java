import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 имена через запятую...");
        String a = scanner.nextLine();
        ArrayList<String> A = new ArrayList<>();
        A.add(a);
        System.out.println(A);


    

        System.out.println("--------------------");

        System.out.println("Введите еще 5 имена через запятую...");
        String b = scanner.nextLine();
        ArrayList<String> B = new ArrayList<>();
        B.add(b);
        System.out.println(B);



        ArrayList<String> C = new ArrayList<>();
       C.addAll(A);
       C.addAll(B);
        System.out.println(C);


        Collections.sort(C);
        System.out.println(C);




        }

    }
