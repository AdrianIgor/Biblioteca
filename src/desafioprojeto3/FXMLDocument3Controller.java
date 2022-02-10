/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package desafioprojeto3;

import desafioprojeto4.DesafioProjeto4;
import desafioprojeto5.DesafioProjeto5;
import entidades.Livro;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import listas.Lista;

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
    private ChoiceBox<String> escolha;

    @FXML
    private Button botaoFiltro;
    
    @FXML
    private ListView<String> listaLivros;

    @FXML
    private Label saldoLabel;
    
    private static Livro selecionado;
    
    private List<Livro> selecionados = new ArrayList<>();
    
    @FXML
    void addSaldo(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        new DesafioProjeto4().start(stage);
    }
    
    @FXML
    void escolhaCategoria(){
        listaLivros.getItems().clear();
        Lista lista = new Lista();
        int i = 0; 
        for(Livro l : lista.getLivros()){
            if(l.getCategoria().contains(this.escolha.getSelectionModel().getSelectedItem())){
                listaLivros.getItems().add(i, l.getNomeLivro());
                selecionados.add(l);
                i++;
            }
        }
    }
    
    @FXML
    void entrarLivro() throws IOException{
        selecionados.stream().filter(l -> (l.getNomeLivro().contains(this.listaLivros.getSelectionModel().getSelectedItem()))).forEachOrdered(l -> {
            selecionado = l;
        });
        Stage stage = new Stage();
        new DesafioProjeto5().start(stage);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        List<String> listaCategoria = new ArrayList<>();
        listaCategoria.add("Infantil");
        listaCategoria.add("Romance");
        listaCategoria.add("História");
        listaCategoria.add("Psicologia");
        listaCategoria.add("Mistério");
        
        escolha.setItems(FXCollections.observableArrayList(listaCategoria));
    }    
    
    public static Livro getSelecionado(){
        return selecionado;
    }
}
