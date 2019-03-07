
    public class Main {
        public static void main(String[] args) {
            CashbackService service = new CashbackService();
            System.out.println(service.calculate(1_000, 3_000, 1_500));
            System.out.println(service.calculate(0,0,0));
            System.out.println(service.calculate( 150_000,50_000,45_000));
        }
    }


