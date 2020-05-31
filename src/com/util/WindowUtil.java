package com.util;

import com.model.ScoreModel;

import java.awt.*;

/**
 * @ClassName: 粗窗体工具类
 * @Description:
 * @author:ZYX
 * @date:2020/5/27
 * @Version:1.0
 * @Copyright:
 */
public class WindowUtil {
    //设置窗体居中
    public static void setFrameCenter(Container c){
        //获取工具对象
        Toolkit tk = Toolkit.getDefaultToolkit();
        //获取屏幕的宽和高
        Dimension d = tk.getScreenSize();
        double screenWidth = d.getWidth();
        double screenHeight = d.getHeight();
        //获取窗体的宽和高
        int frameWidth = c.getWidth();
        int frameHeight = c.getHeight();
        //获取新的宽和高
        int width = (int)(screenWidth - frameHeight)/2;
        int height = (int)(screenHeight - frameHeight)/2;
        //设置窗体坐标
        c.setLocation(width,height);
    }
}
