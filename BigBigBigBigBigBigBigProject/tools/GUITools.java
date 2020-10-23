package com.BigBigBigBigBigBigBigProject.tools;

import javax.swing.*;
import java.awt.*;

// 实现窗口居中及标题图片设置
public class GUITools {  // 用户图形界面工具
    static Toolkit  toolkit = Toolkit.getDefaultToolkit();  // 帮助获得当前电脑的显示器信息

    // 设置窗口居中
    public static void center(Component c) {  // 所有图形界面的父类是Component
        int x = (toolkit.getScreenSize().width - c.getWidth()) / 2;  // x坐标为屏幕宽度减去窗口宽度
        int y = (toolkit.getScreenSize().height - c.getHeight()) / 2;  // // x坐标为屏幕高度减去窗口高度
        c.setLocation(x, y);
    }

    // 设置标题图标
    public static void setImage(JFrame jFrame, String titleIcon) {
        jFrame.setIconImage(toolkit.createImage(titleIcon));
    }
    public static void setImage(Dialog dialog, String titleIcon) {
        dialog.setIconImage(toolkit.createImage(titleIcon));
    }
}
