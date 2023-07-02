public class CreditPaymentService {
    public int calculate(int sum, int months, double percent) {
        double ps = percent / 12 / 100; // ежемесячная процентная ставка
        double pp = Math.pow(1 + ps, months); // возведение процентной стаки в степень

        return (int)(sum * ps * (pp / (pp - 1)));
    }
}
