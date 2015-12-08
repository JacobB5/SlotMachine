
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine extends JFrame {
    int windowWidth=400;
    int windowHeight=400;
    DisplayPanel slotPanel=new DisplayPanel();
    
    SlotMachine(){
        super("Slot Machine");
        setSize(windowWidth, windowHeight);
        add (slotPanel,BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        JButton Start = new JButton("Start");
        Start.addActionListener(new ActionListener() {
            // @Override
            public void actionPerformed(ActionEvent e) {
                slotPanel.changeImages('G');
            }
        });
               
        JButton Stop = new JButton("Stop");
        
        Stop.addActionListener(new ActionListener() {
            // @Override
            public void actionPerformed(ActionEvent e) {
                slotPanel.changeImages('S');
            }
        });
        buttonPanel.add(Start);
        buttonPanel.add(Stop);
        add(buttonPanel, BorderLayout.SOUTH);
        //setResizable(false);
        
        
        pack();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
    }
    
   public static void main(String[] args){
       SlotMachine runner = new SlotMachine();
   }
//   
//   public String chooseImage(String[] submitted){
//       String result=null;
//       int length=submitted.length;
//       if (length==0){
//           return result;
//       }
//       else if (length>3){
//           return submitted[length-1];
//       }
//       else{
//           return submitted[0];
//       }
//   }
//   
//   private void KillAllHumans(boolean T1000){
//       //For further development if the need arises
//       if (T1000){
//       deploy SKYNET;
//       }
//       else{}
//       
//       }
   

}
