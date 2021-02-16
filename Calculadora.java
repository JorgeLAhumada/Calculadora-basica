import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame 
{
   JTextField texto1;
   JTextField texto2;
   JButton suma;
   JButton resta;
   JButton multiplicacion;
   JButton divicion;
   JLabel numero1,numero2,respuesta;
   JPanel panel;
   
   public Calculadora()
   {
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(400,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      texto1 = new JTextField(20);
      texto2 = new JTextField(20);
      suma = new JButton(" + ");
      resta = new JButton (" - ");
      multiplicacion = new JButton (" * ");
      divicion = new JButton (" / ");
      numero1 = new JLabel("primer numero:");
      numero2 = new JLabel(" segundo numero:");
      respuesta = new JLabel();
      divicion.addMouseListener(new MyClickListener());
      suma.addMouseListener(new MyClickSuma());
      resta.addMouseListener(new MyClickResta());
      multiplicacion.addMouseListener(new MyClickMultiplicacion());
      panel = new JPanel();
      panel.add(numero1);
      panel.add(texto1);
      panel.add(numero2);
      panel.add(texto2);
      panel.add(suma);
      panel.add(resta);
      panel.add(multiplicacion);
      panel.add(divicion);
      panel.add(respuesta);
      setContentPane(panel);
      setVisible(true);
   }
      private class MyClickListener extends MouseAdapter
      {
         double resp=0.0;
         double num1=0,num2=0;
      
         public void mouseClicked(MouseEvent event)
         {
            num1 = Integer.parseInt(texto1.getText());
            num2 = Integer.parseInt(texto2.getText());
            resp = num1/num2;
            respuesta.setText("respuesta = " +resp );
         }
      }
      
      private class MyClickSuma extends MouseAdapter
      {
         double resp=0.0;
         double num1=0,num2=0;
      
         public void mouseClicked(MouseEvent event)
         {
            num1 = Integer.parseInt(texto1.getText());
            num2 = Integer.parseInt(texto2.getText());
            resp = num1+num2;
            respuesta.setText("respuesta = " +resp );
         }
      }
      
      private class MyClickResta extends MouseAdapter
      {
         double resp=0.0;
         double num1=0,num2=0;
      
         public void mouseClicked(MouseEvent event)
         {
            num1 = Integer.parseInt(texto1.getText());
            num2 = Integer.parseInt(texto2.getText());
            resp = num1-num2;
            respuesta.setText("respuesta = " +resp );
         }
      }
      
      private class MyClickMultiplicacion extends MouseAdapter
      {
         double resp=0.0;
         double num1=0,num2=0;
      
         public void mouseClicked(MouseEvent event)
         {
            num1 = Integer.parseInt(texto1.getText());
            num2 = Integer.parseInt(texto2.getText());
            resp = num1*num2;
            respuesta.setText("respuesta = " +resp );
         }
      }
   
   
   
   
}

