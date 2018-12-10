/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.dao;

import org.springframework.stereotype.Repository;
import ro.cristian.model.User;

/**
 *
 * @author cnastase
 */
@Repository
public class UserDao {

    public void adaugaUser(String username, String parola) {
        System.out.println("DAO:" + username + " " + parola);
    }

    public User findUser(String username) {// imi imaginez ca il cauta in baza
        User user = new User();
        user.setUsername("gigel");
        user.setParola("12345");
        return user;

    }
}
