package com.STT_WWS.Maven_Projec_AS;

public class Interface implements TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface a = new Interface();
		a.greengo();
		a.redStop();
		
		Interface i = new Interface();
		i.FlashingYellow();
		
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("You can Go");	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("You have to stop now");
	}

	@Override
	public void yellowGetReady() {
		// TODO Auto-generated method stub
		System.out.println("Get Ready to Go");
	}

	public void FlashingYellow() {
		// TODO Auto-generated method stub
		System.out.println("You have your own safety");
	}

}
