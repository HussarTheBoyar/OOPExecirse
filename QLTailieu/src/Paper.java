public class Paper extends TaiLieu{
    private String date;
    private StringBuilder loaiTaiLieu = new StringBuilder("P");

    public Paper(String NXB, int soBanIn, String date) {
        super(NXB, soBanIn);
        this.date = date;
    }

    public void setDocCode( int count) {

        super.docCode = loaiTaiLieu.append(count);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "date='" + date + '\'' +
                "docCode=" + super.getDocCode() +
                ", NXB='" + super.getNXB()+ '\'' +
                ", soBanIn=" + super.getSoBanIn() +
                '}';
    }
}
