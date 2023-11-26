public class BmiService {

    public double calcuiate(double height, int weight) {

        double bmi = weight / (height * height);

        return bmi;
    }

}
