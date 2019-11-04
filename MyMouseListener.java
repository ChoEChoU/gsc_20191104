import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * 마우스 이벤트와 마우스 모션 이벤트를 구현한 MyMouseListener
 * 
 * @author (2018315017 임민택, 2018315026 정대기, 2018315038 이혜인)
 * @version (2019-11-04)
 */
public class MyMouseListener  extends MouseAdapter implements MouseMotionListener
{
    Label label;
    JPanel panel;

    public MyMouseListener(Label label, JPanel panel){
        this.label = label;
        this.panel = panel;
    }

    public void mouseEntered(MouseEvent e){
        JPanel panel = (JPanel)e.getSource();
        panel.setBackground(Color.CYAN);
        label.setSize(200,20);
        label.setBackground(Color.CYAN);
    }

    public void mouseExited(MouseEvent e){
        JPanel panel = (JPanel)e.getSource();
        panel.setBackground(Color.YELLOW);
        label.setBackground(Color.YELLOW);
    }

    public void mousePressed(MouseEvent e){
        label.setText("MousePressed("+ e.getX() + "," + e.getY() + ")" );
    }

    public void mouseReleased(MouseEvent e){
        label.setText("MouseReleased("+ e.getX() + "," + e.getY() + ")" );
    }

    public void mouseDragged(MouseEvent e){
        label.setText("MouseDragged("+ e.getX() + "," + e.getY() + ")" );
    }

    public void mouseMoved(MouseEvent e){
        label.setText("MouseMoved("+ e.getX() + "," + e.getY() + ")" );
    }
}
 