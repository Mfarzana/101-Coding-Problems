/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_base;

/**
 *
 * @author Farzana
 */
 class AnnonymousClass {
    
	protected String s;
	
	public AnnonymousClass(String str){
		this.s = str;
	}
	public void sayHello(){
		System.out.println(s);
	};
	
	void foo(){};

}
public class AnonymousExample {
	
	public static void main(String[] args) {
		
		//anonymous class inside method
		AnnonymousClass h = new AnnonymousClass("abc") {
			@Override
			public void sayHello() {
				System.out.println("Hello anonymous class "+s);
                                
			}
                        
                        
		};
		
		h.sayHello();
		
	}

}

