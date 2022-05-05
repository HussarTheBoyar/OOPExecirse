public class Book extends TaiLieu{
    private String TacGia;
    private int Page;
    private StringBuilder loaiTaiLieu = new StringBuilder("B");

    public Book(String NXB, int soBanIn, String tacGia, int page) {
        super( NXB, soBanIn);
        TacGia = tacGia;
        Page = page;
    }

    public void setDocCode( int count) {
        super.docCode = loaiTaiLieu.append(count);
    }

    public StringBuilder getLoaiTaiLieu() {
        return loaiTaiLieu;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "TacGia='" + TacGia + '\'' +
                ", Page=" + Page +
                ", docCode=" + super.getDocCode() +
                ", NXB='" + super.getNXB()+ '\'' +
                ", soBanIn=" + super.getSoBanIn() +
                '}';
    }
}
