public class BienLai {
    private String Code;
    private double oldIndex;
    private double newIndex;

    public BienLai(double oldIndex, double newIndex) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public double getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }

    public double getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getCode() {
        return Code;
    }
}
