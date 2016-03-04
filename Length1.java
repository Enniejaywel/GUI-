import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Length1 extends JFrame implements ActionListener, ItemListener{
   
   JLabel lkm, lm, ly, lmm, lcm;
   JTextField t1, t2, t3, t4, t5, enter;
   JButton bConvert, bBack;
   JFrame frame = new JFrame("Length");
   JPanel p1, p2, p3;
   JComboBox select;
   JComboBox sel;
   
   String selected [] = {"","kilometer","meter","centimeter","millimeter","yard"};
   double press;
   
   Length1()
   {
      lkm = new JLabel("Kilometer"); lkm.setHorizontalAlignment(JLabel.CENTER);  t1 = new JTextField(10); t1.setEditable(false); 
      lm = new JLabel("Meter"); lm.setHorizontalAlignment(JLabel.CENTER);   t2 = new JTextField(15); t2.setEditable(false);
      ly = new JLabel("Yard");  ly.setHorizontalAlignment(JLabel.CENTER);  t3 = new JTextField(15);  t3.setEditable(false);   
      lmm = new JLabel("Millimeter"); lmm.setHorizontalAlignment(JLabel.CENTER);  t4 = new JTextField(15); t4.setEditable(false);
      lcm = new JLabel("Centimeter");  lcm.setHorizontalAlignment(JLabel.CENTER); t5 = new JTextField(15); t5.setEditable(false);
      enter = new JTextField(10); sel = new JComboBox(selected); 
      bConvert = new JButton("Convert"); bConvert.addActionListener(this); bConvert.setToolTipText("Convert.");
      // using ItemListener. 
      select = new JComboBox(selected);
      select.addItemListener(this);
      // panel 1
      p1 = new JPanel();
      p1.setLayout(new FlowLayout());
      p1.add(sel); p1.add(enter); p1.add(bConvert); 
      // panel 2
      p2 = new JPanel();
      p2.setLayout(new GridLayout(5,2));
      p2.add(lkm);p2.add(t1);
      p2.add(lm); p2.add(t2);
      p2.add(ly); p2.add(t3);
      p2.add(lmm);p2.add(t4);
      p2.add(lcm);p2.add(t5);
     
      // setting the layout
      frame.setLayout(new BorderLayout());
      frame.add(p1, BorderLayout.NORTH);
      frame.add(p2, BorderLayout.CENTER);
      frame.setSize(400,200);
      frame.setResizable(false);
      frame.setLocation(340,100);
      frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      frame.setVisible(true);
  }
      
      public void itemStateChanged(ItemEvent ie) {}
      
      public void actionPerformed(ActionEvent ae){
      try{
     press = Double.parseDouble(enter.getText());
     // kilometer. 
     if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("km"))
            t1.setText(press  +" km");
          if(sel.getSelectedItem().equals ("km"))
             t2.setText(press * 1000 +" m");
          if(sel.getSelectedItem().equals ("km"))
             t3.setText(press * 10936.61 +" y");
          if(sel.getSelectedItem().equals ("km"))
             t4.setText(press * 1e+6 +" mm");
          if(sel.getSelectedItem().equals ("km"))
             t5.setText(press * 100000 +" cm");
      }
     // meter.
     if(ae.getSource() == bConvert){
          if(sel.getSelectedItem()== "m")
             t1.setText(press * 0.001 +" km");
          if(sel.getSelectedItem().equals ("m"))
             t2.setText(press +" m");
          if(sel.getSelectedItem().equals ("m"))
             t3.setText(press * 1.09361 +" y");
          if(sel.getSelectedItem().equals ("m"))
             t4.setText(press * 1000 +" mm");
          if(sel.getSelectedItem().equals ("m"))
             t5.setText(press * 100 +" cm");
          }
     // yard
     if(ae.getSource() == bConvert){
          if(sel.getSelectedItem()== "y")
             t1.setText(press * 0.0009144 +" km");
          if(sel.getSelectedItem().equals ("y"))
             t2.setText(press * 0.9144 + " m");
          if(sel.getSelectedItem().equals ("y"))
             t3.setText(press  +" y");
          if(sel.getSelectedItem().equals ("y"))
             t4.setText(press * 914.4 +" mm");
          if(sel.getSelectedItem().equals ("y"))
             t5.setText(press * 91.44 +" cm");
          }
      // millimeter
      if(ae.getSource() == bConvert){
          if(sel.getSelectedItem()== "mm")
             t1.setText(press * 1e-6 +" km");
          if(sel.getSelectedItem().equals ("mm"))
             t2.setText(press * 0.001 + " m");
          if(sel.getSelectedItem().equals ("mm"))
             t3.setText(press * 0.00109361 +" y");
          if(sel.getSelectedItem().equals ("mm"))
             t4.setText(press +" mm");
          if(sel.getSelectedItem().equals ("mm"))
             t5.setText(press * 0.1 +" cm");
          }
      // centimeter
      if(ae.getSource() == bConvert){
          if(sel.getSelectedItem()== "cm")
             t1.setText(press * 1e-5 +" km");
          if(sel.getSelectedItem().equals ("cm"))
             t2.setText(press * 0.01 + " m");
          if(sel.getSelectedItem().equals ("cm"))
             t3.setText(press * 0.0109361 +" y");
          if(sel.getSelectedItem().equals ("cm"))
             t4.setText(press * 10 +" mm");
          if(sel.getSelectedItem().equals ("cm"))
             t5.setText(press +" cm");
          }
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null, "Exception in " + e.toString(), "NumberFormatException", JOptionPane.ERROR_MESSAGE);
         JOptionPane.showMessageDialog(null, "You should input a number.");
      }
   }
          public static void main(String[] args)
     {
         new Length1();
     }
}