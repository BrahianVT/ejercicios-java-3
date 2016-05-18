public class vViento{
	private float intencidad;
	private Direccion direccion;
	
	class Direccion{
		private float v_x,v_y;
		public Direccion(float v_x , float v_y){
			this.v_x = v_x;
			this.v_y = v_y;
		}
		public String toString(){return "[ " + v_x +" , " + v_y + "]";}
	}
	public vViento(){super();}
	public vViento(float intencidad , float v_x , float v_y){
		this.intencidad = intencidad;
		direccion = new Direccion(v_x , v_y);
	}
	public  float getIntencidad(){ return intencidad;}
	public String toString(){return "Intencidad : " + intencidad + " Direccion :" + direccion;}
}