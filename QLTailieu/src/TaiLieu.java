public abstract class TaiLieu {
    protected StringBuilder docCode = new StringBuilder();
    private String NXB;
    private int soBanIn;

    public TaiLieu( String NXB, int soBanIn) {
        this.NXB = NXB;
        this.soBanIn = soBanIn;
    }


    public String getDocCode() {
        return docCode.toString();
    }

    public abstract void setDocCode(int count);

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getSoBanIn() {
        return soBanIn;
    }

    public void setSoBanIn(int soBanIn) {
        this.soBanIn = soBanIn;
    }

}
