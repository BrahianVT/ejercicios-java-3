//ejemplo de clase Enum

public enum semana{
	lunes("Primer dia de semana."),
	martes("Apenas se empieza segundo dia"),
	miercoles("Sin comentarios"),
	jueves("Siempre enmedio"),
	viernes("Ultimo dia de trabajo"),
	sabado("Empieza el fin de semana"),
	domingo("mañana a trabajar");
	private String comentario;
	semana(String comentario){
		this.comentario = comentario;
	}
	public String getComentario(){
		return comentario;
	}
	public static void main (String[] args){
		for(semana dia: semana.values()){
			System.out.println(dia.name());
			System.out.println(dia.ordinal());
			System.out.println(dia.getComentario());
		}
	}
}