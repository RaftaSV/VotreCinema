/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import static com.mysql.cj.util.StringUtils.getBytes;
import com.unab.edu.sv.Entidades.Carteleras;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ClsCarteleras {

    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();

    public ArrayList<Carteleras> CargarDatos() {
        ArrayList<Carteleras> lista = new ArrayList<>();
        try {
            CallableStatement call = conectar.prepareCall("call SP_S_CARTELERA()");
            ResultSet resultado = call.executeQuery();
            while (resultado.next()) {
                Carteleras cart = new Carteleras();
                cart.setIdcartelera(resultado.getInt("idCarteleras"));
                cart.setPortada(resultado.getBytes("portada"));
                cart.setNombre(resultado.getString("Nombre"));
                cart.setFecha(resultado.getDate("Fecha"));
                cart.setHoraInicio(resultado.getTime("HoraInicio"));
                cart.setNumero_sala(resultado.getInt("Numero_Sala"));
                cart.setDuracion(resultado.getTime("Duracion"));
                cart.setPrecio(resultado.getDouble("Precio"));
                cart.setSipnosis(resultado.getString("Sipnosis"));
                cart.setTipo(resultado.getInt("tipo"));
                cart.setIdPelicula(resultado.getInt("Id_Pelicula"));
                cart.setId_Horario(resultado.getInt("Id_Horario"));
                cart.setId_Sala(resultado.getInt("Id_sala"));
                lista.add(cart);
            }
            conectar.close();

        } catch (Exception e) {
        }
        return lista;
    }

    public void InsertarCartelera(Carteleras Cartel) {
        try {
            CallableStatement cs = conectar.prepareCall("call SP_I_CARTELERA (?,?,?,?)");
            cs.setInt("PId_Pelicula", Cartel.getIdPelicula());
            cs.setInt("PId_Horario", Cartel.getId_Horario());
            cs.setInt("PId_sala", Cartel.getId_Sala());
            cs.setDate("PFecha", new java.sql.Date(Cartel.getFecha().getTime()));
            cs.executeQuery();
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
            conectar.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void ActualizarCartelera(Carteleras cartele) {
        try {

            CallableStatement cs = conectar.prepareCall("call SP_U_CARTELERA (?,?,?,?,?)");
            cs.setInt("PId", cartele.getIdcartelera());
            cs.setInt("PId_Pelicula", cartele.getIdPelicula());
            cs.setInt("PId_Horario", cartele.getId_Horario());
            cs.setInt("PId_sala", cartele.getId_Sala());
            cs.setDate("PFecha", new java.sql.Date(cartele.getFecha().getTime()));
            int res = JOptionPane.showConfirmDialog(null, "¿Si actualiza se eliminaran los registros de esta sala y fecha?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (res == 0) {
                cs.executeQuery();
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");

            } else {

            }

            conectar.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void EliminarCartelera(Carteleras cartele) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_D_CARTELERA(?)");
            call.setInt("pId", cartele.getIdcartelera());
            int res = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar este registro?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (res == 0) {
                call.execute();
                JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
            } else {

            }
            conectar.close();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public ArrayList<Carteleras> BuscarDatos(Carteleras c) {
        ArrayList<Carteleras> lista = new ArrayList<>();
        try {
            CallableStatement call = conectar.prepareCall("call SP_BUSCARCARTELERA(?,?)");
            call.setString("pNombre", c.getNombre());
            call.setDate("pFecha", new java.sql.Date(c.getFecha().getTime()));
            ResultSet resultado = call.executeQuery();
            while (resultado.next()) {
                Carteleras cart = new Carteleras();
                cart.setIdcartelera(resultado.getInt("idCarteleras"));
                cart.setNombre(resultado.getString("Nombre"));
                cart.setFecha(resultado.getDate("Fecha"));
                cart.setHoraInicio(resultado.getTime("HoraInicio"));
                cart.setNumero_sala(resultado.getInt("Numero_Sala"));
                cart.setDuracion(resultado.getTime("Duracion"));
                cart.setPrecio(resultado.getDouble("Precio"));
                cart.setSipnosis(resultado.getString("Sipnosis"));
                cart.setTipo(resultado.getInt("tipo"));
                cart.setIdPelicula(resultado.getInt("Id_Pelicula"));
                lista.add(cart);
            }
            lista.size();
            conectar.close();

        } catch (Exception e) {
        }
        return lista;
    }

}
