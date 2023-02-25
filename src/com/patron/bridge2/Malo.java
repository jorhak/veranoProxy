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
public class Malo implements ICaracteristicas {

    private String malo = "malo.jpeg";
    private Image image;

    public Malo() {
        ImageIcon img = new ImageIcon(this.getClass().getResource(malo)); //busca un recurso llamado malo
        image = img.getImage();//se llama al archivo malo
    }

    @Override
    public ICaracteristicas procesar() {
        return this;
    }

    @Override
    public Image getImagen() {
        return image;
    }

}
