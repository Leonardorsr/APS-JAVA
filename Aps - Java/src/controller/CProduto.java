/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.MProduto;

/**
 *
 * @author Administrador
 */
public class CProduto extends util.ConexaoSQLite {
    

    
    public ArrayList<MProduto> getListaProdutoController() {
        MProduto modelProduto = new MProduto();
        ArrayList<MProduto> listaModelProdutos = new ArrayList<>();
        this.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT "
                + "pk_pro_id, "
                + "pro_descricao, "
                + "pro_quantidade, "
                + "pro_valor "
                + " FROM tbl_produto";
        try {
            preparedStatement = criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelProduto = new MProduto();
                modelProduto.setProId(resultSet.getInt("pk_pro_id"));
                modelProduto.setProDescricao(resultSet.getString("pro_descricao"));
                modelProduto.setProQuantidade(resultSet.getInt("pro_quantidade"));
                modelProduto.setProValor(resultSet.getDouble("pro_valor"));
                listaModelProdutos.add(modelProduto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaModelProdutos;
    }

    
    public boolean salvarProdutoController(MProduto pModelProduto) {
        this.conectar();
        String sql
                = "INSERT "
                + " INTO tbl_produto ("
                + "pro_descricao,"
                + "pro_quantidade,"
                + "pro_valor "
                + ") VALUES (?,?,?);";

        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pModelProduto.getProDescricao());
            preparedStatement.setInt(2, pModelProduto.getProQuantidade());
            preparedStatement.setDouble(3, pModelProduto.getProValor());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.err.println(ex.getMessage());
                }
            }
        }
        this.desconectar();
        return true;
    }

    
    public boolean alterarProdutoController(MProduto modelProduto) {
        this.conectar();
        String sql
                = "UPDATE tbl_produto"
                + " SET "
                + "pro_descricao = ?, "
                + "pro_valor = ? "
                + "WHERE pk_pro_id = '" + modelProduto.getProId() + "';";

        PreparedStatement preparedStatement = this.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, modelProduto.getProDescricao());
            preparedStatement.setDouble(2, modelProduto.getProValor());
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.err.println(ex.getMessage());
                }
            }
        }
        this.desconectar();
        return true;
    }

    
    public MProduto getProdutoController(int codigoProduto) {
        MProduto modelProduto = new MProduto();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT pk_pro_id, "
                + "pro_descricao, "
                + "pro_quantidade, "
                + "pro_valor "
                + " FROM tbl_produto "
                + " WHERE pk_pro_id = '" + codigoProduto + "'";

        try {
            preparedStatement = criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelProduto = new MProduto();
                modelProduto.setProId(resultSet.getInt("pk_pro_id"));
                modelProduto.setProDescricao(resultSet.getString("pro_descricao"));
                modelProduto.setProQuantidade(resultSet.getInt("pro_quantidade"));
                modelProduto.setProValor(resultSet.getDouble("pro_valor"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return modelProduto;
    }
    
    
    public MProduto getProdutoController(String pDescricao) {
        MProduto modelProduto = new MProduto();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT pk_pro_id, "
                + "pro_descricao, "
                + "pro_quantidade, "
                + "pro_valor "
                + " FROM tbl_produto "
                + " WHERE pro_descricao = '" + pDescricao + "'";

        try {
            preparedStatement = criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelProduto = new MProduto();
                modelProduto.setProId(resultSet.getInt("pk_pro_id"));
                modelProduto.setProDescricao(resultSet.getString("pro_descricao"));
                modelProduto.setProQuantidade(resultSet.getInt("pro_quantidade"));
                modelProduto.setProValor(resultSet.getDouble("pro_valor"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return modelProduto;
    }

   
    public boolean excluirProdutoController(int codigoProduto) {
        this.conectar();
        String sql = "DELETE FROM tbl_produto WHERE pk_pro_id = '" + codigoProduto + "';";
        PreparedStatement preparedStatement = this.criarPreparedStatement(sql, Statement.NO_GENERATED_KEYS);

        try {
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.err.println(ex.getMessage());
                }
            }
        }
        this.desconectar();
        return true;
    }
    
    
    public boolean validarProdutoFormController(MProduto modelProduto){
        if (null == modelProduto) {
            return false;
        }
        if (null == modelProduto.getProDescricao() || modelProduto.getProDescricao().isEmpty()) {
            return false;
        }
        if (modelProduto.getProValor() < 0) {
            return false;
        }
        if (modelProduto.getProQuantidade() < 0) {
            return false;
        }
        return true;
    }
    
}
