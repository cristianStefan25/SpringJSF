/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.cristian.dao.UserDao;
import ro.cristian.model.User;

/**
 *
 * @author cnastase
 */
@Service
public class LoginService {

    @Autowired
    private UserDao userDao;

    public void adaugaUser(String username, String parola) {
        userDao.adaugaUser(username, parola);
    }

    public boolean login(String username, String parola) {
        User user = userDao.findUser(username);
        if (user != null) {
            if (user.getParola().equals(parola)) {
                return true;
            }
        }
        return false;
    }

}
