public class TheMuonSach {
    private Integer code;
    private String ngayMuon;
    private int hanMuon;
    private String codeBook;
    private HocSinh nguoiMuon;

    public TheMuonSach(String ngayMuon, int hanMuon, String codeBook, HocSinh nguoiMuon) {
        this.ngayMuon = ngayMuon;
        this.hanMuon = hanMuon;
        this.codeBook = codeBook;
        this.nguoiMuon = nguoiMuon;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getHanMuon() {
        return hanMuon;
    }

    public void setHanMuon(int hanMuon) {
        this.hanMuon = hanMuon;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public HocSinh getNguoiMuon() {
        return nguoiMuon;
    }

    public void setNguoiMuon(HocSinh nguoiMuon) {
        this.nguoiMuon = nguoiMuon;
    }

    @Override
    public String toString() {
        return "TheMuonSach{" +
                "code=" + code +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanMuon=" + hanMuon +
                ", codeBook='" + codeBook + '\'' +
                ", nguoiMuon=" + nguoiMuon.toString() +
                '}';
    }
}
