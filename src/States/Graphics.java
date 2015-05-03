package States;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Graphics extends BasicGameState {

	public Graphics(int graphics) {
	}

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {

	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1,
			org.newdawn.slick.Graphics arg2) throws SlickException {

	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
			throws SlickException {
		if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
			Display.destroy();
			System.exit(0);
		}

	}

	@Override
	public int getID() {
		return 4;
	}

}