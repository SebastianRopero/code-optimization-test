public class TaxCalculation {
    public static void main(String[] args) {

        //defino las constantes y nombro cada una
        final double TAX_RATE_HIGH = 0.15; 
        final double TAX_RATE_LOW = 0.10;
        final double TAX_THRESHOLD = 50;

        //hacemos dos arrays y una variable contador 
        int[] price = {100,200};
        double[] tax = {TAX_RATE_HIGH,TAX_RATE_LOW};
        double counter = 0;

        //abrimos un for
        for (int i=0; i<price.length;i++){
            double total=price[i]-(price[i]*tax[i]); 
            counter=counter+total;
        } 

        //abrimos un if y un else para ya finalizar el programa
        if (counter>TAX_THRESHOLD){
            System.out.println("High total tax: " + counter);
        } else{
            System.out.println("Low tax: " + counter);
        }



    }
}