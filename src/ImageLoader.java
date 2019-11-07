import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {
    public static Image getImage(String imagePath) {
        try {
            Image im = ImageIO.read(new File(imagePath));
            return im;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
