
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class controller implements ActionListener{
	view v;
	model m;
	String a;
	
	int n=0;
	
	boolean f=false;
public void addmodel(model m){
	
		
		this.m=m;
	}
	public void addview(view v){
		this.v=v;
		v.setVisible(true);
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
	
		String d=e.getActionCommand();
		
		
		if(d.equals("=")||d.equals("sqrt")||d.equals("C")||d.equals("+/-"))
			{
			if(d.equals("C")){ v.echo(""); n=0;  }
			if(d.equals("sqrt")) { v.echo(String.valueOf(m.sqrt(v.gett()))); }
			if(d.equals("=")){ if(n==0) v.echo(v.gett()); else v.echo(String.valueOf(m.answer(v.gett())));n=0; }
			//if(d.equals("%")){v.echo(""); n=0; }
		if(	d.equals("+/-")) { 
		double f=-1*m.answer(v.gett());
			v.echo(String.valueOf(f));}
 			}
		
		
		else {
			
			 if(d.equals("-")||d.equals("+")||d.equals("/")||d.equals("*")||d.equals("%")){
				
				if(n!=0){
				
					 v.echo(String.valueOf(m.answer(v.gett()))); 
					
				}
				
				n++;
				
			}
			a = v.gett();
		a=a+d;
			v.echo(a);
			
		}
		
	}
	controller(){m=new model();}
}