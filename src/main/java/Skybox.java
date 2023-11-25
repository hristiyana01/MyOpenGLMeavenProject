

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class Skybox {
    private final int vao;
    private final int texture;

    public Skybox(int texture) {
        this.texture = texture;
        float[] vertices = {
                // Position
                -1.0f, 1.0f, -1.0f,
                -1.0f, -1.0f, -1.0f,
                1.0f, -1.0f, -1.0f,
                1.0f, -1.0f, -1.0f,
                1.0f, 1.0f, -1.0f,
                -1.0f, 1.0f, -1.0f
        };

        vao = GL30.glGenVertexArrays();
        int vbo = GL30.glGenBuffers();

        GL30.glBindVertexArray(vao);

        GL30.glBindBuffer(GL20.GL_ARRAY_BUFFER, vbo);
        GL30.glBufferData(GL20.GL_ARRAY_BUFFER, vertices, GL20.GL_STATIC_DRAW);
        GL20.glVertexAttribPointer(0, 3, GL11.GL_FLOAT, false, 0, 0);
        GL20.glEnableVertexAttribArray(0);

        GL30.glBindBuffer(GL20.GL_ARRAY_BUFFER, 0);

        GL30.glBindVertexArray(0);

        // Load skybox texture
        texture = TextureLoader.loadCubeMap("textures/skybox/skybox", "jpg");
    }

    public void render(int shaderProgram) {
        GL20.glUseProgram(shaderProgram);

        // Disable depth testing to render the skybox behind everything else
        GL11.glDisable(GL11.GL_DEPTH_TEST);

        GL30.glBindVertexArray(vao);

        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GL11.glBindTexture(GL13.GL_TEXTURE_CUBE_MAP, texture);

        GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, 6);

        GL30.glBindVertexArray(0);

        // Enable depth testing again for the rest of the scene
        GL11.glEnable(GL11.GL_DEPTH_TEST);
    }
}