import javax.swing.*;
import java.awt.*;
/**
 * Frame에 panel을 추가여 리스너 이벤트를 적용한 클래스
 * 
 * @author (2018315017 임민택, 2018315026 정대기, 2018315038 이혜인) 
 * @version (2019.11.04)
 */
public class MyMouseFrame extends JFrame
{
    public MyMouseFrame(){
        this.setTitle("MouseListener & MouseMotionListener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        this.add(panel);
        
        Label label = new Label("NoMouseEvent");
        panel.add(label);
        
        panel.addMouseListener(new MyMouseListener(label, panel));
        panel.addMouseMotionListener(new MyMouseListener(label, panel));
        
        this.setSize(800, 800);
        this.setVisible(true);
    }
}
