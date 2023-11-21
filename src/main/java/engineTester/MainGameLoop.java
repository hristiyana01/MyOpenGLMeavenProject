package engineTester;

import displayManager.DisplayWindow;
import org.lwjgl.opengl.Display;

public class MainGameLoop {
    public static void main(String[] args) {
        DisplayWindow.createDisplay();

        while(!Display.isCloseRequested()) {
                //game logic
            //render
            DisplayWindow.updateDisplay();
        }
        DisplayWindow.closeDisplay();
    }
}
