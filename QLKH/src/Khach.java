public class Khach {
    private int cmnd;
    private int checkInDay;
    private int chekOutDay;
    private KhachSan phong;

    public Khach(int cmnd, int checkInDay, KhachSan phong) {
        this.cmnd = cmnd;
        this.checkInDay = checkInDay;
        this.phong = phong;
    }

    public KhachSan getPhong() {
        return phong;
    }

    public void setPhong(KhachSan phong) {
        this.phong = phong;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getCheckInDay() {
        return checkInDay;
    }

    public void setCheckInDay(int checkInDay) {
        this.checkInDay = checkInDay;
    }

    public int getChekOutDay() {
        return chekOutDay;
    }

    public void setChekOutDay(int chekOutDay) {
        this.chekOutDay = chekOutDay;
    }
}
