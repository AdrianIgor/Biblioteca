/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package desafioprojeto5;

import desafioprojeto3.FXMLDocument3Controller;
import desafioprojeto4.*;
import entidades.Livro;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author unity
 */
public class FXMLDocument5Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ImageView image;
    
    @FXML
    private Label autorLabel;

    @FXML
    private Button comprarLivro;

    @FXML
    private Label edicaoLabel;

    @FXML
    private Label nomeLabel;

    @FXML
    private Label paginaLabel;

    @FXML
    private Label precoLabel;

    @FXML
    private Label sinopseLabel;
    
    private void load(Livro livro){
        try{
            nomeLabel.setText("Nome: " + livro.getNomeLivro());
            autorLabel.setText("Autor: " + livro.getAutor());
            paginaLabel.setText("Número de páginas: " + String.valueOf(livro.getPaginas()));
            edicaoLabel.setText("Edição: " + String.valueOf(livro.getEdicao()));
            precoLabel.setText("Preço: " + String.valueOf(livro.getPreco()));
            sinopseLabel.setText("Sinopse: " + livro.getSinopse());
            Image imagem = new Image(livro.getImagem());
            image.setImage(imagem);
            image.setVisible(true);
        }catch(Exception ex){
            nomeLabel.setText("Nome: ");
            autorLabel.setText("Autor: ");
            paginaLabel.setText("Número de páginas: ");
            edicaoLabel.setText("Edição: ");
            precoLabel.setText("Preço: ");
            sinopseLabel.setText("Sinopse: ");
            image.setVisible(true);
        }
    }
    
    @FXML
    public void comprar(){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        load(FXMLDocument3Controller.getSelecionado());
    }    
    
}
