public class CashbackService {
    public int calculate(int monthCostsRegular, int monthCostsHigh, int monthCostsExtra) {
        if (monthCostsRegular+monthCostsHigh+monthCostsExtra <=0) {
            return 0;
        }

        int regularPersent=1;
        int highPersent=5;
        int extraPersent=30;

        int regularCostsResult=monthCostsRegular*regularPersent/100;
        int highCostsResult=monthCostsHigh*highPersent/100;
        int extraCostsResult=monthCostsExtra*extraPersent/100;

        int limit=3_000;
        int totalResultMonthCosts=regularCostsResult+highCostsResult+extraCostsResult; {
            if (totalResultMonthCosts >= limit) {
                return limit;
            }

            return totalResultMonthCosts;
        }







    }

}


