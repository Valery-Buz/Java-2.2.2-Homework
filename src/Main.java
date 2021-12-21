public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 77; //вес тела в кг
        double growth = 1.70; // рост в метрах
        System.out.print(service.calculate(weight, growth));
    }
}
