import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double salary;
        double bonus;
        double penaty;
        double realSalary;
        String name;
        int age;
        String hometown;
        String id;

        QLGV qlgv = new QLGV();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        int key;
        Integer count = 0;

        while (check){


            System.out.println("Nhập phương thức");
            System.out.println("1.Nhập thêm cán bộ");
            System.out.println("2.Hiển thị danh sách cán bộ");
            System.out.println("3.Thoát");
            key = input.nextInt();


            switch (key) {
                case 1:

                    System.out.println("Nhập tên");
                    input.skip("\\R?");
                    name = input.nextLine();

                    System.out.println("Nhập địa chỉ");
                    input.skip("\\R?");
                    hometown = input.nextLine();

                    count++;
                    id = count.toString();

                    System.out.println("Nhập tuổi");
                    age = input.nextInt();
                    while (age>70||age<18){
                        System.out.println("Nhập lại tuổi từ 18-70");
                        age = input.nextInt();
                    }

                    System.out.println("Nhập lương");
                    salary = input.nextDouble();

                    System.out.println("Nhập thưởng");
                    bonus = input.nextDouble();

                    System.out.println("Nhập phạt");
                    penaty = input.nextDouble();

                    Nguoi giaoVien = new Nguoi(salary,bonus,penaty,name,age,hometown);
                    giaoVien.setRealSalary();
                    giaoVien.setId(id);
                    qlgv.add(giaoVien);

                    break;


                case 2:
                    qlgv.show();
                    break;

                case 3:
                    check = false;
                    break;

            }

        }

    }
}
