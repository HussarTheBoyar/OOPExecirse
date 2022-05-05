import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        QLXe docManager = new QLXe();
        Scanner input = new Scanner(System.in);
        int bookCount, magazineCount, paperCount;
        bookCount = magazineCount = paperCount =1;

        LinkedHashSet typeTable = new LinkedHashSet<>();
        typeTable.add("A");
        typeTable.add("B");
        typeTable.add("M");
        typeTable.add("P");

        int soBanIn = 0;
        int page = 0;
        int soPhatHanh = 0;
        int thangPhatHanh = 0;
        String date = "00/00/0000";
        String tacgia;
        int key;
        String officerKey;


        boolean check = true;

        while (check){
            System.out.println("Nhập vào hoạt động bạn muốn thực hiện");
            System.out.println("1.Nhập thêm tài liệu");
            System.out.println("2.Tìm kiếm tài liệu theo mã");
            System.out.println("3.Hiển thị danh sách tài liệu");
            System.out.println("4.Xóa tài liệu theo mã");
            System.out.println("5.Thoát");

            key = input.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Nhập nhà xuất bản");
                    input.skip("\\R?");
                    String NXB = input.nextLine();
                    //System.out.println(name);

                    System.out.println("Nhập số bản in của tài liệu");
                    soBanIn = 0;
                    while (soBanIn<=0){
                        try {
                            soBanIn = input.nextInt();
                        }catch (Exception e){
                            System.out.println("Số bản in phải là số nguyên dương");
                            //System.out.println(e);
                        }
                    }


                    System.out.println("Chọn kiểu tài liệu muốn nhập:");
                    System.out.println("B: Sách");
                    System.out.println("M: Tạp chí");
                    System.out.println("P: Báo");

                    input.skip("\\R?");
                    officerKey = input.nextLine();

                    switch (officerKey){
                        case "B":
                            System.out.println("nhập tên tác giả");
                            input.skip("\\R?");
                            tacgia = input.nextLine();
                            System.out.println("Nhập số trang sách");
                            page = 0;
                            while (page<=0){
                                try {
                                    page = input.nextInt();
                                }catch (Exception e){
                                    System.out.println("Số trang phải là số nguyên dương");
                                    //System.out.println(e);
                                }
                            }
                            TaiLieu book = new Book(NXB,soBanIn,tacgia,page);
                            book.setDocCode(bookCount);
                            bookCount++;
                            docManager.addDoc(book);
                            break;
                        case "M":
                            System.out.println("Nhập só phát hành");
                            while (soPhatHanh<=0){
                                try {
                                    soPhatHanh = input.nextInt();
                                }catch (Exception e){
                                    System.out.println("Số phát hành phải là số nguyên dương");
                                }
                            }
                            System.out.println("Nhập tháng phát hành (1-12)");
                            while (thangPhatHanh<=0||thangPhatHanh>12){
                                try {
                                    thangPhatHanh = input.nextInt();
                                }catch (Exception e){
                                    System.out.println("Tháng phát hành phải nằm trong khoảng 1-12");
                                }
                            }
                            TaiLieu magazine = new Magazine(NXB,soBanIn,soPhatHanh,thangPhatHanh);
                            magazine.setDocCode(magazineCount);
                            magazineCount++;
                            docManager.addDoc(magazine);
                            break;
                        case "P":
                            System.out.println("Nhập ngày tháng của báo (dd/mm/yyyy)");
                            while (docManager.checkDate(date)){
                                try {
                                    input.skip("\\R?");
                                    date = input.nextLine();
                                }catch (Exception e){
                                    System.out.println("Ngày tháng phải theo đúng form dd/mm/yyyy");
                                }
                            }
                            TaiLieu paper = new Paper(NXB,soBanIn,date);
                            paper.setDocCode(paperCount);
                            paperCount++;
                            docManager.addDoc(paper);
                            break;
                    }

                    break;


                case 2:
                    System.out.println("Nhập mã tài liệu");
                    input.skip("\\R?");
                    String searchCode = input.nextLine();
                    boolean loopCheck = true;
                    while (loopCheck){
                        if (!docManager.checkCode(searchCode)){
                            System.out.println("Mã tài liệu bị sai cú pháp, nhấn 1 để nhập lại, 2 để thoát khỏi chức năng");
                            int condCheck = input.nextInt();
                            if (condCheck == 2){
                                break;
                            }else {
                                System.out.println("Nhập mã tài liệu");
                                input.skip("\\R?");
                                searchCode = input.nextLine();
                            }
                        }else {
                            docManager.searchCode(searchCode);
                            loopCheck = false;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Nhập loại tài liệu bạn muốn xem danh sách:");
                    System.out.println("A: Xem toàn bộ tài liệu");
                    System.out.println("B: Sách");
                    System.out.println("M: Tạp chí");
                    System.out.println("P: Báo");
                    input.skip("\\R?");
                    String type = input.nextLine();
                    loopCheck = true;
                    while (loopCheck){
                        if (!typeTable.contains(type)){
                            System.out.println("Lựa chọn sai, chọn 1 để nhập lại, chọn 2 để thoát khỏi tính năng");
                            int condCheck = input.nextInt();
                            if (condCheck == 2){
                                break;
                            }else {
                                System.out.println("Nhập loại tài liệu, chú ý chỉ gồm A-B-M-P");
                                input.skip("\\R?");
                                type = input.nextLine();
                            }
                        }else {
                            docManager.Show(type);
                            loopCheck = false;
                        }
                    }

                    break;

                case 4:
                    System.out.println("Nhập mã tài liệu cần xóa");
                    input.skip("\\R?");
                    searchCode = input.nextLine();
                    loopCheck = true;
                    while (loopCheck){
                        if (!docManager.checkCode(searchCode)){
                            System.out.println("Mã tài liệu bị sai cú pháp, nhấn 1 để nhập lại, 2 để thoát khỏi chức năng");
                            int condCheck = input.nextInt();
                            if (condCheck == 2){
                                break;
                            }else {
                                System.out.println("Nhập mã tài liệu");
                                input.skip("\\R?");
                                searchCode = input.nextLine();
                            }
                        }else {
                            docManager.deleteDoc(searchCode);
                            loopCheck = false;
                        }
                    }
                    break;

                case 5:
                    check =false;
                    break;

            }

        }

    }
}
