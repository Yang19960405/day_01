import javafx.application.Application;

import java.lang.*;//包含java语言的核心类，如String，Math，Integer，System，和Thread，
import java.lang.reflect.*;//用于实现反射机制
import java.awt.*;//包含构成抽象窗口工程集的多各类 被用来建设和管理应用程序的图形用户界面（GUI）
import java.applet.*;//包含的applet运行所需要的一些类
import java.net.*;//包含执行与网络相关的操作的类
import java.io.*;//输入输出
import java.util.*;//实用工具类

public class Jar extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawLine(10,20,100,120);
    }
}
