import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class GameApplet extends Applet {
	private GameEngine game;
	private KeyPressed eventHandler;
	
	public void init(){
		game = new GameEngine();
		game.setPreferredSize(new Dimension(800, 650));
		game.setVisible(true);
		game.setFocusable(true);
		this.add(game);
		this.setVisible(true);
		this.setSize(new Dimension(800, 650));
		eventHandler = new KeyPressed(game);
	}
	
	public void paint(Graphics g){
		this.setSize(new Dimension(800, 650));
	}
}
