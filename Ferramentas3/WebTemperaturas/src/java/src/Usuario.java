/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author gabri
 */
public class Usuario {
    private String login;
    private boolean autenticado;
    
    public Usuario(String login, String senha){
        this.login = login;
        autenticado = false;
        Autenticar(senha);
    }
    
    private void Autenticar(String senha){
        autenticado = senha.equals(new StringBuffer(login).reverse().toString());
    }

    public String getLogin() {
        return login;
    }

    public boolean isAutenticado() {
        return autenticado;
    }
    
    
}
