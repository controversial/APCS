public class BatteryCharger
{
    /**
     * rateTable has 24 entries representing the charging costs for hours 0 through 23.
     */
    private int[] rateTable;

    public BatteryCharger()
    {
        int[] table = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200,
                40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
        rateTable = table;
    }

    /** Determines the total cost to charge the battery starting at the beginning of startHour.
     * @param startHour the hour at which the charge period begins
     *   Precondition: 0 ≤ startHour ≤ 23
     * @param chargeTime the number of hours the battery needs to be charged
     *   Precondition: chargeTime > 0
     * @return the total cost to charge the battery
     */
    private int getChargingCost(int startHour, int chargeTime) {
        int total = 0;
        for (int i=startHour; i<startHour+chargeTime; i++) {
            total += rateTable[i % 24];
        }
        return total;
    }

    /** Determines start time to charge the battery at the lowest cost for the given charge time.
     * @param chargeTime the number of hours the battery needs to be charged
     *   Precondition: chargeTime > 0
     * @return an optimal start time, with 0 ≤ returned value ≤ 23
     */
    public int getChargeStartTime(int chargeTime) {
        int cost = Integer.MAX_VALUE;
        int hour = 0;
        for (int i=0; i<24; i++) {
            int newCost = getChargingCost(i, chargeTime);
            if (newCost < cost) {
                cost = newCost;
                hour = i;
            }
        }
        return hour;
    }

    /*************************************************
     * The main method is complete.
     *
     * See correct output below...
     *
     * Cost:
     * 40
     * 110
     * 550
     * 3710
     *
     * Best starting time:
     * 12
     * 0
     * 22
     * 22
     **************************************************/
    public static void main(String[] args)
    {
        BatteryCharger charger = new BatteryCharger();

        System.out.println("Cost:");
        System.out.println(charger.getChargingCost(12, 1));
        System.out.println(charger.getChargingCost(0, 2));
        System.out.println(charger.getChargingCost(22, 7));
        System.out.println(charger.getChargingCost(22, 30));
        System.out.println();

        System.out.println("Best starting time:");
        System.out.println(charger.getChargeStartTime(1));
        System.out.println(charger.getChargeStartTime(2));
        System.out.println(charger.getChargeStartTime(7));
        System.out.println(charger.getChargeStartTime(30));
        System.out.println();
    }

}
