package com.abstract2;

public class Test2 extends Test {
	

	public static void main(String[] args) {
		Test2 t=new Test2();
		t.show();
        System.out.println(t.getData());
	}

	@Override
	public void show() {
		System.out.println("My name is show");
		
	}

	@Override
	public String getData() {
		String name="My name is Hanumant";
		
		return name;
	}

}
