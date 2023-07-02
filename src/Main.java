public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000; // сумма кредита
        double percent = 9.99; // процентная ставка

        System.out.println(service.calculate(sum, 12, percent));
        System.out.println(service.calculate(sum, 24, percent));
        System.out.println(service.calculate(sum, 36, percent));
    }
}