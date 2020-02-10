package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class ListViewController implements Initializable {

	ArrayList<String> arr = new ArrayList<String>();
	ObservableList<String> ol;

	@FXML
	ListView<String> lstMotos;
	@FXML
	TextField tf;

	@FXML
	Button bAgregar;

	@FXML
	Button bBorrar;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		llenarLista();
		lstMotos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	}

	void llenarLista() {
		arr.add("Yamaha YZF R1");
		arr.add("Honda CB1000RR Fireblade");
		arr.add("Kawasaki Ninja ZX10R");
		arr.add("BMW S1000RR");

		ol = FXCollections.observableArrayList();
		
		ol.add("Yamaha YZF R1");
		ol.add("Honda CB1000RR Fireblade");
		ol.add("Kawasaki Ninja ZX10R");
		ol.add("BMW S1000RR");

		lstMotos.setItems(ol);
	}

	@FXML
	void agregarMoto() {
		ol.add(tf.getText());
		lstMotos.setItems(ol);
	}

	@SuppressWarnings("unlikely-arg-type")
	@FXML
	void eliminarSeleccion() {
		/*
		 * lstMotos.getSelectionModel().getSelectedIndices().stream().sorted(Collections
		 * .reverseOrder()) .forEach(x -> System.out.println(ol.remove(x) + " - x: "+
		 * x));
		 */
		
		ObservableList<Integer> auxarr = lstMotos.getSelectionModel().getSelectedIndices();

		for (int i = auxarr.size()-1; i >= 0 ; i-- ) {
			System.out.println(ol.remove(auxarr.get(i)));	
			System.out.println(auxarr.get(i));
		}
		
		System.out.println(ol.remove(3));
		
		lstMotos.setItems(ol);
	}

}
