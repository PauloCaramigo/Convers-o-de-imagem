import java.io.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class App {
    public static void main(String args[]) throws Exception {
        transformRed();
        transformGreen();
        transformBlue();
        Horizontal();
        Vertical();
    }

    public static void transformRed() throws Exception {
        File file= new File("src/catGay.jpg");
        BufferedImage image = ImageIO.read(file);
        int width = image.getWidth();
        int height = image.getHeight();


        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color c = new Color(image.getRGB(x, y));
                int r = c.getRed();
                image.setRGB(x, y, new Color(r,0,0).getRGB());
            }
        }

        file = new File("src/catGayRed.jpg");
        ImageIO.write(image, "png", file);

        System.out.println("Conversão para vermelho!");
    }

    public static void transformGreen() throws Exception {
        File file= new File("src/catGay.jpg");
        BufferedImage image = ImageIO.read(file);
        int width = image.getWidth();
        int height = image.getHeight();


        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color c = new Color(image.getRGB(x, y));
                int g = c.getGreen();
                image.setRGB(x, y, new Color(0,g,0).getRGB());
            }
        }

        file = new File("src/catGayVerde.jpg");
        ImageIO.write(image, "png", file);

        System.out.println("Conversão para verde!");
    }

    public static void transformBlue() throws Exception {
        File file= new File("src/catGay.jpg");
        BufferedImage image = ImageIO.read(file);
        int width = image.getWidth();
        int height = image.getHeight();


        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color c = new Color(image.getRGB(x, y));
                int b = c.getBlue();
                image.setRGB(x, y, new Color(0,0,b).getRGB());
            }
        }

        file = new File("src/catGayAzul.jpg");
        ImageIO.write(image, "png", file);

        System.out.println("Conversão para azul!");
    }

    public static void Horizontal() throws Exception {
        File newFile, file= new File("src/catGay.jpg");
        BufferedImage image = ImageIO.read(file);
        int width = image.getWidth();
        int height = image.getHeight();
        BufferedImage newImage = new BufferedImage(width, height, image.getType());

        for (int y = 0; y < height; y++) {
            for (int x = 1; x < width; x++) {
                Color c = new Color(image.getRGB(width - x, y));
                int r = c.getRed(), g = c.getGreen(), b= c.getBlue();
                newImage.setRGB(x, y, new Color(r, g, b).getRGB());
            }
        }

        newFile = new File("src/catGayHorizontal.jpg");
        ImageIO.write(newImage, "png", newFile);

        System.out.println("Conversão horizontal!");
    }

    public static void Vertical() throws Exception {
        File newFile, file= new File("src/catGay.jpg");
        BufferedImage image = ImageIO.read(file);
        int width = image.getWidth();
        int height = image.getHeight();
        BufferedImage newImage = new BufferedImage(width, height, image.getType());

        for (int y = 1; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color c = new Color(image.getRGB(x, height - y));
                int r = c.getRed(), g = c.getGreen(), b = c.getBlue();
                newImage.setRGB(x, y, new Color(r,g,b).getRGB());
            }
        }

        newFile = new File("src/catGayVertical.jpg");
        ImageIO.write(newImage, "png", newFile);

        System.out.println("Conversão Vertical!");
    }
}