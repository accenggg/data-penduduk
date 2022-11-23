package img;

import java.awt.*;
import javax.swing.*;

public class scimage {
    public ImageIcon Scale(JLabel labelPic,String Path){
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(Path));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(labelPic.getWidth(), labelPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;
    }
}
