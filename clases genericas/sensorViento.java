import java.util.Random;
public class sensorViento extends Sensor <vViento>{
	private Random velocidad = new Random();
	static final float vel_max =100;
	public sensorViento(){
		super();
		setDescripcion();
		float angulo = (float)(velocidad.nextFloat() * Math.PI);
		float seno = (float)(Math.sin(angulo));
		float coseno = (float)(Math.cos(angulo));
		prueba = new vViento(velocidad.nextFloat() *vel_max  , coseno , seno);
	}
	public void setDescripcion(){ super.setDescripcion("Sensor de viento");}
}