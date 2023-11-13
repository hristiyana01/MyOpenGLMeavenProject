package com.yourpackage;

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

        GL20
    }

    public void render(int shaderProgram) {
    }
}