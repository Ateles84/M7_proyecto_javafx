package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class FormTablaController implements Initializable {

	@FXML
	TableView<Moto> tv;

	@FXML
	TableColumn<Moto, String> tbNombre;

	@FXML
	TableColumn<Moto, String> tbTipo;

	@FXML
	TableColumn<Moto, Integer> tbAno;

	@FXML
	TableColumn<Moto, Integer> tbPeso;

	@FXML
	TableColumn<Moto, Integer> tbCVs;

	@FXML
	TableColumn<Moto, String> tbCarnet;

	@FXML
	TextField tfNombre;

	@FXML
	TextField tfTipo;

	@FXML
	TextField tfAno;

	@FXML
	TextField tfPeso;

	@FXML
	TextField tfCVs;

	@FXML
	RadioButton rbA1;

	@FXML
	RadioButton rbA2;
	
	@FXML
	RadioButton rbA;

	private ObservableList<Moto> ol;
	private ToggleGroup tg;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ol = FXCollections.observableList(new ArrayList<Moto>());
		tg = new ToggleGroup();
		
		tbNombre.setCellValueFactory(new PropertyValueFactory<Moto, String>("nombre"));
		tbTipo.setCellValueFactory(new PropertyValueFactory<Moto, String>("tipo"));
		tbAno.setCellValueFactory(new PropertyValueFactory<Moto, Integer>("año"));
		tbPeso.setCellValueFactory(new PropertyValueFactory<Moto, Integer>("peso"));
		tbCVs.setCellValueFactory(new PropertyValueFactory<Moto, Integer>("cvs"));
		tbCarnet.setCellValueFactory(new PropertyValueFactory<Moto, String>("carnetNecesario"));


		rbA1.setToggleGroup(tg);
		rbA2.setToggleGroup(tg);
		rbA.setToggleGroup(tg);
		
	}

	@FXML
	void anadirMoto() {
		
		SimpleStringProperty nombre = new SimpleStringProperty(tfNombre.getText());
		SimpleStringProperty tipo = new SimpleStringProperty(tfTipo.getText());
		SimpleIntegerProperty año = new SimpleIntegerProperty(Integer.parseInt(tfAno.getText()));
		SimpleIntegerProperty peso = new SimpleIntegerProperty(Integer.parseInt(tfPeso.getText()));
		SimpleIntegerProperty cvs = new SimpleIntegerProperty(Integer.parseInt(tfCVs.getText()));
		RadioButton carnetBtn= (RadioButton) tg.getSelectedToggle();
		SimpleStringProperty carnetNecesario = new SimpleStringProperty(carnetBtn.getText());
		
		ol.add(new Moto(nombre, tipo, año, peso, cvs, carnetNecesario));
		
		tv.setItems(ol);
	}

}
