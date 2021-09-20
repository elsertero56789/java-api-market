/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.domain.dto;

/**
 *
 * @author Fabrizio-PC
 */
public class AuthenticationResponse {
    public String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    
    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
    
    
}
