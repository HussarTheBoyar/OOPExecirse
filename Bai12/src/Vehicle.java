public abstract class Vehicle {
    protected String ID;
    private String Company;
    private double Price;
    private String Color;

    public Vehicle(String company, double price, String color) {
        Company = company;
        Price = price;
        Color = color;
    }

    public String getID() {
        return ID;
    }

    public abstract void setID(int code);

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID='" + ID + '\'' +
                ", Company='" + Company + '\'' +
                ", Price=" + Price +
                ", Color='" + Color + '\'' +
                '}';
    }

}
