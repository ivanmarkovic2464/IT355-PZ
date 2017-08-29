/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it355.ivanmarkovic2464.dao;

import it355.ivanmarkovic2464.model.Restoran;
import java.util.List;

/**
 *
 * @author Ivke
 */
public interface RestoranDao {
    public Restoran addRestoran(Restoran restoran);
    public void deleteRestoran(Restoran restoran);
    public List<Restoran> getAllRestorani();
    public int getBrojRestorana();
    public Restoran getRestoranPoId(int idRestorana);
}
