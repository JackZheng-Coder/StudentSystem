package com.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName:
 * @Description:
 * @author:ZYX
 * @date:2020/5/29
 * @Version:1.0
 * @Copyright:
 */
public class ImagePanel extends JPanel {
    private ImageIcon icon;
    private Image img;

    public ImagePanel(){
        icon = new ImageIcon(StudentSystemMainFrame.class.getResource("/1.png"));
        img = icon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img,0,0,null);
    }
}
