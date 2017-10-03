/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *
 * @author 687159
 */
public class User implements Serializable
{
    
    private String username;
    private String password;
    
    public User()
    {
        username = "";
        password = "";
    }

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
}
