import java.util.Random;
public class SensorTemp extends Sensor <Float>{
	static final float maxTemp = 45;
	private Random temperatura = new Random();
	public SensorTemp(){
		super();
		prueba = new Float(maxTemp * temperatura.nextFloat()); 
		setDescripcion();
	}
	public void setDescripcion(){
		super.setDescripcion("Sensor de temperatura");
	}
}