/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package desafioprojeto3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author unity
 */
public class FXMLDocument3Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button addSaldo;

    @FXML
    private ChoiceBox<?> escolha;

    @FXML
    private ListView<?> listaLivros;

    @FXML
    private Label saldoLabel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
