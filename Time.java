import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Time extends JFrame implements ActionListener, ItemListener{

   JLabel lhr, lmin, lday, lyear, lsec, lweek;
   JTextField t1, t2, t3, t4, t5, t6, enter;
   JButton bConvert, bBack;
   JFrame frame = new JFrame("Time");
   JPanel p1, p2, p3;
   JComboBox select;
   JComboBox sel;
   String selected [] = {"","hours","minutes","seconds","week","day", "year"};
   double press;
   
   Time()
   {
      lhr = new JLabel("hr"); lhr.setHorizontalAlignment(JLabel.CENTER);  t1 = new JTextField(10); t1.setEditable(false);
      lmin = new JLabel("Minutes"); lmin.setHorizontalAlignment(JLabel.CENTER);  t2 = new JTextField(10); t2.setEditable(false);
      lday = new JLabel("Day"); lday.setHorizontalAlignment(JLabel.CENTER);  t3 = new JTextField(10); t3.setEditable(false);
      lyear = new JLabel("Year"); lyear.setHorizontalAlignment(JLabel.CENTER);  t4 = new JTextField(10); t4.setEditable(false);
      lsec = new JLabel("Seconds"); lsec.setHorizontalAlignment(JLabel.CENTER);  t5 = new JTextField(10); t5.setEditable(false);
      lweek = new JLabel("Week"); lweek.setHorizontalAlignment(JLabel.CENTER);  t6 = new JTextField(10); t6.setEditable(false);
      sel = new JComboBox(selected); enter = new JTextField(10);
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
      p2.setLayout(new GridLayout(6,2));
      p2.add(lhr); p2.add(t1);
      p2.add(lmin); p2.add(t2);
      p2.add(lsec); p2.add(t3);
      p2.add(lday); p2.add(t4);
      p2.add(lyear); p2.add(t5);
      p2.add(lweek); p2.add(t6);
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
    //minutes. 
     if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("minutes"))
            t1.setText(press * 0.0166667 +" hr");
          if(sel.getSelectedItem().equals ("minutes"))
             t2.setText(press  +" min");
          if(sel.getSelectedItem().equals ("minutes"))
             t3.setText(press * 60 +" sec");
          if(sel.getSelectedItem().equals ("minutes"))
             t4.setText(press * 0.000694444 +" day");
          if(sel.getSelectedItem().equals ("minutes"))
             t5.setText(press * 1.9013e-6 +" year");
          if(sel.getSelectedItem().equals ("minutes"))
             t6.setText(press * 9.9206e-5 +" week");
            }
    // hour.
    if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("hours"))
            t1.setText(press +" hr");
          if(sel.getSelectedItem().equals ("hours"))
             t2.setText(press * 60 +" min");
          if(sel.getSelectedItem().equals ("hours"))
             t3.setText(press * 3600 +" sec");
          if(sel.getSelectedItem().equals ("hours"))
             t4.setText(press * 0.0416667 +" day");
          if(sel.getSelectedItem().equals ("hours"))
             t5.setText(press * 0.00011408 +" year");
          if(sel.getSelectedItem().equals ("hours"))
             t6.setText(press * 0.00595238 +" week");
            }
    // seconds.
    if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("seconds"))
            t1.setText(press * 0.000277778 +" hr");
          if(sel.getSelectedItem().equals ("seconds"))
             t2.setText(press * 0.0166667 +" min");
          if(sel.getSelectedItem().equals ("seconds"))
             t3.setText(press  +" sec");
          if(sel.getSelectedItem().equals ("seconds"))
             t4.setText(press * 1.1574e-5 +" day");
          if(sel.getSelectedItem().equals ("seconds"))
             t5.setText(press * 3.1689e-8 +" year");
          if(sel.getSelectedItem().equals ("seconds"))
             t6.setText(press * 1.6534e-6 +" week");
            }
    // week.
    if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("week"))
            t1.setText(press * 0.0166667 +" hr");
          if(sel.getSelectedItem().equals ("week"))
             t2.setText(press * 60 +" min");
          if(sel.getSelectedItem().equals ("week"))
             t3.setText(press * 3600 +" sec");
          if(sel.getSelectedItem().equals ("week"))
             t4.setText(press * 0.0416667 +" day");
          if(sel.getSelectedItem().equals ("week"))
             t5.setText(press * 0.00011408 +" year");
          if(sel.getSelectedItem().equals ("week"))
             t6.setText(press  +" week");
            }
     // year. 
     if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("year"))
            t1.setText(press * 8765.81 +" hr");
          if(sel.getSelectedItem().equals ("year"))
             t2.setText(press * 525949 +" min");
          if(sel.getSelectedItem().equals ("year"))
             t3.setText(press * 3.156e+7 +" sec");
          if(sel.getSelectedItem().equals ("year"))
             t4.setText(press * 365.242 +" day");
          if(sel.getSelectedItem().equals ("year"))
             t5.setText(press  +" year");
          if(sel.getSelectedItem().equals ("year"))
             t6.setText(press * 52.1775 +" week");
            }
     // day.
     if(ae.getSource() == bConvert){
          if(sel.getSelectedItem().equals ("day"))
            t1.setText(press * 24 +" hr");
          if(sel.getSelectedItem().equals ("day"))
             t2.setText(press * 1440 +" min");
          if(sel.getSelectedItem().equals ("day"))
             t3.setText(press * 86400 +" sec");
          if(sel.getSelectedItem().equals ("day"))
             t4.setText(press  +" day");
          if(sel.getSelectedItem().equals ("day"))
             t5.setText(press * 0.00273791 +" year");
          if(sel.getSelectedItem().equals ("day"))
             t6.setText(press * 0.142857 +" week");
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
            new Time();
      }
}