package week1;

public class CelciusToFarenheit {
	
	
    public static void main (String[] args){
        double[] C_Temperature = {-40.0, -18.0, 10.0, 30.0, 40.0, 100.0};
        
        for(int k=0;k<6;k++) {
        	SUUU(C_Temperature[k]);
        }
    }
    public static void SUUU (double c_tem){
    	double RESULT = c_tem*9.0/5.0 + 32;
    	System.out.println("C = " + c_tem + " --> F = " + RESULT);
    }   
}
