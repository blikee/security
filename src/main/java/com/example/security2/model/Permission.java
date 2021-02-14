/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.security2.model;

/**
 *
 * @author Артём
 */
public enum Permission{
    DEVELOPERS_READ("developers:read"),
    DEVELOPERS_WRITE("developers:write");
    
    private final String permission;
    
    private Permission(String permission){
        this.permission=permission;
    }
    public String getPermission(){
    return permission;
}
    
}                  
