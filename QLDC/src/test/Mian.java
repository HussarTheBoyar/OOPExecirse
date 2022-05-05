package test;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.skip("\\R?");
        String b = input.nextLine();
        System.out.println(a);
        System.out.println(b);
    }
}
