import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;


public class Draw extends JComponent{

	private BufferedImage image;
	private BufferedImage backgroundImage;
	public URL resource = getClass().getResource("run0.png");

	

	// circle's position
	public int x = 50;
	public int y = 50;

	// animation states
	public int state = 0;


	Monster monster1;
	Monster monster2;
	Monster2 monster3;
	Monster3 monster4;
	Player player;

	public Draw(){
		monster1 = new Monster(200, 200);
		monster2 = new Monster(300, 200);
		monster3 = new Monster2(200, 300);
		monster4 = new Monster3(300, 300);
		player = new Player(30, 30); 

		try{
			 image = ImageIO.read(resource);
			backgroundImage = ImageIO.read(getClass().getResource("dark.jpg"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}


	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.drawImage(backgroundImage, 0, 0, this);
		g.drawImage(image, x, y, this);

		g.drawImage(monster1.image, monster1.xPos, monster1.yPos, this);
		g.drawImage(monster2.image, monster2.xPos, monster2.yPos, this);
		g.drawImage(monster3.image, monster3.xPos, monster3.yPos, this);
		g.drawImage(monster4.image, monster4.xPos, monster4.yPos, this);
	}
}