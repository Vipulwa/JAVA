package com.assignment1.demo;
abstract class Animal{
	public abstract void respirate();
	public abstract void talk();
}

class Cat extends Animal{

	@Override
	public void respirate() {
		System.out.println("Inside Cat Respirate");
	}
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Inside Cat Talk");
	}
	
}
class Dog extends Animal{

	@Override
	public void respirate() {
		// TODO Auto-generated method stub
		System.out.println("Inside Dog Respirate");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Inside Dog Talk");
	}
	
}

class Lion extends Animal{

	@Override
	public void respirate() {
		// TODO Auto-generated method stub
		System.out.println("Inside Lion Respirate");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Inside Lion Talk");
	}
	
}


public class AbstractClassDemo {

	public static void main(String[] args) {
		int count=0;
		Animal animals[]= new Animal[10];
		Animal cat=new Cat();
		animals[0]=cat;
		count++;
		Animal dog=new Dog();
		animals[1]=dog;
		count++;
		Animal lion=new Lion();
		animals[2]=lion;
		count++;
		for(int i=0;i<count;i++) {
			animals[i].respirate();
			animals[i].talk();
		}
		
	}

}
