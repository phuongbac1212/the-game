import javax.swing.*;

public class Game {

    enum GameState {SETUP, UPDATE, DRAW, WAIT, END}

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new GameMap());


        System.out.println(System.getProperty("user.dir"));
    }
}
