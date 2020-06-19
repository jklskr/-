package java课堂练习;
import java.awt.*;
public class 窗体练习2 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
new Layout("GridBagLayout");

	}
}
class Layout extends Frame{
	public Layout(String title) {
		GridBagLayout l=new GridBagLayout();
		GridBagConstraints q=new GridBagConstraints();
		this.setLayout(l);
		q.fill=GridBagConstraints.BOTH;
		q.weightx=1;q.weighty=1;
		this.addComponent("按钮1",l,q);
		this.addComponent("按钮2",l,q);
		this.addComponent("按钮3",l,q);
		q.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("按钮4",l,q);
		q.weightx=0;q.weighty=0;
		addComponent("按钮5",l,q);
		q.gridwidth=1;
		this.addComponent("按钮6",l,q);
		q.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("按钮7",l,q);
		q.gridheight=2;
		q.gridwidth=1;
		q.weightx=2;
		q.weighty=2;
		this.addComponent("按钮8",l,q);
		q.gridwidth=GridBagConstraints.REMAINDER;
		q.gridheight=1;
		this.addComponent("按钮9",l,q);
		this.addComponent("按钮10",l,q);
		this.pack();
		this.setVisible(true);
		
	}
		private void addComponent(String name,GridBagLayout l,GridBagConstraints q) {
	Button bt=new Button(name);
	l.setConstraints(bt,q);
	this.add(bt);	
	}
}