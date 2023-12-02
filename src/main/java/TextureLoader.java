//import org.lwjgl.BufferUtils;
//import org.lwjgl.opengl.GL11;
//import org.lwjgl.opengl.GL12;
//import org.lwjgl.opengl.GL13;
//import org.lwjgl.stb.STBImage;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.ByteBuffer;
//import java.nio.IntBuffer;
//public class TextureLoader {
//    public static int loadCubeMap(String directory, String format) {
//        int textureID = GL11.glGenTextures();
//        GL13.glActiveTexture(GL13.GL_TEXTURE0);
//        GL11.glBindTexture(GL13.GL_TEXTURE_CUBE_MAP, textureID);
//
//        String[] fileNames = {"right", "left", "top", "bottom", "front", "back"};
//
//        int width = 0;
//        int height = 0;
//
//        for (int i = 0; i < 6; i++) {
//            String fileName = directory + "/" + fileNames[i] + "." + format;
//            ByteBuffer imageBuffer;
//
//            try (InputStream is = TextureLoader.class.getResourceAsStream(fileName)) {
//                if (is == null) {
//                    throw new IOException("Failed to load image: " + fileName);
//                }
//
//                byte[] bytes = is.readAllBytes();
//                IntBuffer w = BufferUtils.createIntBuffer(1);
//                IntBuffer h = BufferUtils.createIntBuffer(1);
//                IntBuffer comp = BufferUtils.createIntBuffer(1);
//
//                imageBuffer = STBImage.stbi_load_from_memory(ByteBuffer.wrap(bytes), w, h, comp, 4);
//                if (imageBuffer == null) {
//                    throw new RuntimeException("Failed to load a texture file: " + fileName);
//                }
//
//                width = w.get(0);
//                height = h.get(0);
//            } catch (Exception e) {
//                throw new RuntimeException("Failed to load a texture file: " + fileName, e);
//            }
//
//            GL11.glTexImage2D(GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X + i, 0, GL11.GL_RGBA, width, height, 0,
//                    GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, imageBuffer);
//
//            STBImage.stbi_image_free(imageBuffer);
//        }
//
//
//
////            try {
////                IntBuffer w = BufferUtils.createIntBuffer(1);
////                IntBuffer h = BufferUtils.createIntBuffer(1);
////                IntBuffer comp = BufferUtils.createIntBuffer(1);
////
////                imageBuffer = STBImage.stbi_load(fileName, w, h, comp, 4);
////                if (imageBuffer == null) {
////                    throw new RuntimeException("Failed to load a texture file: " + fileName);
////                }
////
////                width = w.get(0);
////                height = h.get(0);
////            } catch (Exception e) {
////                throw new RuntimeException("Failed to load a texture file: " + fileName, e);
////            }
////
////            GL11.glTexImage2D(GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X + i, 0, GL11.GL_RGBA, width, height, 0,
////                    GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, imageBuffer);
////
////            STBImage.stbi_image_free(imageBuffer);
////        }
//
//        //    STBImage.stbi_set_flip_vertically_on_load(false);
//
////            try {
////                IntBuffer w = BufferUtils.createIntBuffer(1);
////                IntBuffer h = BufferUtils.createIntBuffer(1);
////                IntBuffer comp = BufferUtils.createIntBuffer(1);
////
////                imageBuffer = STBImage.stbi_load(fileName, w, h, comp, 4);
////                if (imageBuffer == null) {
////                    throw new RuntimeException("Failed to load a texture file: " + fileName);
////                }
////
////                width = w.get();
////                height = h.get();
////            } finally {
////                // Reset flip_vertically_on_load to its default value after loading the image
////                STBImage.stbi_set_flip_vertically_on_load(true);
////            }
////
////
////            GL11.glTexImage2D(GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X + i, 0, GL11.GL_RGBA, width, height, 0,
////                    GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, imageBuffer);
////
////            STBImage.stbi_image_free(imageBuffer);
////        }
//
//        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
//        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
//        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
//        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
//        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL12.GL_TEXTURE_WRAP_R, GL12.GL_CLAMP_TO_EDGE);
//
//        return textureID;
//    }
//}
