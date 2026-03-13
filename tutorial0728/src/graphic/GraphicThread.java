package graphic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable {

    private int x, y, num;
    private Color color;
    private Random random;

    // 생성자
    public GraphicThread(int num) {
        this.num = num;
        this.color = Color.BLUE;
        this.random = new Random();

        // JFrame 설정
        setTitle("집에 갈시간 행복해요");
        setSize(800, 600);           // 너비 500, 높이 400
        setLocation(0, 150);       // 화면 위치
        setVisible(true);            // 프레임 표시
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 처리
    }

    // 스레드 작업 정의
    @Override
    public void run() {
        Rectangle rect = getBounds(); // 프레임 크기 정보

        for (int i = 0; i < num; i++) {
            // 랜덤 위치 생성
            x = random.nextInt(rect.width - 20);   // 오른쪽 여백
            y = random.nextInt(rect.height - 40);  // 아래쪽 여백

            repaint(); // 다시 그리기 요청

            try {
                Thread.sleep(50); // 0.05초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 그래픽 그리기
    @Override
    public void paint(Graphics g) {//JFrame에 있는 메서드
        super.paint(g); // 기존 화면 클리어
        g.setColor(color);//Graphic클래스 내에 setColor라는 메서드가 있겠죠
        g.fillOval(x, y, 20, 20); // 원 그리기 fillOval메서드가 있을 것이고 거기에 x,y를 원점으로 하고 
        //x축으로20,y축으로 반지름 20
    }

    // main 메서드
    public static void main(String[] args) {
        GraphicThread gt = new GraphicThread(100); // 100번 반복
        Thread t = new Thread(gt);  // 스레드 객체를 생성하면서 interface를 implement한 클래스를
        //쓰레드 클래스 생성자의 인자로 전달한다
        t.start(); // 스레드 시작
    }
}
//쓰레드 생성방법
//1)Thread를 상속, run 메서드 override>Start메서드 호출
//2)Runnable 인터페이스를 implements하는 클래스를 Thread 생성자의 인자로 전달한다.
//Start