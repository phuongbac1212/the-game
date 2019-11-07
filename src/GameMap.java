import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GameMap extends JPanel {
    Image path = ImageLoader.getImage("res/map/image/path.png" );
    Image moutain = ImageLoader.getImage("res/map/image/moutain.png");

    public void paint(Graphics2D g2d, int level) throws IOException {
        String fLevel = "/res/map/data/level"+level+".txt";
        BufferedReader in = new BufferedReader(new FileReader(fLevel));

        int x=0, y=0;
        for (int i =0 ; i<10; i++) {
            String a = in.readLine();
            for (int j=0; j<a.length(); j++) {
                if (a.charAt(j) == '0') {
                    g2d.drawImage(path, x, y, null);
                    x += path.getWidth(null);
                }
                else if (a.charAt(j) == '1') {
                    g2d.drawImage(moutain, x, y, null);
                    x += moutain.getWidth(null);
                };
                y += path.getHeight(null);
                x = 0;

            }
        }
    }
}
