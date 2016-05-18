public final class Principal{
	public Principal(){
		super();
		iniciar();
	}
	private void iniciar(){
		sensorViento sensarV = new sensorViento();
		System.out.println(sensarV.getMedicion());
		System.out.println(sensarV.getDescripcon());
		SensorTemp sensarT = new SensorTemp();
		System.out.println(sensarT.getMedicion());
		System.out.println(sensarT.getDescripcon());
	}
	public static void main (String[] args){
		Principal ver = new Principal();
	}
}