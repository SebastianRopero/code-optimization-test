public class TaxCalculation {
    public static void main(String[] args) {
        final double TAX_RATE_HIGH = 0.15;
        


        double productPrice1 = 100;
        double productPrice2 = 200;
        double tax1 = productPrice1 * TAX_RATE_HIGH;
        double tax2 = productPrice2 * 0.10;
        double totalTax = tax1 + tax2;
        
        if (totalTax > 50) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}
