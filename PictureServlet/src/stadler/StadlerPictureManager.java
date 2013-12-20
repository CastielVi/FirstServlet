package stadler;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class StadlerPictureManager extends JPanel {

	Random r = new Random();
	int number = r.nextInt(6) + 1;
	String path = System.getProperty("user.home");

	public StadlerPictureManager(){
		
		JFrame frame = new JFrame("PictureFrame");
	    frame.add(this);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,300);
	    frame.setVisible(false);
	
	    try
        {
	    	path = System.getProperty(System.getProperty("catalina.home"));
	    	String path2 = "ServletpictureThaWinning.jpeg";
            BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = image.createGraphics();
            frame.paint(graphics2D);
            System.out.println(path);
            ImageIO.write(image,"jpeg", new File("C://Users//stefan//workspace//PictureServlet//WebContent//BildandShit.jpeg"));
        }
	    catch (Exception e)
	    {
            System.out.println(path);
	    	System.out.print("Wasnt able to save Picture !!");
	    }
	}
		
	public void paint(Graphics g){
		
		switch(number){
		case 1: g.drawOval(10,10,200,200);
				break;
		case 2: g.drawRect(10,10,200,200);
				break;
		case 3:  g.drawRoundRect(10, 10, 200, 200, 150, 150);
				break;
		case 4: g.fillOval(10,10,200,200);
				break;
		case 5: g.fillRect(10,10,200,200);
				break;
		case 6: g.fillRoundRect(10, 10, 200, 200, 75, 75);
				break;
		}
	}
		
	
	public static void main(String[] args)
	{
		new StadlerPictureManager();	
	}
	
	
}

