package com.BigBigBigBigBigBigBigProject.tools;

import javax.swing.*;
import java.awt.*;

// ʵ�ִ��ھ��м�����ͼƬ����
public class GUITools {  // �û�ͼ�ν��湤��
    static Toolkit  toolkit = Toolkit.getDefaultToolkit();  // ������õ�ǰ���Ե���ʾ����Ϣ

    // ���ô��ھ���
    public static void center(Component c) {  // ����ͼ�ν���ĸ�����Component
        int x = (toolkit.getScreenSize().width - c.getWidth()) / 2;  // x����Ϊ��Ļ��ȼ�ȥ���ڿ��
        int y = (toolkit.getScreenSize().height - c.getHeight()) / 2;  // // x����Ϊ��Ļ�߶ȼ�ȥ���ڸ߶�
        c.setLocation(x, y);
    }

    // ���ñ���ͼ��
    public static void setImage(JFrame jFrame, String titleIcon) {
        jFrame.setIconImage(toolkit.createImage(titleIcon));
    }
    public static void setImage(Dialog dialog, String titleIcon) {
        dialog.setIconImage(toolkit.createImage(titleIcon));
    }
}
