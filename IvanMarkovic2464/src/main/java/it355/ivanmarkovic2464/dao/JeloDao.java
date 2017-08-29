/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it355.ivanmarkovic2464.dao;

import it355.ivanmarkovic2464.model.Jelo;
import java.util.List;


/**
 *
 * @author Ivke
 */

public interface JeloDao {
    public Jelo addJelo(Jelo jelo);
    public void deleteJelo(Jelo jelo);
    public List<Jelo> getAllJela();
    public Jelo getJeloById(int idJela);
}
