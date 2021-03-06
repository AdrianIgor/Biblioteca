/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javafx.scene.image.Image;

/**
 *
 * @author unity
 */
public class Livro {
    
    private String codigo;
    private String nomeLivro;
    private int paginas;
    private String autor;
    private double preco;
    private String categoria;
    private String sinopse;
    private int edicao;
    private String imagem;

    public Livro(String codigo, String nomeLivro, int paginas, String autor
            , double preco, String categoria, String sinopse, int edicao, String imagem) {
        this.codigo = codigo;
        this.nomeLivro = nomeLivro;
        this.paginas = paginas;
        this.autor = autor;
        this.preco = preco;
        this.categoria = categoria;
        this.sinopse = sinopse;
        this.edicao = edicao;
        this.imagem = imagem;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
     public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
