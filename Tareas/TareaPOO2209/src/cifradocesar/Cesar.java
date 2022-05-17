/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author victo
 */
public class Cesar extends JFrame{
    
    private JButton boton;
    private JTextField tipoDesplazamiento;
    private JTextField entrada;
    private JTextField salida;
    private JLabel desplazamiento;
    private JLabel mensajeEntrada;
    private JLabel mensajeSalida;

    public Cesar() throws HeadlessException {
    
        //Ponemos titulo y el tamaño de la ventana 
        
        setTitle("Cifrado Cesar");
        setSize(300, 500);
        
        
        //Mostramos el titulo para saber cuantos datos se debe desplazar
        
        desplazamiento = new JLabel("Numero de desplazamientos ");
        this.getContentPane().add(desplazamiento);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        
        //Mostramos el lugar para escribir 
        
        tipoDesplazamiento = new JTextField(5);
        this.getContentPane().add(tipoDesplazamiento);
        
        //Leemos el numero de desplazamiento
        
        this.tipoDesplazamiento.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                try {
                    System.out.println(e.getKeyChar());
                } catch (Exception e1) {
                    System.out.println("Solo numeros");
                }
                
            }
            
        });
        
       
        //Mostramos el mensaje de entrada
        
        mensajeEntrada = new JLabel("Mensaje de Entrada");
        this.getContentPane().add(mensajeEntrada);
        
        
        //Mostramos el lugar para escribir la entrada
        
        entrada = new JTextField(25);
        this.getContentPane().add(entrada);
        
        //Leemos el mensaje
        
        this.entrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                try {
                    System.out.println(e.getKeyChar());
                } catch (Exception e1) {
                    System.out.println("Solo palabras");
                }
                
            }
            
        });
        
        
        //Mostramos el mensaje de salida
        
        mensajeSalida = new JLabel("Mensaje de Salida");
        this.getContentPane().add(mensajeSalida);
        
        //Mostramos el lugar para salir
        
        this.mensajeSalida.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("");
            }
            
        });
        
        //Mostramo el lugar del mensaje de salida
        
        salida = new JTextField(25);
        this.getContentPane().add(salida);
        
        
        //Mostramos el boton para convertir
        
        boton = new JButton("Convertir");
        this.getContentPane().add(boton);
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("El resultado es: " + mensajeSalida.getText());
            }
            
        });
        
        
        
        
        
        
        //Funcion de cerrar la ventana
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        
        
        
        
        
        //Hacemos que muestre la ventana
        
        this.setVisible(true);
        this.validate();
    }
    
    

    
    
    
    
}
