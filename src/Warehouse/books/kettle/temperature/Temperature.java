package Warehouse.books.kettle.temperature;

//стр. 183
public class Temperature {

    private double number; //число
    private TempScale scale; //шкала

    public Temperature() {
        number = 0.0;
        scale = TempScale.FAHRENHEIT;
    }

    public Temperature(double number) {
        this.number = number;
        scale = TempScale.FAHRENHEIT;
    }

    public Temperature(TempScale scale) {
        number = 0.0;
        this.scale = scale;
    }

    public Temperature(double number, TempScale scale) {
        this.number = number;
        this.scale = scale;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setScale(TempScale scale) {
        this.scale = scale;
    }

    public TempScale getScale() {
        return scale;
    }
}

class UseTemperature {

    public static void main(String[] args) {

        final String format = "%5.2f градусов по %s\n";

        Temperature temp = new Temperature();
        temp.setNumber(70.0);
        temp.setScale(TempScale.FAHRENHEIT);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(32.0);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(TempScale.CELSIUS);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(2.73, TempScale.KELVIN);
        System.out.printf(format, temp.getNumber(), temp.getScale());
    }
}
