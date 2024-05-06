package week1;

public class WholeSaleCost {
    public static void main (String[] args){
        double original = 24.95;
        double Min_shipping_charge = 3.0;
        double Add_shipping_charge = 0.75;
        
        System.out.printf("총 구매 가격은 %.3f입니다.", original*0.6*60 + Min_shipping_charge + Add_shipping_charge*59);
        
    }
}
