import java.util.ArrayList;
import java.util.Scanner;

public class QLDC {
    //Them thanh vien vao gia dinh

    public void add(GiaDinh giaDinh, ArrayList<Nguoi> nguoi){
        giaDinh.setThanhVien(nguoi);
    }

    //Them gia dinh vao khu pho

    public void add(KhuPho khuPho, ArrayList<GiaDinh>giaDinhs){
        khuPho.setHoDan(giaDinhs);
    }

    public static void main(String[] args){
        int soHoGiadinh, soThanhVien;
        Scanner input = new Scanner(System.in);
        int cmnd;
        String name;
        int age;
        String job;
        String soNha;



        ArrayList<GiaDinh> Giadinh = new ArrayList<>();
        ArrayList<Nguoi> ThanhVien  = new ArrayList<>();

        System.out.println("Nhập số hộ gia đình trong khu phố");
        soHoGiadinh = input.nextInt();
        System.out.println("Nhập thông tin của từng hộ gia đình");
        for (int i=1; i<=soHoGiadinh;i++){

            System.out.println("Nhập số thành viên của gia đình");
            soThanhVien = input.nextInt();

            System.out.println("Nhập số nhà");
            input.skip("\\R?");
            soNha = input.nextLine();

            GiaDinh giaDinh = new GiaDinh(soThanhVien,soNha);

            for (int j=1;j<=soThanhVien;j++){
                System.out.println("Nhập số CMND");
                cmnd = input.nextInt();
                System.out.println("Nhập tên thành viên");
                input.skip("\\R?");
                name = input.nextLine();
                System.out.println("Nhập tuổi");
                age = input.nextInt();
                System.out.println("Nhập nghề");
                input.skip("\\R?");
                job = input.nextLine();

                Nguoi thanhvien = new Nguoi(cmnd,name,age,job);
                ThanhVien.add(thanhvien);
            }
            giaDinh.setThanhVien(ThanhVien);
            Giadinh.add(giaDinh);
        }

        KhuPho khuPho = new KhuPho(soHoGiadinh);
        khuPho.setHoDan(Giadinh);

        System.out.println(khuPho.toString());;

    }
}
