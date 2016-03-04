import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Length extends JFrame implements ActionListener, ItemListener{
   
   JLabel lkm, lm, ly, lmm, lcm;
   JTextField t1, t2, t3, t4, t5, enter;
   JButton bConvert, bBack;
   JFrame frame = new JFrame("Length");
   JPanel p1, p2, p3;
   JComboBox select;
   JComboBox sel;
   
   String selected [] = {"","kilometer","meter","centimeter","millimeter","yard"};
   double press;
   
   Length()
   {
      lkm = new JLabel("Kilometer"); lkm.setHorizontalAlignment(JLabel.CENTER);  t1 = new JTextField(10); t1.setEditable(false); 
      lm = new JLabel("Meter"); lm.setHorizontalAlignment(JLabel.CENTER);   t2 = new JTextField(15); t2.setEditable(false);
      ly = new JLabel("Yard");  ly.setHorizontalAlignment(JLabel.CENTER);  t3 = new JTextField(15);  t3.setEditable(false);   
      lmm = new JLabel("Millimeter"); lmm.setHorizontalAlignment(JLabel.CENTER);  t4 = new JTextField(15); t4.setEditable(false);
      lcm = new JLabel("Centimeter");  lcm.setHorizontalAlignment(JLabel.CENTER); t5 = new JTextField(15); t5.setEditable(false);
      enter = new JTextField(10); sel = new JComboBox(selected); 
      bConvert = new JButton("Convert"); bConvert.addActionListener(this); bConvert.setToolTipText("Convert.");
      bBack = new JButton("Back"); bBack.setToolTipText("go to main."); 
      bBack.addActionListener(
         new ActionListener(){
            public void actionPerformed( ActionEvent ae )
            {
                  bBackActionPerformed( ae );
            }
          }
      ); 
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
      // panel 3
      p3 = new JPanel();
      p3.setLayout(new FlowLayout());
      p3.add(bBack);
      // setting the layout
      frame.setLayout(new BorderLayout());
      frame.add(p1, BorderLayout.NORTH);
      frame.add(p2, BorderLayout.CENTER);
      frame.add(p3, BorderLayout.SOUTH);
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
          if(sel.getSelectedItem().equals ("kilometer"))
            t1.setText(press  +" km");
          if(sel.getSelectedItem().equals ("kilometer"))
             t2.setText(press * 1000 +" m");
          if(sel.getSelectedItem().equals ("kilometer"))
             t3.setText(press * 10936.61 +" y");
          if(sel.getSelectedItem().equals ("kilometer"))
             t4.setText(press * 1e+6 +" mm");
          if(sel.getSelectedItem().equals ("kilometer"))
             t5.setText(press * 100000 +" cm");
      }
     // meter.
     if(ae.getSource() == bConvert){
          if(sel.getSelectedItem()== "meter")
             t1.setText(press * 0.001 +" km");
          if(sel.getSelectedItem().equals ("meter"))
             t2.setText(press +" m");
          if(sel.getSelectedItem().equals ("meter"))
             t3.setText(press * 1.09361 +" y");
          if(sel.getSelectedItem().equals ("meter"))
             t4.setText(press * 1000 +" mm");
          if(sel.getSelectedItem().equals ("meter"))
             t5.setText(press * 100 +" cm");
          }
     // yard
     if(ae.getSource() == bConvert){
          if(sel.getSelectedItem()== "yard")
             t1.setText(press * 0.0009144 +" km");
          if(sel.getSelectedItem().equals ("yard"))
             t2.setText(press * 0.9144 + " m");
          if(sel.getSelectedItem().equals ("yard"))
             t3.setText(press  +" y");
          if(sel.getSelectedItem().equals ("yard"))
             t4.setText(press * 914.4 +" mm");
          if(sel.getSelectedItem().equals ("yard"))
             t5.setText(press * 91.44 +" cm");
          }
      // millimeter
      if(ae.getSource() == bConvert){
          if(sel.getSelectedItem()== "millimeter")
             t1.setText(press * 1e-6 +" km");
          if(sel.getSelectedItem().equals ("millimeter"))
             t2.setText(press * 0.001 + " m");
          if(sel.getSelectedItem().equals ("millimeter"))
             t3.setText(press * 0.00109361 +" y");
          if(sel.getSelectedItem().equals ("millimeter"))
             t4.setText(press +" mm");
          if(sel.getSelectedItem().equals ("millimeter"))
             t5.setText(press * 0.1 +" cm");
          }
      // centimeter
      if(ae.getSource() == bConvert){
          if(sel.getSelectedItem()== "centimeter")
             t1.setText(press * 1e-5 +" km");
          if(sel.getSelectedItem().equals ("centimeter"))
             t2.setText(press * 0.01 + " m");
          if(sel.getSelectedItem().equals ("centimeter"))
             t3.setText(press * 0.0109361 +" y");
          if(sel.getSelectedItem().equals ("centimeter"))
             t4.setText(press * 10 +" mm");
          if(sel.getSelectedItem().equals ("centimeter"))
             t5.setText(press +" cm");
          }
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null, "Exception in " + e.toString(), "NumberFormatException", JOptionPane.ERROR_MESSAGE);
         JOptionPane.showMessageDialog(null, "You should input a number.");
      }
   }
     private void bBackActionPerformed(ActionEvent ae ){     
         new Main();
         frame.setVisible(false);
     }
     public static void main(String[] args)
     {
         new Length();
     }
}