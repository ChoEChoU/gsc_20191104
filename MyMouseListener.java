import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * 여기에 MyMouseListener 클래스 설명을 작성하십시오.
 * 
 * @author (2018315017 임민택, 2018315026 정대기, 2018315038 이혜인)
 * @version (2019-11-04)
 */
public class MyMouseListener  extends JPanel implements MouseListener, MouseMotionListener
{
    Label label;
    JPanel panel;

    public MyMouseListener(Label label, JPanel panel){
        this.label = label;
        this.panel = panel;
    }

    public void mouseClicked(MouseEvent e){}

    public void mouseEntered(MouseEvent e){
        JPanel panel = (JPanel)e.getSource();
        panel.setBackground(Color.CYAN);
        label.setBackground(Color.CYAN);
    }

    public void mouseExited(MouseEvent e){
        JPanel panel = (JPanel)e.getSource();
        panel.setBackground(Color.YELLOW);
        label.setBackground(Color.YELLOW);
    }

    public void mousePressed(MouseEvent e){
        label.setText("mousePressed("+ e.getX() + "," + e.getY() + ")" );
    }

    public void mouseReleased(MouseEvent e){
        label.setText("mouseReleased("+ e.getX() + "," + e.getY() + ")" );
    }

    public void mouseDragged(MouseEvent e){
        label.setText("mouseDragged("+ e.getX() + "," + e.getY() + ")" );
    }

    public void mouseMoved(MouseEvent e){
        label.setText("mouseMoved("+ e.getX() + "," + e.getY() + ")" );
    }
}
 