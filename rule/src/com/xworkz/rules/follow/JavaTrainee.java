package com.xworkz.rules.follow;

public abstract  class JavaTrainee extends Person implements XworkzRule{
	
	 abstract boolean training();
	
     abstract boolean executeProgram();
	

	
	@Override
	public boolean uploadedTask() {
		// TODO Auto-generated method stub
		System.out.println("entered uploaded task");

		return false;
	}

	@Override
	public boolean completeProgram() {
		// TODO Auto-generated method stub
		System.out.println("entered complete program");

		return false;
	}
	@Override
	public boolean eat() {
		System.out.println("entered eat");

		return false;
	}
    @Override
	public boolean sleep() {
		System.out.println("entered sleep");

		return false;
	}
}
