import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main extends JFrame implements ActionListener{
      
      JLabel lChoose;
      JButton bLength, bTime, bMass, bVolume, bBack;
      JPanel p1,p2;
      JFrame frame = new JFrame("Conversion");
      
      Main()
      {
        lChoose = new JLabel("Choose which to Convert"); 
        bLength = new JButton("Length"); bLength.addActionListener(this); bLength.setToolTipText("go to Length.");
        bTime = new JButton("Time"); bTime.addActionListener(this); bTime.setToolTipText("go to Time.");
        bMass = new JButton("Mass"); bMass.addActionListener(this); bMass.setToolTipText("go to Mass.");
        bVolume = new JButton("Volume"); bVolume.addActionListener(this); bVolume.setToolTipText("go to Volume."); 
           // panel 1
           p1 = new JPanel();
           p1.setLayout(new GridBagLayout());
           p1.add(bLength); p1.add(bTime); 
           p1.add(bMass); p1.add(bVolume);
           // panel 2 
           p2 = new JPanel();
           p2.setLayout(new FlowLayout());
           p2.add(lChoose);
         // setting the layout.  
         frame.setSize(300,200);
         frame.setLayout(new BorderLayout());
         frame.add(p1, BorderLayout.CENTER); 
         frame.add(p2, BorderLayout.NORTH);                    
         frame.setLocation(340,100);    
         frame.setVisible(true);        
         frame.setResizable(false);  
         frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
         // windowListener 
         frame.addWindowListener(  
         new WindowAdapter()     
         {                
            public void windowClosing(WindowEvent e)
              { 
                          exit();  
              } 
            } 
         );       
     }  
     public void windowClosing(WindowEvent e){ 
             exit(); 
        }
     void exit(){ 
       
        int dia = JOptionPane.showConfirmDialog(frame,"Quit ?","what to do", JOptionPane.YES_NO_OPTION); 
        if (dia == JOptionPane.YES_OPTION) 
        {                             
               System.exit(0); 
        }
     }
    public void actionPerformed(ActionEvent ae){ // action event. 
    
      if(ae.getSource() == bLength)
      {
         new Length();   
      }    
      if(ae.getSource() == bTime)
      {
         new Time();
      }
      if(ae.getSource() == bMass)
      {
         new Mass();
      }
      if(ae.getSource() == bVolume)
      {
         new Volume();
      }
    }
      public static void main(String[] args)
      {
         new Main();
      }
}