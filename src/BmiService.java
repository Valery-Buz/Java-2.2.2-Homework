public class BmiService {
    public double calculate(int weight, double growth) {
        double growth2 = growth*growth; //рост в метрах квадратных
        double bmi = weight/growth2;

        return bmi;
    }
}
