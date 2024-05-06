package week7;
// sample client for testing

public class TurtleDrive5 {

    public static void main(String[] args) {
    	//캔버스 크기
    	final int CANVAS_WIDTH = 400; 
    	final int CANVAS_HEIGHT = 400;
    	
    	//STEP의 크기
        final double STEP = 100.0;
        //각도의 크기
        //final double ANGLE = 90.0;
        
        // 캔버스 생성
        Turtle.setCanvasSize(CANVAS_WIDTH,  CANVAS_HEIGHT);
        
        //turtle객체는 오른쪽을 바라보는 상태로 생성됨
        Turtle turtle  = new Turtle(-200.0, 0.0);	
        //속도(시간이라는 표현이 더 어울릴듯. 숫자가 작아질수록 빨라짐)
        turtle.speed(100.0);
        
        
        drawNgon(turtle, STEP, 4);
        turtle.forward(STEP);
        drawNgon(turtle, STEP, 4);
        turtle.forward(STEP);
        drawNgon(turtle, STEP, 4);
        turtle.forward(STEP);
        drawNgon(turtle, STEP, 4);
        turtle.forward(STEP);
        
        
    }
    
    public static void drawNgon(Turtle t, final double s, int n) {
    	final double a = 180-(180*(n-2))/n;
    	for(int k=0; k<n; k++) {
        	t.forward(s);
            t.left(a);
        }
        
    }
}
