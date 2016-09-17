/*
 * 范例名称：Frame应用举例
 * 药店：Frame组件的创建以及显示设置
 * */

package gui;

import java.awt.Color;
import java.awt.Frame;

public class TestFrame {

	public static void main(String[] args) {
		Frame f = new Frame("My first Test");
		f.setLocation(300,200);
		f.setResizable(false);
		f.setSize(170,100);
		f.setBackground(Color.blue);
		f.setVisible(true);
	}

}
