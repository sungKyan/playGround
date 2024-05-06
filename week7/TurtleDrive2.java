package week7;
// sample client for testing

public class TurtleDrive2 {

    public static void main(String[] args) {
    	//캔버스 크기
    	final int CANVAS_WIDTH = 400; 
    	final int CANVAS_HEIGHT = 400;
    	
    	//STEP의 크기
        final double STEP = 150.0;
        //각도의 크기
        final double ANGLE = 72.0;
        
        // 캔버스 생성
        Turtle.setCanvasSize(CANVAS_WIDTH,  CANVAS_HEIGHT);
        
        //turtle객체는 오른쪽을 바라보는 상태로 생성됨
        Turtle turtle  = new Turtle(-100.0, -100.0);	
        //속도(시간이라는 표현이 더 어울릴듯. 숫자가 작아질수록 빨라짐)
        turtle.speed(100.0);
        
        for(int k=0; k<5; k++) {
        	turtle.forward(STEP);
            turtle.left(ANGLE);
        }
        
    }


}