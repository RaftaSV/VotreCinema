/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Entidades;

import lombok.Data;
import com.unab.edu.sv.Entidades.*;
import java.util.HashSet;

/**
 *
 * @author Rafael
 */
@Data
public class Taquillas extends DetallesFacturas{
  public int idTaquilla;
  private int Id_cartelera;
  private int Id_Asiento;
  private int precio;
  private int estado;
 
}
