/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2l2;

/**
 *
 * @author User
 */
public class MyGeneric<E> {
    E e;
    
    public MyGeneric(){
        
    }
    
    public MyGeneric(E e){
        this.e = e;
    }
    
    public void setE(E e){
        this.e = e;
    }
    
    public E getE(){
        return e;
    }
}
