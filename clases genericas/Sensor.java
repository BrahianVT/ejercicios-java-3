public abstract class Sensor<T>{
	protected  T prueba;
	private String comentario;
	
	public void setDescripcion(String comentario){
		this.comentario = comentario;
	}
	public String getDescripcon(){ return comentario;}
	public T getMedicion(){return prueba;}
}