import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LinkedList<Khach> khach = new LinkedList<>();
        QLKS qlks = new QLKS();

        Scanner input = new Scanner(System.in);
        boolean check = true;
        int key;
        int cmnd;
        int checkInDay;
        int chekOutDay;
        String Phong;

        while (check){
            System.out.println("Chọn công việc");
            System.out.println("1.Check in");
            System.out.println("2.Check out và tính tiền");
            System.out.println("3.Thoát");
            key = input.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Nhập cmnd");
                    cmnd = input.nextInt();
                    while (qlks.checkCMND(cmnd)){
                        System.out.println("CMND bị trùng");
                        cmnd = input.nextInt();
                    }

                    System.out.println("Ngày Checkin");
                    checkInDay = input.nextInt();
                    while (checkInDay<1 || checkInDay>31){
                        System.out.println("Ngày Checkin phải từ 1-31");
                        checkInDay = input.nextInt();
                    }

                    input.skip("\\R?");
                    System.out.println("Nhập hạng phòng");
                    Phong = input.nextLine();

                    while (!Phong.equals("A") && !Phong.equals("B") && !Phong.equals("C")){
                        System.out.println("Chỉ có 3 hạng phòng A, B, C");
                        System.out.println("Nhập hạng phòng");
                        Phong = input.nextLine();
                    }

                    KhachSan room = new KhachSan(Phong);

                    Khach newKhach = new Khach(cmnd,checkInDay,room);
                    qlks.add(newKhach);

                    break;


                case 2:
                    System.out.println("Nhập cmnd");
                    cmnd = input.nextInt();

                    if (!qlks.checkCMND(cmnd)){
                        System.out.println("Khách không tồn tại");
                    } else {
                        System.out.println("Nhập ngày check out");
                        chekOutDay = input.nextInt();
                        qlks.checkOut(cmnd,chekOutDay);
                        qlks.delete(cmnd);
                    }



                    break;

                case 3:
                    check = false;
                    break;

            }
        }
    }
}
