/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.MEstoque;

/**
 *
 * @author Administrador
 */
public class CEstoque extends util.ConexaoSQLite {


    public boolean salvarEstoqueController(MEstoque modelEstoque) {
        this.conectar();
        String sql
                = "INSERT "
                + " INTO tbl_estoque ("
                + "est_quantidade,"
                + "est_preco,"
                + "fk_uso_id,"
                + "fk_pro_id,"
                + "est_data,"
                + "est_tipo_mov "
                + ") VALUES (?,?,?,?,?,?);";

        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setInt(1, modelEstoque.getEstQuantidade());
            preparedStatement.setDouble(2, modelEstoque.getEstPreco());
            preparedStatement.setInt(3, modelEstoque.getEstIdUsu());
            preparedStatement.setInt(4, modelEstoque.getEstIdProd());
            preparedStatement.setDate(5, (Date) modelEstoque.getEstData());
            preparedStatement.setInt(6, modelEstoque.getEstTipoMov());
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
    }
