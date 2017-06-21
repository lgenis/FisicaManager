package main;

public class Solido implements Fisica{
	private float masa;
	
	@Override
	public float getMasa(){
		//TODO calculo de masa
		return masa;
	}

	@Override
	public float getDensidad() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public float getVolumen(){
		return 10;
	}
	
	public void setMasa(float f){
		this.masa=f;
	}
}
