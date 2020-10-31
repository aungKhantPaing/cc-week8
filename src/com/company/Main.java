package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String leave = "o--|";

        int noOfTestCase = sc.nextInt(); sc.nextLine();

        for (int t = 0; t < noOfTestCase; t++) {
            int n = sc.nextInt(); sc.nextLine();
            System.out.println(leave + "__");
            for (int i = 1; i < n; i++) {
                System.out.print(leave);
                System.out.println(a(i));
            }
            for (int i = n - 1; i >= 1; i--) {
                System.out.print(leave);
                System.out.println(b(i));
            }
            System.out.println(leave);
        }
    }

    public static String a (int n) {
        if (n == 0) return "__";

        if (n%2 == 0) return "__|" + a(--n);
        else return "  |" + a(--n);
    }

    public  static  String b (int n) {
        if (n == 0) return "";

        if (n%2 == 0) return "  |" + b(--n);
        else return "__|" + b(--n);
    }
}
