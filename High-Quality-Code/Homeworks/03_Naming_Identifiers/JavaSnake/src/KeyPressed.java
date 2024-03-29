import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressed implements KeyListener{
	
	public KeyPressed(GameEngine game){
		game.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent e) {
		int keyCode= e.getKeyCode();
		
		if (keyCode== KeyEvent.VK_W || keyCode== KeyEvent.VK_UP) {
			if(GameEngine.mySnake.getVelocityY() != 20){
				GameEngine.mySnake.setVelocityX(0);
				GameEngine.mySnake.setVelocityY(-20);
			}
		}
		if (keyCode== KeyEvent.VK_S || keyCode== KeyEvent.VK_DOWN) {
			if(GameEngine.mySnake.getVelocityY() != -20){
				GameEngine.mySnake.setVelocityX(0);
				GameEngine.mySnake.setVelocityY(20);
			}
		}
		if (keyCode== KeyEvent.VK_D || keyCode== KeyEvent.VK_RIGHT) {
			if(GameEngine.mySnake.getVelocityX() != -20){
			GameEngine.mySnake.setVelocityX(20);
			GameEngine.mySnake.setVelocityY(0);
			}
		}
		if (keyCode== KeyEvent.VK_A || keyCode== KeyEvent.VK_LEFT) {
			if(GameEngine.mySnake.getVelocityX() != 20){
				GameEngine.mySnake.setVelocityX(-20);
				GameEngine.mySnake.setVelocityY(0);
			}
		}
		//Other controls
		if (keyCode== KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}
	
	public void keyReleased(KeyEvent e) {
	}
	
	public void keyTyped(KeyEvent e) {
		
	}

}
