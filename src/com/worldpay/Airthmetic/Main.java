package com.worldpay.Airthmetic;

import com.worldpay.ApiArithmeticOperations.*;

public class Main {
	public static void main(String args[]) throws Exception{
		Sum s=new Sum();
	s.sumMethod(10, 30);
	
   Divide d=new Divide();
   d.divideMethod(20, 10);
   
   Multiply m=new Multiply();
   m.multiplyMethod(50, 20);
	}
}
