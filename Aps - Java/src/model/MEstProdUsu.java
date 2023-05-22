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
public class MEstProdUsu {
    
    private MEstoque modelEstoque;
    private MProduto modelProduto;
    private MUsuario modelUsuario;

    /**
     * @return the modelEstoque
     */
    public MEstoque getModelEstoque() {
        return modelEstoque;
    }

    /**
     * @param modelEstoque the modelEstoque to set
     */
    public void setModelEstoque(MEstoque modelEstoque) {
        this.modelEstoque = modelEstoque;
    }

    /**
     * @return the modelProduto
     */
    public MProduto getModelProduto() {
        return modelProduto;
    }

    /**
     * @param modelProduto the modelProduto to set
     */
    public void setModelProduto(MProduto modelProduto) {
        this.modelProduto = modelProduto;
    }

    /**
     * @return the modelUsuario
     */
    public MUsuario getModelUsuario() {
        return modelUsuario;
    }

    /**
     * @param modelUsuario the modelUsuario to set
     */
    public void setModelUsuario(MUsuario modelUsuario) {
        this.modelUsuario = modelUsuario;
    }
    
}
