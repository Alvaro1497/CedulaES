package pasiente;

public class Datos extends Paciente implements Comparable<Datos> {

	private String enfermedad;
	private String nombre;
	private String apellido;
	private int edad;

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Datos o) {
		if (this.edad > o.getEdad() ) {
			return 1;
		} else if (this.edad == o.getEdad()) {

			return 0;

		} else {
			return -1;
		}

	}
	
	}


