import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        Date dt = sdf.parse("31/2/1999");
        System.out.println(dt);

        String name;
        int age;
        String Lop;
        String ngayMuon;
        int hanMuon;
        String codeBook;
        Integer code;

        boolean check = true;
        QLMS qlms = new QLMS();
        Scanner input = new Scanner(System.in);
        int key;
        Integer count = 0;

        while (check){
            System.out.println("Nhập phương thức");
            System.out.println("1.Thêm dữ liệu mượn sách");
            System.out.println("2.Xóa thẻ mượn sách");
            System.out.println("3.Tìm kiếm thông tin thẻ mượn sách");
            System.out.println("4.Thoát");
            key = input.nextInt();

            switch (key) {
                case 1:

                    System.out.println("Nhập tên");
                    input.skip("\\R?");
                    name = input.nextLine();

                    System.out.println("Nhập lớp");
                    input.skip("\\R?");
                    Lop = input.nextLine();

                    code = count++;

                    System.out.println("Nhập tuổi");
                    age = input.nextInt();
                    while (age>70||age<18){
                        System.out.println("Nhập lại tuổi từ 18-70");
                        age = input.nextInt();
                    }

                    HocSinh hocSinh = new HocSinh(name,age,Lop);

                    System.out.println("Nhập ngày mượn");
                    input.skip("\\R?");
                    ngayMuon = input.nextLine();
                    while (!qlms.checkDate(ngayMuon)){
                        System.out.println("Nhập lại ngày mượn");
                        input.skip("\\R?");
                        ngayMuon = input.nextLine();
                    }

                    System.out.println("Nhập mã số sách");
                    input.skip("\\R?");
                    codeBook = input.nextLine();

                    System.out.println("Nhập hạn mượn");
                    hanMuon = input.nextInt();

                    TheMuonSach theMuonSach = new TheMuonSach(ngayMuon,hanMuon,codeBook,hocSinh);
                    theMuonSach.setCode(code);
                    qlms.add(theMuonSach);

                    break;


                case 2:
                    System.out.println("Nhập mã số thẻ");
                    code = input.nextInt();
                    qlms.delete(code);
                    break;

                case 3:
                    System.out.println("Nhập mã số thẻ");
                    code = input.nextInt();
                    qlms.search(code);
                    break;

                case 4:
                    check = false;
                    break;
            }
        }

    }
}
