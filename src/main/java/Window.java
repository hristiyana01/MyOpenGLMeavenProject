import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.NULL;

public class Window {
    private int width;
    private int height;
    private String title;
    private long glfwWindow;
    private static Window window = null;
    private Window() {
        this.width = 1920;
        this.height = 1080;
        this.title = "Hristiyana";
    }
    public static Window get() {
        if(Window.window == null) {
            Window.window = new Window();
        }
        return Window.window;
    }

    public void run() {
        System.out.println("Hello, LWJGL " + Version.getVersion() + "!");

        init();
        loop();

    }
    public void init() {
        //setup error callback
        System.out.println("We have an error.");
        GLFWErrorCallback.createPrint(System.err).set();

        //initialize GLFW
        if(!glfwInit()) {
           throw  new IllegalStateException("Unable to initialize GLFW!");
        }

        //configure glfw
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_MAXIMIZED, GLFW_TRUE);

        //create the window
        glfwWindow = glfwCreateWindow(this.width, this.height, this.title, NULL, NULL);
        if (glfwWindow == NULL) {
            throw new IllegalStateException("Failed to create the GLFW window.");
        }
        //make an OpenGL Context current
        glfwMakeContextCurrent(glfwWindow);
        //enable v-sync
        glfwSwapInterval(1);
        //make the window visible
        glfwShowWindow(glfwWindow);

        GL.createCapabilities();
    }
    public void loop() {
        while(!glfwWindowShouldClose(glfwWindow)) {
            //poll events
            glfwPollEvents();

            glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
            glClear(GL_COLOR_BUFFER_BIT);

            glfwSwapBuffers(glfwWindow);
        }
    }
}
