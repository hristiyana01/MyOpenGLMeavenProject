//package other.displayManager;
//
//import org.lwjgl.LWJGLException;
//import org.lwjgl.opengl.*;
//
////import java.awt.*;
//
//public class DisplayWindow {
//    private static final int WIDTH = 1280;
//    private static final int HEIGHT = 720;
//    private static final int FPS_CAP = 120;
//    public static void createDisplay() {
//        ContextAttribs attribs = new ContextAttribs(3,2);
//        attribs.withForwardCompatible(true);
//        attribs.withProfileCore(true);
//        Display.setTitle("Skybox");
//        try{
//        Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
//            Display.create(new PixelFormat(), attribs);
//        } catch (LWJGLException e) {
//            e.printStackTrace();
//        }
//        GL11.glViewport(0, 0, WIDTH, HEIGHT);
//    }
//    public static void updateDisplay() {
//        Display.sync(FPS_CAP);
//        Display.update();
//    }
//    public static void closeDisplay() {
//        Display.destroy();
//    }
//
//
//}
