import javax.swing.*;
import java.awt.*;

public class Paint extends JPanel {
    public final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        FlappyBird.flappyBird.repaint(g);
    }
}
