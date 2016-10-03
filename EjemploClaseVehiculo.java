public class EjemploClaseVehiculo{
	String color;
	String placa;
	int cilindraje;
	int velocidad;
	String marchaActual;

	public void acelerar(int valorIncrementoDeVelocidad){
		velocidad = velocidad + valorIncrementoDeVelocidad;
	}

	public void frenar(int valorDecrementoDeVelocidad){
		velocidad = velocidad - valorDecrementoDeVelocidad;
	}

	public void cambiarDeMarcha(String marchaNueva){
		marchaActual = marchaNueva;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getPlaca(){
		return placa;
	}

	public void setPlaca (String placa){
		this.placa = placa;
	}

	public int getCilindraje(){
		return cilindraje;
	}

	public void setCilindraje(int cilindraje){
		this.cilindraje = cilindraje;
	}
}