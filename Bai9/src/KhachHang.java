import java.util.Hashtable;

public class KhachHang {
    private String name;
    private String address;
    private String code;
    private Hashtable<String,BienLai> bienlai = new Hashtable();
    private int count = 1;

    public KhachHang(String name, String address, String code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBienlai(BienLai bienlai) {
        this.bienlai.put(bienlai.getCode(),bienlai);
    }
}
