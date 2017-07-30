package main;

import view.Window1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by prayer on 17-7-28.
 */
public class GameMain1 {
    public static void main(String[] args){
        Window1 win = new Window1();
        win.initView();
        win.setTitle("2048PC版");
        //在设置窗体的大小时，我们需要注意去掉窗体标题栏的大小，正确是设置方法是：
        win.getContentPane().setPreferredSize(new Dimension(400, 500));
        //在设置窗体背景色时，直接使用JFrame.setBackground()方法是不会生效，正确的设置方法是：
        win.getContentPane().setBackground(new Color(0xfaf8ef));
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false);//去掉最大化按钮
        win.pack();//获取最佳大小
        win.setVisible(true);
    }
}
