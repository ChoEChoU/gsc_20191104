import java.awt.event.*;
import javax.swing.*;
/**
 * 여기에 MyMouseListener 클래스 설명을 작성하십시오.
 * 
 * @author (2018315026 정대기) 
 * @version (2019-11-04)
 */
public class MyMouseListener implements MouseListener, MouseMotionListener
{
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
        label.setText("MousePressed ("+e.getX()+","+e.get()+")";
    }
    public void mouseReleased(MouseEvent e){
        label.setText("MouseReleased("+e.getX()+","+e.getY()+")";
    }
    public void mouseDragged(MouseEvent e){
        
    }
    public void mouseMoved(MouseEvent e){
        
    }
}
    