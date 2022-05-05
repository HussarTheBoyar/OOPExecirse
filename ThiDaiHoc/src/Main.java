import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        QLHS qlhs = new QLHS();
        Scanner input = new Scanner(System.in);

        String name;
        String Khoi;
        int sbd;

        int key;


        boolean check = true;

        while (check){
            System.out.println("Nhập vào hoạt động bạn muốn thực hiện");
            System.out.println("1.Nhập thêm học sinh");
            System.out.println("2.Tìm kiếm theo SBD");
            System.out.println("3.Hiển thị danh sách thí sinh");
            System.out.println("4.Thoát");

            key = input.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Nhập tên học sinh");
                    input.skip("\\R?");
                    name = input.nextLine();
                    //System.out.println(name);

                    System.out.println("Nhập SBD");
                    sbd = 0;
                    while (sbd<=0){
                        try {
                            sbd = input.nextInt();
                        }catch (Exception e){
                            System.out.println("SBD là số nguyên dương");
                            //System.out.println(e);
                        }
                    }


                    System.out.println("Nhập khối thi");
                    input.skip("\\R?");
                    Khoi = input.nextLine();

                    while (!(Khoi.equals("A") || Khoi.equals("B") || Khoi.equals("C") )){
                        System.out.println("Khối thi chỉ gồm A, B, C");
                        input.skip("\\R?");
                        Khoi = input.nextLine();
                    }

                    HocSinh hs = new HocSinh(name,sbd,Khoi);
                    qlhs.add(hs);

                    break;


                case 2:
                    System.out.println("Nhập SBD");
                    sbd = input.nextInt();
                    qlhs.search(sbd);
                    break;

                case 3:
                    qlhs.show();

                    break;


                case 4:
                    check =false;
                    break;

            }

        }

    }
}
