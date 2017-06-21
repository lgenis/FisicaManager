package main;

public class FisicaComputer {
	
	public float computePesoEnTierra(Fisica objetoConFisica){
		float peso=Fisica.GRAVEDAD_TIERRA*objetoConFisica.getMasa();
		return peso;
	}
	
	public float computePesoEnLuna(Fisica objetoConFisica){
		float peso = Fisica.GRAVEDAD_LUNA*objetoConFisica.getMasa();
		return peso;
	}
	
	@Deprecated
	public float computePesoEnTierra(Solido objetoConFisica){
		float peso=Fisica.GRAVEDAD_TIERRA*objetoConFisica.getMasa();
		return peso;
	}
}
