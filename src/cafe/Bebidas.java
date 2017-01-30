/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

/**
 *
 * @author Mileto-pc
 */
public class Bebidas {
    
    private int codigo;
private String nome;
private int insumo1; // indica qual insumo utiliza para o preparo = apenas 3 opções
private int insumo2;
private int insumo3;
private int qtde; // qtde para uma porção

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the insumo1
     */
    public int getInsumo1() {
        return insumo1;
    }

    /**
     * @param insumo1 the insumo1 to set
     */
    public void setInsumo1(int insumo1) {
        this.insumo1 = insumo1;
    }

    /**
     * @return the insumo2
     */
    public int getInsumo2() {
        return insumo2;
    }

    /**
     * @param insumo2 the insumo2 to set
     */
    public void setInsumo2(int insumo2) {
        this.insumo2 = insumo2;
    }

    /**
     * @return the insumo3
     */
    public int getInsumo3() {
        return insumo3;
    }

    /**
     * @param insumo3 the insumo3 to set
     */
    public void setInsumo3(int insumo3) {
        this.insumo3 = insumo3;
    }

    /**
     * @return the qtde
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * @param qtde the qtde to set
     */
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    
}
