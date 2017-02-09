import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.RED);
		g.fillRect(x1, y1, width + 1, height + 1);

		//                        Draw a border
		g.setColor(Color.YELLOW);
		g.drawRect(x1, y1, width, height);
		//                     
		//                        //Draw a 2nd border
		//                        g.setColor(Color.RED);
		//                        g.drawRect(x1+5, y1+5, width-10, height-10);
		//                        
		//                        g.setColor(Color.WHITE);
		//                        g.drawLine(x1, y1, x2, y2);
		//                        g.setColor(Color.GREEN);
		//                        g.drawLine(x1, y2, x2, y1);

		//                        g.setColor(Color.LIGHT_GRAY);
		//                        g.fillOval((x2-55)/2, (y2-55)/2, 55, 55);
		Polygon p = new Polygon();
		p.addPoint(x2, y2/5 );
		p.addPoint(x2, (y2*2)/5);
		p.addPoint(x1 , (y2*2)/5);
		p.addPoint(x1 , y2/5);
		g.setColor(Color.WHITE);
		g.fillPolygon(p);

		Polygon p2 = new Polygon();
		p2.addPoint(x2, (y2*3)/5);
		p2.addPoint(x2, (y2*4)/5);
		p2.addPoint(x1 , (y2*4)/5);
		p2.addPoint(x1 , (y2*3)/5);
		g.setColor(Color.WHITE);
		g.fillPolygon(p2);

		//triangle
		Polygon p3 = new Polygon();
		p3.addPoint(x1 , y1 );
		p3.addPoint(x2/2, y2/2);
		p3.addPoint(x1 , y2);
		g.setColor(Color.BLUE);
		g.fillPolygon(p3);
		//                       
		Polygon p4 = new Polygon();
		p4.addPoint(x1 + 115, y1 + 173);//1
		p4.addPoint(x1 + 131, y1 + 173);
		p4.addPoint(x1 + 137, y1 + 158);//3
		p4.addPoint(x1 + 143, y1 + 173);
		p4.addPoint(x1 + 159, y1 + 173);//5
		p4.addPoint(x1 + 146, y1 + 183);
		p4.addPoint(x1 + 151, y1 + 198);//7
		p4.addPoint(x1 + 137, y1 + 188);
		p4.addPoint(x1 + 124, y1 + 198);//9
		p4.addPoint(x1 + 128, y1 + 183);
		g.setColor(Color.WHITE);
		p4.translate(x1-50, y1-50);

		g.fillPolygon(p4);

	}
}