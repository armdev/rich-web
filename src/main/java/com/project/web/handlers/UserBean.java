/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.web.handlers;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author armdev   
 */
@Named(value = "userBean")
@RequestScoped
public class UserBean {

    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String password;

    public UserBean() {
    }
    
    public String doLogin(){
        System.out.println("Email is " + email);
        System.out.println("Password  is " + password);
        
        return "profile";
    }

}
