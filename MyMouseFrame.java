import javax.swing.*;
import java.awt.*;
/**
 * 여기에 MyMouseFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyMouseFrame extends JFrame
{
    public MyMouseFrame(){
        this.setTitle("MouseListener & MouseMotionListener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        this.add(panel);
        
        this.setSize(100, 100);
        this.setVisible(true);
    }
}
