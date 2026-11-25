public class electricbill {
    public static void main(String[] args) {
        String customerName = "Rahul";
        int unitsConsumed = 350;
        int bill = 0;
        double surcharge = 0;
        double totalbill = 0;

        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 2;
        } else if (unitsConsumed <= 200) {
            bill = unitsConsumed * 3;
        } else if (unitsConsumed <= 300) {
            bill = unitsConsumed * 5;
        } else if (unitsConsumed > 300) {
            bill = unitsConsumed * 7;
        }

        if (bill > 1000) {
            surcharge = bill * (5.0 / 100);
        }

        totalbill = bill + surcharge;

        if (unitsConsumed <= 0) {
            System.out.println("Invalid Units");
        }

        System.out.println("Customer Name:" + customerName);
        System.out.println("Units Consumed:" + unitsConsumed);
        System.out.println("Electricity:" + bill);
        System.out.println("Surcharge:" + surcharge);
        System.out.println("Total bill:" + totalbill);
    }
}
