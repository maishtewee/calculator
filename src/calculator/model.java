package calculator;

import javax.swing.JOptionPane;

public class model {
	public static double z;
	static public final String WITH_DELIMITERS = "((?<=%1$s)|(?=%1$s))";
	boolean ne=false;
public double sqrt(String s){

	double d=0;
	try{
		d=answer(s);
		return Math.sqrt(d);
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, "ERROR!","please enter a number",JOptionPane.ERROR_MESSAGE);
		
		
	}
	return 0;
	}



public double answer(String g){
	double a=0;
	try{
		if(g!=null){
		String[] tokens = g .split(String.format(WITH_DELIMITERS, "[%*/+-]"));
		if(tokens[0].equals("-")) ne=true;
		
		if(tokens.length==1) return Double.parseDouble(g);
		if(tokens.length>=3||ne==true){ 	
		String op=tokens[1];
		double n1,n2;
		if(ne&&tokens.length>3){n1=Double.parseDouble(tokens[1])*-1; n2=Double.parseDouble(tokens[3]); op=tokens[2];}
		else{ n1=Double.parseDouble(tokens[0]); n2=Double.parseDouble(tokens[2]);}
		switch(op)
		{
		case "+":
			a=plus(n1,n2);
			break;
		case "-":
		a=minus(n1,n2);
		 break;
		case "/": 
			a= div(n1,n2);
			break;
		
		case "*":
			a=mul(n1,n2);
			break;
		case "%":
			a=mod(n1,n2);
			break;
		default: JOptionPane.showMessageDialog(null, "ERROR!","Try Again",JOptionPane.ERROR_MESSAGE);
		}
		
		
		}
		
	}
		}
	catch(Exception p){
		
	JOptionPane.showMessageDialog(null, "ERROR!","ERROR",JOptionPane.ERROR_MESSAGE);
	}
	
	
	return a;
	
}

public static double plus(double a,double b){ z= a+b; return z;}


public static double minus(double a,double b){ return a-b;}

public static double mul(double a,double b){ return a*b;}

public static double div (double a,double b){ 
	double x=0;
	
try{	
	x= a/b;}

catch(Exception  e){
	JOptionPane.showMessageDialog(null, "ERROR!","Can't divide on zero",JOptionPane.ERROR_MESSAGE);
	
	
}
return x;
}
public static double sqrtt(double a){ 
	try{}
	catch(Exception e){
		
		JOptionPane.showMessageDialog(null, "ERROR","Nuber can't be minus",JOptionPane.ERROR_MESSAGE);
		
	}
	
	return Math.sqrt(a);}
public static double mod(double a,double b){ return a%b;}








}

