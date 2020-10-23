package com.BigBigBigBigBigBigBigProject.controller;

import com.BigBigBigBigBigBigBigProject.view.MyJframe;
import com.QQJframe.MyJFrame;

public class MyJframeController extends MyJframe {
    public void showAdmin() {
        new AdminDialogController().setVisible(true);
    }
}
