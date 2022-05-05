public class Magazine extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;
    private StringBuilder loaiTaiLieu = new StringBuilder("M");

    public Magazine(String NXB, int soBanIn, int soPhatHanh, int thangPhatHanh) {
        super(NXB, soBanIn);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    @Override
    public void setDocCode( int count) {
        super.docCode = loaiTaiLieu.append(count);
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                "docCode=" + super.getDocCode() +
                ", NXB='" + super.getNXB()+ '\'' +
                ", soBanIn=" + super.getSoBanIn() +
                '}';
    }
}
