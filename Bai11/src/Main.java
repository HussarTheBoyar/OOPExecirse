public class Main {
    public SoPhuc cong(SoPhuc var1, SoPhuc var2){
        SoPhuc result = new SoPhuc();
        result.setIm(var1.getIm() + var2.getIm());
        result.setReal(var1.getReal() + var2.getReal());
        return result;
    }

    public SoPhuc nhan(SoPhuc var1, SoPhuc var2){
        SoPhuc result = new SoPhuc();
        result.setIm(var1.getIm() * var2.getReal() + var2.getIm() * var1.getReal());
        result.setReal(var1.getReal() * var2.getReal() - var1.getIm() * var2.getIm());
        return result;
    }
    public static  void main(String[] args){
        SoPhuc var1 = new SoPhuc(1,1);
        SoPhuc var2 = new SoPhuc(2,-1);
        Main main = new Main();
        System.out.println(main.cong(var1,var2).toString());;
        System.out.println(main.nhan(var1,var2).toString());;
    }
}
