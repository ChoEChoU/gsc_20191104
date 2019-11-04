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
        
    }
    public void mouseExited(MouseEvent e){
        
    }
    public void mousePressed(MouseEvent e){
        label.setText("mousePressed("+ e.getX() + "," + e.getY() + ")" );
    }
    public void mouseReleased(MouseEvent e){
        label.setText("mousePressed("+ e.getX() + "," + e.getY() + ")" );
    }
    public void mouseDragged(MouseEvent e){
        label.setText("mousePressed("+ e.getX() + "," + e.getY() + ")" );
    }
    public void mouseMoved(MouseEvent e){
        label.setText("mousePressed("+ e.getX() + "," + e.getY() + ")" );
    }
}
    