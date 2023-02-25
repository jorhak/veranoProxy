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
public class Inteligente implements ICaracteristicas {

    private String inteligente = "inteligente.jpeg";
    private Image image;

    public Inteligente() {
        ImageIcon img = new ImageIcon(this.getClass().getResource(inteligente)); //busca un recurso llamado bueno
        image = img.getImage();//se llama al archivo bueno
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
