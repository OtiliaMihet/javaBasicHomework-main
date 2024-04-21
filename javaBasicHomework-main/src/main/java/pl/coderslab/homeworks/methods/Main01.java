package pl.coderslab.homeworks.methods;


public class Main01 {

    public static void main(String[] args) {
        double dogAge = 5;

       dogAge(dogAge);
    }

    /**
     *
     * @param dogAge
     * @return calculated Age in dog years
     */
    private static void dogAge(double dogAge) {
        double rezultat = 0;
        for (int i = 0; i < dogAge; i++) {
            if (i < 2) {
                rezultat = rezultat + 10.5;
            } else {
                rezultat = rezultat + 4;
            }
        }
        System.out.println(rezultat);
    }
}



