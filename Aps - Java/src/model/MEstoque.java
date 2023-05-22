/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class MEstoque {
    
    private int estId;
    private int estQuantidade;
    private double estPreco;
    private int estTipoMov;
    private Date estData;
    private int estIdProd;
    private int estIdUsu;

    /**
     * @return the estId
     */
    public int getEstId() {
        return estId;
    }

    /**
     * @param estId the estId to set
     */
    public void setEstId(int estId) {
        this.estId = estId;
    }

    /**
     * @return the estQuantidade
     */
    public int getEstQuantidade() {
        return estQuantidade;
    }

    /**
     * @param estQuantidade the estQuantidade to set
     */
    public void setEstQuantidade(int estQuantidade) {
        this.estQuantidade = estQuantidade;
    }

    /**
     * @return the estPreco
     */
    public double getEstPreco() {
        return estPreco;
    }

    /**
     * @param estPreco the estPreco to set
     */
    public void setEstPreco(double estPreco) {
        this.estPreco = estPreco;
    }

    /**
     * @return the estTipoMov
     */
    public int getEstTipoMov() {
        return estTipoMov;
    }

    /**
     * @param estTipoMov the estTipoMov to set
     */
    public void setEstTipoMov(int estTipoMov) {
        this.estTipoMov = estTipoMov;
    }

    /**
     * @return the estData
     */
    public Date getEstData() {
        return estData;
    }

    /**
     * @param estData the estData to set
     */
    public void setEstData(Date estData) {
        this.estData = estData;
    }

    /**
     * @return the estIdProd
     */
    public int getEstIdProd() {
        return estIdProd;
    }

    /**
     * @param estIdProd the estIdProd to set
     */
    public void setEstIdProd(int estIdProd) {
        this.estIdProd = estIdProd;
    }

    /**
     * @return the estIdUsu
     */
    public int getEstIdUsu() {
        return estIdUsu;
    }

    /**
     * @param estIdUsu the estIdUsu to set
     */
    public void setEstIdUsu(int estIdUsu) {
        this.estIdUsu = estIdUsu;
    }
    
    
}
