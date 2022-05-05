import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Truong truong = new Truong();
        String name, country;
        int age;
        boolean check = true;

        while (check){
            System.out.println("Nhập tên học sinh");
            input.skip("\\R?");
            name = input.nextLine();

            System.out.println("Nhập quê học sinh");
            input.skip("\\R?");
            country = input.nextLine();

            System.out.println("Nhập tuổi");
            age = input.nextInt();

            HocSinh hocSinh = new HocSinh(name,country,age);
            truong.add(hocSinh);

            System.out.println("Bấm 1 để thoát, số bất kì để nhập tiếp");;
            int cond = input.nextInt();
            if (cond == 1){
                check = false;
            } else {
                continue;
            }
        }

        truong.show20();
        truong.showAgeCountry();


    }
}
