import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * 여기에 MyMouseListener 클래스 설명을 작성하십시오.
 * 
 * @author (2018315026 정대기) 
 * @version (2019-11-04)
 */
public class MyMouseListener  extends JPanel implements MouseListener, MouseMotionListener
{
    Label label;
    
    public MyMouseListener(Label label){
        this.label = label;
    }
    
    public void mouseClicked(MouseEvent e){
        
    }
    public void mouseEntered(MouseEvent e){
        Component c = (Component)e.getSource();
        c.setBackground(Color.SKYBLUE);
    }
    public void mouseExited(MouseEvent e){
        Component c = (Component)e.getSource();
        c.setBackground(Color.YELLOW);
    }
    public void mousePressed(MouseEvent e){
<<<<<<< HEAD
        label.setText("MousePressed ("+e.getX()+","+e.get()+")";
=======
        label.setText("mousePressed("+ e.getX() + "," + e.getY() + ")" );
>>>>>>> 7f1963d8d0f188ade0dc8bd83560bab0e2129a34
    }
    public void mouseReleased(MouseEvent e){
<<<<<<< HEAD
        label.setText("MouseReleased("+e.getX()+","+e.getY()+")";
=======
        label.setText("mousePressed("+ e.getX() + "," + e.getY() + ")" );
>>>>>>> 7f1963d8d0f188ade0dc8bd83560bab0e2129a34
    }
    public void mouseDragged(MouseEvent e){
        label.setText("mousePressed("+ e.getX() + "," + e.getY() + ")" );
    }
    public void mouseMoved(MouseEvent e){
        label.setText("mousePressed("+ e.getX() + "," + e.getY() + ")" );
    }
}
    