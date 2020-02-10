package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Moto {
	private SimpleStringProperty nombre;
	private SimpleStringProperty tipo;
	private SimpleIntegerProperty a�o;
	private SimpleIntegerProperty peso;
	private SimpleIntegerProperty cv;
	private SimpleStringProperty carnetNecesario;

	public Moto() {
	}

	public Moto(SimpleStringProperty nombre, SimpleStringProperty tipo, SimpleIntegerProperty a�o,
			SimpleIntegerProperty peso, SimpleIntegerProperty cv, SimpleStringProperty carnetNecesario) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.a�o = a�o;
		this.peso = peso;
		this.cv = cv;
		this.carnetNecesario = carnetNecesario;
	}

	public SimpleStringProperty getNombre() {
		return nombre;
	}

	public void setNombre(SimpleStringProperty nombre) {
		this.nombre = nombre;
	}

	public SimpleStringProperty getTipo() {
		return tipo;
	}

	public void setTipo(SimpleStringProperty tipo) {
		this.tipo = tipo;
	}

	public SimpleIntegerProperty getA�o() {
		return a�o;
	}

	public void setA�o(SimpleIntegerProperty a�o) {
		this.a�o = a�o;
	}

	public SimpleIntegerProperty getPeso() {
		return peso;
	}

	public void setPeso(SimpleIntegerProperty peso) {
		this.peso = peso;
	}

	public SimpleIntegerProperty getCv() {
		return cv;
	}

	public void setCv(SimpleIntegerProperty cv) {
		this.cv = cv;
	}

	public SimpleStringProperty getCarnetNecesario() {
		return carnetNecesario;
	}

	public void setCarnetNecesario(SimpleStringProperty carnetNecesario) {
		this.carnetNecesario = carnetNecesario;
	}
	
}
