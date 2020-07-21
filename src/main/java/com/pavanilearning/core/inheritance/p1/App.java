package com.pavanilearning.core.inheritance.p1;

/**
 * Hello world!
 *
 */
public abstract class App 
{
	//abstract class hide implementation details and shows only functionality to the user
	
	// if a method is declared as abstract then class should be defined as abstract.
	
	public static String variableName;
	//public abstract String name;  compile time error/ 
	//only  public, protected, private, static, final, transient & volatile are permitted
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public App() {

    }
    
    public abstract String getString();
    
    public static void getMethod() {
    	
	}
    
    public void getM1(){
    	
    }
    
}
