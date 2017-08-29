/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it355.ivanmarkovic2464.dao;

import it355.ivanmarkovic2464.model.Korisnik;
import java.util.List;

/**
 *
 * @author Ivke
 */
public interface KorisnikDao {
    public Korisnik addKorisnik(Korisnik korisnik);
    public void deleteKorisnik(Korisnik korisnik);
    public List<Korisnik> getAllKorisnici();
    public Korisnik getUserById(int id);
}
