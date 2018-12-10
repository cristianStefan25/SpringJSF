/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.cristian.service.LoginService;

/**
 *
 * @author cnastase
 */
@ManagedBean
@Component
@RequestScoped
public class User implements Serializable {

    @Autowired
    private LoginService service;

    private String username;
    private String parola;
    private String mesaj;

    public User() {
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public void afisareNumeSiParola() {
        //System.out.println(this.username + " " + this.parola);
        service.adaugaUser(username, parola);
    }

    public void login() {
        boolean login = service.login(username, parola);
        if (login) {
            this.mesaj = "Login reusit!";
        } else {
            this.mesaj = "Username sau parola gresite!";
        }
    }

}
