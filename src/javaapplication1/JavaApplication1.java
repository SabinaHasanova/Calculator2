/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner scan=new Scanner(System.in);
        String regex = "[0-9]+";
        
        System.out.println("İlk rəqəmi daxil edin :");      
        String NUM1=scan.nextLine();
        
        System.out.println("Ikinci rəqəmi daxil edin :");
        String NUM2=scan.nextLine();
        
        System.out.println("Operatoru daxil edin :");
        String operator=scan.nextLine();
        
       
        if(!NUM1.matches(regex))
	{
		System.out.println("İlk rəqəmi düzgün rəqəm daxil edin!");
		
	}
        else if(!NUM2.matches(regex))
        {
            System.out.println("İkinci  rəqəmi düzgün daxil edin!");
        }
       
        
	else {
		double result=0;
                boolean check=false;
		double num1 = Double.parseDouble(NUM1);
		double num2 = Double.parseDouble(NUM2);
		
		
		if(operator.equals("+"))
		{       check=true;
			result=num1+num2;
		}
		else if(operator.equals("-"))
		{       check=true;
			result=num1-num2;
		}
		else if(operator.equals("*"))
		{        check=true;
			result=num1*num2;
		}
		else if(operator.equals("/"))
		{
			if(num2==0)
			{       check=false;
				System.out.println("0 ra bolmek olmaz");
				
			}else {
                            check=true;
                            result=num1/num2;
                        }
			
		}
		else if(operator.equals("%"))
		{check=true;
			result=num1%num2;
		}
		else{
                    check=false;
	             System.out.println("Operator düzgün deyil :"+operator);
		}
                
                if(check==true){
			System.out.println("Nəticə : "+num1+" "+operator+" "+num2+"=" +result);
                }
	}
}
    }
    

