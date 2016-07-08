
package com.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;

import modelo.persona;
import org.springframework.ui.Model;

@Controller
public class CargarController {

   
    Conexion cnn = new Conexion();
    @RequestMapping("mostrar.html")
    public String mostrar(Model modelo) {
     
        ResultSet res = cnn.consultarTodo();
        ArrayList<persona> milista = new ArrayList<persona>();
      try {
          while(res.next())
          {
              milista.add(new persona(res.getString("Nombre"), res.getString("Apellido"), res.getInt("Cedula")));
          }
      } catch (SQLException ex) {
          Logger.getLogger(CargarController.class.getName()).log(Level.SEVERE, null, ex);
      }
       
        modelo.addAttribute("lista", milista);
        return "Home/mostrar";
    }
    
}
