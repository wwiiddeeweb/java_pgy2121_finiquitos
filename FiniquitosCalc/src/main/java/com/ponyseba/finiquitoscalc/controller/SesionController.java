/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.controller;

import com.ponyseba.finiquitoscalc.db.MySqlConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.SesionUsuario;
import model.Usuario;

/**
 *
 * @author sebastiankravetz
 */
public class SesionController {
    
    private Usuario usuario = new Usuario();
    private boolean estaLogueado = false;
    
    public boolean iniciarSesion() {
        //
        
        String email, password = "";
        
        boolean esValido = this.validarUsuario(email, password);
        
        Usuario usuarioLogueado = UsuarioController.obtenerUsuario(id);
        usuario = usuarioLogueado;
        return false;
    }
    
    public static boolean cerrarSesion() {
        //
        return false;
    }
    
    
    public SesionUsuario validarUsuario (String email, char [] passwordArr){
        // se llama a la bbdd para validar el usuario...
        // retorna true ó false
        
        String password = String.valueOf(passwordArr);
        
        boolean usuarioValido = false;
        SesionUsuario sesionUsuario = new SesionUsuario();
        Usuario usuarioLogueado = new Usuario();
        
        try {
            
            MySqlConnector connector = new MySqlConnector();
            Connection bdconnect = connector.createConnection();

            String queryUsuario = "SELECT id_usuario, email, password FROM Usuario WHERE email=?";
            String queryPassword = "SELECT id_usuario, email, password FROM Usuario WHERE email=? AND password=?";
        
            PreparedStatement stmtUsuario = bdconnect.prepareStatement(queryUsuario);
            stmtUsuario.setString(1, email);
            ResultSet rsUsuario = stmtUsuario.executeQuery();
            
            PreparedStatement stmtUsuarioPassword = bdconnect.prepareStatement(queryPassword);
            stmtUsuarioPassword.setString(1, email);
            stmtUsuarioPassword.setString(2, password);
            ResultSet rsUsuarioPassword;
            
            if (!rsUsuario.next()) {
              sesionUsuario.setSesionValida(false);
              sesionUsuario.setMensajeError("Usuario no existe");
              sesionUsuario.setUsuarioLogueado(null);
            } 
            
            if (rsUsuario.next()) {
                rsUsuarioPassword = stmtUsuarioPassword.executeQuery();
                if(rsUsuarioPassword.next()) {
                    sesionUsuario.setSesionValida(true);
                    sesionUsuario.setMensajeError("");
                    usuarioLogueado.setIdUsuario(rsUsuarioPassword.getInt("id_usuario"));
                    usuarioLogueado.setEmail(rsUsuarioPassword.getString("email"));
                    usuarioLogueado.setPassword(rsUsuarioPassword.getString("password"));
                    sesionUsuario.setUsuarioLogueado(usuarioLogueado);
                } else {
                    sesionUsuario.setSesionValida(false);
                    sesionUsuario.setMensajeError("Password Incorrecta!");
                    sesionUsuario.setUsuarioLogueado(null);
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error en el inicio de sesión de usuario : " + e.getMessage());
            return new SesionUsuario(false,"Error inicio de sesión", null);
        }
        
        return sesionUsuario;
        
    }
    
    

    
}
