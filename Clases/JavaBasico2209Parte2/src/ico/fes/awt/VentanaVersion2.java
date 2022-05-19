
package ico.fes.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class VentanaVersion2 extends Frame {
    
    private TextField cuadroTexto;
    private Button boton1;
    private Label etiqueta;
    private FlowLayout layout;

    public VentanaVersion2() throws HeadlessException {
    
        this.setTitle("Ventana con eventos v2");
        this.setSize(300, 220);
        layout = new FlowLayout(FlowLayout.LEFT);
        cuadroTexto = new TextField( 15 );
        boton1 = new Button("Presioname");
        etiqueta = new Label( "Texto inical" );
        
        this.setLayout(layout);
        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
        
        //Objeto anonimo
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Hola " + cuadroTexto.getText());
                System.out.println("Coordenas x = "+ e.getX());
                System.out.println("Coordenas y = "+ e.getY());
                System.out.println("Boton presionado: " + e.getButton());
            }
            
        });
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        this.cuadroTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println( e.getKeyChar());
            }
            
        });
        
        this.setVisible(true);
        
    
    }

    
    
    
    
    
    
}
