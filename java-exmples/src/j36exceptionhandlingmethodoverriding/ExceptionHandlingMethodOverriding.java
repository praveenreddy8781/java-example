package j36exceptionhandlingmethodoverriding;

import java.io.FileNotFoundException;
import java.io.IOException;

//Examples of Exception handling and method overriding in Java

class SuperClass {
//	not declared any exception
	public void method1() {

	}

//	If the method throw exception
	public void method2() throws IOException {

	}
}

class SubClass extends SuperClass {
//	It cann't declare checked exception or chose not to declare any
//	public void method1() {
//		
//	}

//	NumberFormatException unchecked exception
//	public void method1() throws NumberFormatException{
//		
//	}

//	FileNotFoundException checked
//	public void method1() throws FileNotFoundException{
//		
//	}

//	It can declare same exception which super class method declared
//	public void method2() throws IOException{
//		
//	}

//	It can declare the subtype of exception which super class method declared
//	public void method2() throws FileNotFoundException{
//		
//	}

//	Chose not to declare any exception
//	public void method2(){
//		
//	}

//	It cant declare parenttype of exception which super class method declared
//	public void method2() throws Exception{
//		
//	}
}

public class ExceptionHandlingMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
