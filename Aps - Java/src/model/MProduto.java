/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrador
 */
public class MProduto {
    
    private int proId;
    private String proDescricao;
    private int proQuantidade;
    private double proValor;

    
    /**
     * @return the proId
     */
    public int getProId() {
        return proId;
    }

    /**
     * @param proId the proId to set
     */
    public void setProId(int proId) {
        this.proId = proId;
    }

    /**
     * @return the proDescricao
     */
    public String getProDescricao() {
        return proDescricao;
    }

    /**
     * @param proDescricao the proDescricao to set
     */
    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    /**
     * @return the proQuantidade
     */
    public int getProQuantidade() {
        return proQuantidade;
    }

    /**
     * @param proQuantidade the proQuantidade to set
     */
    public void setProQuantidade(int proQuantidade) {
        this.proQuantidade = proQuantidade;
    }

    /**
     * @return the proValor
     */
    public double getProValor() {
        return proValor;
    }

    /**
     * @param proValor the proValor to set
     */
    public void setProValor(double proValor) {
        this.proValor = proValor;
    }
    
    
}
