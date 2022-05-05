import java.util.ArrayList;

public class KhuPho {
    private int soHoDan;
    private ArrayList<GiaDinh> HoDan = new ArrayList<>();

    public KhuPho(int soHoDan) {
        this.soHoDan = soHoDan;
    }

    public void setHoDan(ArrayList<GiaDinh> hoDan) {
        HoDan = hoDan;
    }


    public StringBuilder getHoDan() {
        StringBuilder result = new StringBuilder();
        HoDan.forEach(nguoi -> result.append(nguoi.toString()));
        return result;
    }

    @Override
    public String toString() {
        String result = "KhuPho{" +
                "soHoDan=" + soHoDan +
                ", HoDan=" + getHoDan() +
                '}';
        return result;
    }
}
