package java课堂练习;
import java.awt.*;
public class 窗体练习1 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Frame f=new Frame("GridLayout");
		Color color=Color.RED;
		f.setLayout(new GridLayout(3,3));
		f.setSize(300,300);
		f.setLocation(400,300);
		for(int i=1;i<=9;i++) {
		Button btn=new Button("btn"+1);
		f.add(btn);
		}
		f.setVisible(true);
		f.setBackground(color);
	}

}
