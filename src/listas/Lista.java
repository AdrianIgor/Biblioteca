/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import entidades.Livro;
import entidades.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author unity
 */
public class Lista {
    
    private List<Livro> livros = new ArrayList<Livro>();
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Lista(){
        this.livros = allLivros();
    }
    
    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    private List<Livro> allLivros(){
        List<Livro> livrosAux = new ArrayList<>();
        livrosAux.add(new Livro("4324", "O pequeno príncipe", 93, "Antoine de Saint-Exupéry", 12.90, "Infantil", 
                "O próprio autor do livro conta sobre o fatídico dia em que seu avião cai no \nmeio do Deserto do Saara, onde ele se depara com o pequeno príncipe.", 1
                , "/imagens/livro1.jpg"));
        
        livrosAux.add(new Livro("8693", "Helena", 280, "Machado de Assis", 16.70, "Romance", 
                "A protagonista de origens humildes é reconhecida em testamento como filha e \nherdeira do conselheiro Vale, homem de elite carioca do segundo império.", 1
                , "/imagens/livro2.jpg"));
        
        livrosAux.add(new Livro("5332", "Sapiens-uma breve história da humanidade", 443, "Yuval Harari", 59.90, "História", 
                "O autor aborda a história da humanidade sob uma perspectiva inovadora, de \nprimatas insignificantes a senhores do mundo.", 1
                , "/imagens/livro3.jpg"));
        
        livrosAux.add(new Livro("7540", "Mindset: a nova psicologia do sucesso", 312, "Carol S. Dweck, Ph. D.", 31.90, "Psicologia", 
                "Se trata de uma atitude mental com que esperamos a vida, uma explicação de \npor que somos otimistas ou pessimistas, bem-sucedidos ou não.", 1
                , "/imagens/livro4.jpg"));
        
        livrosAux.add(new Livro("6149", "Assassinato no expresso do oriente", 240, "Agatha Christie", 31.43, "Mistério", 
                "Um detetive famoso embarca no trem expresso do oriente, nela acontece uma \nsérie de crimes durante a viagem, iniciando uma investigação para descobrir quem é o assassino.", 1
                , "/imagens/livro5.jpg"));
        
        return livrosAux;
    }
}
