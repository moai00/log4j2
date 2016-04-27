/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriallog4j;

/**
 *
 * @author usu21
 */
import org.apache.log4j.Logger;

public class HelloExample2{
	
	final static Logger logger = Logger.getLogger(HelloExample2.class);
	
	public static void main(String[] args) {
	
		HelloExample2 obj = new HelloExample2();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){
			logger.error("Sorry, algo fallo!", ex);
		}
		
		
	}
	
	private void divide(){
		
		int i = 10 /0;

	}
	
}