public class SoPhuc {
    private double real;
    private double im;

    public SoPhuc() {
    }

    public SoPhuc(double real, double im) {
        this.real = real;
        this.im = im;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return "SoPhuc{" +
                 real +
                "+" + im +"i"+
                '}';
    }
}
