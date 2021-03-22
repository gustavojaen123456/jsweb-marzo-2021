package ar.com.educacionit.clase3.laboratorioFinal;

import java.util.Arrays;

public class Alumno extends Persona {
	private String[] cursos;

	public Alumno(String nombre, String apellido, Documento documento, byte edad, String[] cursos) {
		super(nombre, apellido, documento, edad);
		this.cursos = cursos;
	}
	
	

	public String[] getCursos() {
		return cursos;
	}

	@Override
	public String toString() {
		return "Alumno [toString()=" + super.toString() + ", cursos=" + Arrays.toString(cursos) + "]";
	}



	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

}