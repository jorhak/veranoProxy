/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author jorhak
 */
public class ElementoReal implements IElemento{
    private String host;
    private String database;
    private String user;
    private String password;
    private int port;

    private Connection con;

    private static ElementoReal instance;

    private ElementoReal() {
        connect();
    }

    public static ElementoReal getInstance() {
        if (instance == null) {
            instance = new ElementoReal();
        }
        return instance;
    }
    
    public void setDato(Map<String,String> dato){
        this.host = dato.getOrDefault("host", "");
        this.database = dato.getOrDefault("database", "");
        this.user = dato.getOrDefault("user", "");
        this.password = dato.getOrDefault("password", "");
        this.port = Integer.parseInt(dato.getOrDefault("port", ""));
    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(true);
            System.out.println("conexion realizada con exito a MySQL");
        } catch (Exception e) {
            con = null;
            System.out.println("conexion fallida");
        }
    }

    @Override
    public Connection getConnection(Map<String,String> dato) {
        setDato(dato);
        if (con == null) {
            connect();
        }
        return con;
    }

    public void closeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
        }
        con = null;
    }
}
