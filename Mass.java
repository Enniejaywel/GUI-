import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mass extends JFrame implements ActionListener, ItemListener{

   JLabel lkg, lmet, lg, lp, lo;
   JTextField t1, t2, t3, t4, t5, enter;
   JButton bConvert, bBack;
   JFrame frame = new JFrame("Mass");
   JPanel p1, p2, p3;
   JComboBox select;
   JComboBox sel;
   String selected [] = {"","kilogram","Metric ton","Gram","Pound","Ounce"};
   double press;

   
   Mass()
   {
      lkg = new JLabel("kg"); lkg.setHorizontalAlignment(JLabel.CENTER); t1 = new JTextField(10); t1.setEditable(false);
      lmet = new JLabel("Metric ton"); lmet.setHorizontalAlignment(JLabel.CENTER); t2 = new JTextField(10); t2.setEditable(false);
      lg = new JLabel("Gram"); lg.setHorizontalAlignment(JLabel.CENTER); t3 = new JTextField(10); t3.setEditable(false);
      lp = new JLabel("Pound"); lp.setHorizontalAlignment(JLabel.CENTER); t4 = new JTextField(10); t4.setEditable(false);
      lo = new JLabel("Ounce"); lo.setHorizontalAlignment(JLabel.CENTER); t5 = new JTextField(10); t5.setEditable(false);
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
      p2.add(lkg); p2.add(t1);
      p2.add(lmet); p2.add(t2);
      p2.add(lg); p2.add(t3);
      p2.add(lp); p2.add(t4);
      p2.add(lo); p2.add(t5);
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
         
         // kilogram.
         if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("kilogram"))
            t1.setText(press  +" kg");
          if(sel.getSelectedItem().equals ("kilogram"))
             t2.setText(press * 0.001 +" metric ton");
          if(sel.getSelectedItem().equals ("kilogram"))
             t3.setText(press * 1000 +" gram");
          if(sel.getSelectedItem().equals ("kilogram"))
             t4.setText(press * 2.20462 +" pound");
          if(sel.getSelectedItem().equals ("kilogram"))
             t5.setText(press * 35.274 +" ounce");
             }
          // metric ton.
          if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("Metric ton"))
            t1.setText(press * 1000 +" kg");
          if(sel.getSelectedItem().equals ("Metric ton"))
             t2.setText(press  +" metric ton");
          if(sel.getSelectedItem().equals ("Metric ton"))
             t3.setText(press * 1e+6 +" gram");
          if(sel.getSelectedItem().equals ("Metric ton"))
             t4.setText(press * 2204.62 +" pound");
          if(sel.getSelectedItem().equals ("Metric ton"))
             t5.setText(press * 35274 +" ounce");
            }
          // pound.
          if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("Pound"))
            t1.setText(press * 0.453592 +" kg");
          if(sel.getSelectedItem().equals ("Pound"))
             t2.setText(press * 0.000453592 +" metric ton");
          if(sel.getSelectedItem().equals ("Pound"))
             t3.setText(press * 453.592 +" gram");
          if(sel.getSelectedItem().equals ("Pound"))
             t4.setText(press  +" pound");
          if(sel.getSelectedItem().equals ("Pound"))
             t5.setText(press * 16 +" ounce");
            }
          // ounce.
          if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("Ounce"))
            t1.setText(press * 0.0283495 +" kg");
          if(sel.getSelectedItem().equals ("Ounce"))
             t2.setText(press * 2.835e-5 +" metric ton");
          if(sel.getSelectedItem().equals ("Ounce"))
             t3.setText(press * 28.3495 +" gram");
          if(sel.getSelectedItem().equals ("Ounce"))
             t4.setText(press * 0.0625  +" pound");
          if(sel.getSelectedItem().equals ("Ounce"))
             t5.setText(press +" ounce");
            }
         // gram.
          if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("Gram"))
            t1.setText(press * 0.001 +" kg");
          if(sel.getSelectedItem().equals ("Gram"))
             t2.setText(press * 1e-6 +" metric ton");
          if(sel.getSelectedItem().equals ("Gram"))
             t3.setText(press  +" gram");
          if(sel.getSelectedItem().equals ("Gram"))
             t4.setText(press * 0.00220462  +" pound");
          if(sel.getSelectedItem().equals ("Gram"))
             t5.setText(press * 0.035274 +" ounce");
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
            new Mass();
        }

}