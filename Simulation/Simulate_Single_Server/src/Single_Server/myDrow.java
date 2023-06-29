
package Single_Server;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.ScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
public class myDrow {
    private JFrame form ;
    private JScrollPane panel;
    public myDrow(JFrame form) {
        this.form = form;
    }
    
    public int border =2;
    public static Color color =Color.BLACK;
     public void line (double x1,double y1,double x2,double y2 ,Color c){
        JPanel pnl =new JPanel(){
        @Override
        public void paintComponent(Graphics g){
        Graphics2D g2 =(Graphics2D)g;
        g2.setStroke(new BasicStroke(border));
        g2.setColor(c);
           g2.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
        }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, form.getWidth(), form.getHeight());
        } 
      public void line (double x1,double y1,double x2,double y2 ){
        JPanel pnl =new JPanel(){
        @Override
        public void paintComponent(Graphics g){
        Graphics2D g2 =(Graphics2D)g;
        g2.setStroke(new BasicStroke(border));
        g2.setColor(color);
           g2.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
        }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, form.getWidth(), form.getHeight());
        } 
     
    
}
