/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author manue
 */
public final class Ingreso {
    private static Ingreso verificar=new Ingreso();
    private final String user="root";
    private final String pass="root";

    private Ingreso() {
    }
    
    public static Ingreso getInstance(){
        return verificar;
    }
    
    private int hashUser(){
        return  user.hashCode();
    }
    
    private int hashPass(){
        return  pass.hashCode();
    }
    
    public boolean User(String user){
        return hashUser()==user.hashCode();
    }
    
    public boolean Pass(String pass){
        return hashPass()==pass.hashCode();
    }
    
}
