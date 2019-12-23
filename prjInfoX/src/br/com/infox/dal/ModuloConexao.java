/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * DAL - DATA ACCESS LAYER
 * @author André Luis
 */
 public class ModuloConexao {

    //Método responsável pela conexão com o BD
   public static Connection conector() {
        //Variáel que recebe a string de conexão
        java.sql.Connection conexao = null;
        //Carregar driver
        String driver = "com.mysql.cj.jdbc.Driver";
        
        //Variáveis que armazenam informções do banco de dados...
        String url = "jdbc:mysql://192.168.1.114/dbinfox";
        String user = "AndreLGSilva";
        String password = "Missoes@3";
        
        //Estabelecendo a conexão com o BD...
        try {
            Class.forName(driver); //Executa o arquivo do driver
            conexao = DriverManager.getConnection(url, user, password); // Variáveis criadas anteriormente
            return conexao; //Retorno
        } catch (Exception e) {
            System.out.println("Não conectou " + e);
            return null;
        }
    }
}
