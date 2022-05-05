import java.util.ArrayList;

public class GiaDinh {
    private int soThanhVien;
    private String soNha;
    private ArrayList<Nguoi> thanhVien = new ArrayList<>();

    public GiaDinh(int soThanhVien, String soNha) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
    }

    public void setThanhVien(ArrayList<Nguoi> thanhVien) {
        this.thanhVien = thanhVien;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public StringBuilder getThanhVien() {
        StringBuilder result = new StringBuilder();
        thanhVien.forEach(nguoi -> result.append(nguoi.toString()));
        return result;
    }

    @Override
    public String toString() {
        return "GiaDinh{" +
                "soThanhVien=" + soThanhVien +
                ", soNha='" + soNha + '\'' +
                ", thanh vien ="+getThanhVien()+ '\'' +
                '}';
    }
}
