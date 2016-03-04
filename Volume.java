import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Volume extends JFrame implements ActionListener, ItemListener{

   JLabel lL, lml, lcm, loz, lgal;
   JTextField t1, t2, t3, t4, t5, enter;
   JButton bConvert, bBack;
   JFrame frame = new JFrame("Volume");
   JPanel p1, p2, p3;
   JComboBox select;
   JComboBox sel;
   String selected [] = {"","Liter","Milliliter","Cubic Meter","Us oz","Us gal"};
   double press;

   Volume()
   {
                 
      lL = new JLabel("Liter"); lL.setHorizontalAlignment(JLabel.CENTER);       t1 = new JTextField(10); t1.setEditable(false);
      lml = new JLabel("Milliliter"); lml.setHorizontalAlignment(JLabel.CENTER);  t2 = new JTextField(10); t2.setEditable(false);
      lcm = new JLabel("Cubic Meter"); lcm.setHorizontalAlignment(JLabel.CENTER); t3 = new JTextField(10); t3.setEditable(false);
      loz = new JLabel("Us oz"); loz.setHorizontalAlignment(JLabel.CENTER);   t4 = new JTextField(10); t4.setEditable(false);
      lgal = new JLabel("Us gal"); lgal.setHorizontalAlignment(JLabel.CENTER); t5 = new JTextField(10); t5.setEditable(false);
      sel = new JComboBox(selected);   enter = new JTextField(10); 
      bConvert = new JButton("convert"); bConvert.addActionListener(this); bConvert.setToolTipText("Click to Convert."); 
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
      // panel 1.
      p1 = new JPanel();
      p1.setLayout(new FlowLayout());
      p1.add(sel); p1.add(enter); p1.add(bConvert);
      // panel 2.
      p2 = new JPanel();
      p2.setLayout(new GridLayout(5,2));
      p2.add(lL);    p2.add(t1);
      p2.add(lml);   p2.add(t2);
      p2.add(lcm);   p2.add(t3);
      p2.add(loz); p2.add(t4);
      p2.add(lgal);p2.add(t5);
      // panel 3
      p3 = new JPanel();
      p3.setLayout(new FlowLayout());
      p3.add(bBack);
      // setting the layout
      frame.setLayout(new BorderLayout());
      frame.add(p1, BorderLayout.NORTH);
      frame.add(p2, BorderLayout.CENTER);
      frame.add(p3, BorderLayout.SOUTH);
      frame.setLocation(340,100);
      frame.setSize(400,200);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      frame.setVisible(true);
      }
      
      public void itemStateChanged(ItemEvent ie) {}
      
      public void actionPerformed(ActionEvent ae){
         try{
         press = Double.parseDouble(enter.getText());
         // liter.
          if(ae.getSource() == bConvert){
             if(sel.getSelectedItem().equals ("Liter"))
               t1.setText(press  +" L");
             if(sel.getSelectedItem().equals ("Liter"))
                t2.setText(press * 1000 +" ml");
             if(sel.getSelectedItem().equals ("Liter"))
                t3.setText(press * 0.001 +" cm");
             if(sel.getSelectedItem().equals ("Liter"))
                t4.setText(press * 33.814 +" oz");
             if(sel.getSelectedItem().equals ("Liter"))
                t5.setText(press * 0.264172 +" gal");
          }
        // milliliter.
         if(ae.getSource() == bConvert){
             if(sel.getSelectedItem().equals ("Milliliter"))
               t1.setText(press * 0.001 +" L");
             if(sel.getSelectedItem().equals ("Milliliter"))
                t2.setText(press +" ml");
             if(sel.getSelectedItem().equals ("Milliliter"))
                t3.setText(press * 1e-6 +" cm");
             if(sel.getSelectedItem().equals ("Milliliter"))
                t4.setText(press * 0.033814 +" oz");
             if(sel.getSelectedItem().equals ("Milliliter"))
                t5.setText(press * 0.000264172 +" gal");
          }

         // cubic meter.
         if(ae.getSource() == bConvert){
             if(sel.getSelectedItem().equals ("Cubic Meter"))
               t1.setText(press * 1000 +" L");
             if(sel.getSelectedItem().equals ("Cubic Meter"))
                t2.setText(press * 1e+6 +" ml");
             if(sel.getSelectedItem().equals ("Cubic Meter"))
                t3.setText(press  +" cm");
             if(sel.getSelectedItem().equals ("Cubic Meter"))
                t4.setText(press * 33814 +" oz");
             if(sel.getSelectedItem().equals ("Cubic Meter"))
                t5.setText(press * 264.172 +" gal");
          }
         // Us oz.
         if(ae.getSource() == bConvert){
             if(sel.getSelectedItem().equals ("Us oz"))
               t1.setText(press * 0.0295735 +" L");
             if(sel.getSelectedItem().equals ("Us oz"))
                t2.setText(press * 29.5735 +" ml");
             if(sel.getSelectedItem().equals ("Us oz"))
                t3.setText(press * 2.9574e-5 +" cm");
             if(sel.getSelectedItem().equals ("Us oz"))
                t4.setText(press  +" oz");
             if(sel.getSelectedItem().equals ("Us oz"))
                t5.setText(press * 0.0078125 +" gal");
          }
         // Us gal.
         if(ae.getSource() == bConvert){
             if(sel.getSelectedItem().equals ("Us gal"))
               t1.setText(press * 3.78541 +" L");
             if(sel.getSelectedItem().equals ("Us gal"))
                t2.setText(press * 3785.41 +" ml");
             if(sel.getSelectedItem().equals ("Us gal"))
                t3.setText(press * 0.00378541 +" cm");
             if(sel.getSelectedItem().equals ("Us gal"))
                t4.setText(press * 128 +" oz");
             if(sel.getSelectedItem().equals ("Us gal"))
                t5.setText(press  +" gal");
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
            new Volume();
      }
}