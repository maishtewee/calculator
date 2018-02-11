package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class view extends JFrame {
	
	JTextField t1;
	JPanel p1;
	JPanel p2;
	JButton[] db;
	JButton[] ob;
	controller cl;
String operationtext[]={"C","sqrt","+","%","-","/","*","="};
	String digitButtonText[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "." };  
view(){
	super("calculator");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setSize(400, 400);
	this.setLocationRelativeTo(null);
	t1=new JTextField();
	t1.setBounds(0, 0, 300, 100);
	t1.setEditable(false);
	this.add(t1,BorderLayout.NORTH);
	db=new JButton[12];
	cl=new controller();
	cl.addview(this);
	ob=new JButton[8];
	p1=new JPanel();
	p2=new JPanel();
	p1.setLayout(new GridLayout(4,3));
	p2.setLayout(new GridLayout(4,2));
	this.add(p1,BorderLayout.CENTER);
	this.add(p2,BorderLayout.EAST);
	for(int i=0;i<12;i++){
		
		db[i]=new JButton(digitButtonText[i]);
		p1.add(db[i]);
		db[i].addActionListener(cl);
		db[i].setBackground(Color.pink);
	}
for(int i=0;i<8;i++){
		
		ob[i]=new JButton(operationtext[i]);
		p2.add(ob[i]);
		ob[i].addActionListener(cl);
	ob[i].setBackground(Color.pink.brighter());	
	}
	
}
public void addcontroller(controller cl){ 
	this.cl=cl;
}

public void echo(String s){
	this.t1.setText(s);
	
}
public String gett(){
	return this.t1.getText();
	
}
}
