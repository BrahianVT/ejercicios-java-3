//programa que gestiona una exepcion realizada por el programador

class TemperaturaNoValidaExepcion extends Exception{
	public TemperaturaNoValidaExepcion(){
		super("la temperatura no puede ser menor que -273°c");
	}
}
public class conversorTemperatura{
	private final double cero_absoluto = -273.15;
	public conversorTemperatura(){
		super();
	}
	public double celsiusAFharenheit(double celcius) throws TemperaturaNoValidaExepcion{
		if(celcius < cero_absoluto) throw new TemperaturaNoValidaExepcion();
		return 9.0/5.0 * celcius + 32.0;
	}
	public double celsiusAReamur(double celcius) throws TemperaturaNoValidaExepcion{
		if(celcius < cero_absoluto) throw new TemperaturaNoValidaExepcion();
		return 4.0/5.0 * celcius;
	}
	public static void main (String[] args){
	double fharenheit = 0, reamur = 0;
	
	conversorTemperatura conversor = new conversorTemperatura();
		for(int c = 0; c <= 101; c+=5){
			try{
				 fharenheit = conversor.celsiusAFharenheit(c);
				 reamur = conversor.celsiusAFharenheit(c);
				System.out.println(c + "\t" + fharenheit + "\t" + reamur);
			}
			catch(TemperaturaNoValidaExepcion e){
				System.out.println(e.getMessage());
			}
		}
	}
}