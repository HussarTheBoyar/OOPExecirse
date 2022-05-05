public class HocSinh {
    private String name;
    private int SBD;
    private String Khoi;
    private  String MonThi;

    public String getName() {
        return name;
    }

    public HocSinh(String name, int SBD, String khoi) {
        this.name = name;
        this.SBD = SBD;
        Khoi = khoi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSBD() {
        return SBD;
    }

    public void setSBD(int SBD) {
        this.SBD = SBD;
    }

    public String getKhoi() {
        return Khoi;
    }

    public void setKhoi(String khoi) {
        Khoi = khoi;
    }

    private void getMonThi(){
        switch (Khoi){
            case "A":
                MonThi = "Toan, Ly, Hoa";
                break;
            case "B":
                MonThi = "Toan, Hoa, Sinh";
                break;
            case "C":
                MonThi = "Van, su, Dia";
                break;
        }
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "name='" + name + '\'' +
                ", SBD=" + SBD +
                ", Khoi='" + Khoi + '\'' +
                ", Mon Thi='" + MonThi + '\'' +
                '}';
    }
}
