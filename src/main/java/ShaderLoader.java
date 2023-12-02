//import org.lwjgl.opengl.GL11;
//import org.lwjgl.opengl.GL20;
//
//import java.io.*;
//import java.nio.charset.StandardCharsets;
//
//public class ShaderLoader {
//    public static int loadShaders(String vertexPath, String fragmentPath) {
//        int vertexShader = loadShader(vertexPath, GL20.GL_VERTEX_SHADER);
//        int fragmentShader = loadShader(fragmentPath, GL20.GL_FRAGMENT_SHADER);
//
//        int shaderProgram = GL20.glCreateProgram();
//        GL20.glAttachShader(shaderProgram, vertexShader);
//        GL20.glAttachShader(shaderProgram, fragmentShader);
//        GL20.glLinkProgram(shaderProgram);
//
//        // Check for linking errors
//        if (GL20.glGetProgrami(shaderProgram, GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
//            throw new RuntimeException("Error linking shaders: " + GL20.glGetProgramInfoLog(shaderProgram));
//        }
//
//        GL20.glDeleteShader(vertexShader);
//        GL20.glDeleteShader(fragmentShader);
//
//        return shaderProgram;
//    }
//
//    private static int loadShader(String path, int type) {
//        StringBuilder shaderSource = new StringBuilder();
////        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
////            String line;
////            while ((line = reader.readLine()) != null) {
////                shaderSource.append(line).append("\n");
////            }
////        } catch (IOException e) {
////              throw new RuntimeException("Error reading shader source from: " + path, e);
////        }
////        try (InputStream is = ShaderLoader.class.getResourceAsStream(path);
////             BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
////            String line;
////            while ((line = reader.readLine()) != null) {
////                shaderSource.append(line).append("\n");
////            }
////        } catch (IOException e) {
////            throw new RuntimeException("Error reading shader source from: " + path, e);
////        }
//
//
////        InputStream is = ShaderLoader.class.getResourceAsStream(path);
////
////        if (is == null) {
////            throw new RuntimeException("Shader source not found: " + path);
////        }
////
////        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
////            String line;
////            while ((line = reader.readLine()) != null) {
////                shaderSource.append(line).append("\n");
////            }
////        } catch (IOException e) {
////            throw new RuntimeException("Error reading shader source from: " + path, e);
////        }
//
//        try (InputStream is = ShaderLoader.class.getResourceAsStream("/shaders/" + path)) {
//            if (is == null) {
//                throw new RuntimeException("Shader source not found: " + path);
//            }
//
//            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    shaderSource.append(line).append("\n");
//                }
//            } catch (IOException e) {
//                throw new RuntimeException("Error reading shader source from: " + path, e);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException("Error closing InputStream for shader: " + path, e);
//        }
//
//
//        int shader = GL20.glCreateShader(type);
//        GL20.glShaderSource(shader, shaderSource);
//        GL20.glCompileShader(shader);
//
//        // Check for compilation errors
//        if (GL20.glGetShaderi(shader, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
//            throw new RuntimeException("Error compiling shader: " + GL20.glGetShaderInfoLog(shader));
//        }
//
//        return shader;
//    }
//}
