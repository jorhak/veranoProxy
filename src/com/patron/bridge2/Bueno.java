/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.bridge2;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author jorhak
 */
public class Bueno implements ICaracteristicas {

    private String bueno = "bueno.jpeg";
    private Image image;

    public Bueno() {
        ImageIcon img = new ImageIcon(this.getClass().getResource(bueno)); //busca un recurso llamado bueno
        image = img.getImage();//se llama al archivo bueno
    }

    @Override
    public ICaracteristicas procesar() {
        return this;
    }
    
    public Image getImagen(){
        return image;
    }

}
