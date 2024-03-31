/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colombp.institute.of.studies;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ColombpInstituteOfStudies {


    public static void main(String[] args) {
                   welcome wl = new welcome();
           wl.setVisible(true);
           
           
          
        
        try{
            for (int i=0;i<100;i++){
                Thread.sleep(60);
                wl.ba1.setValue(i);
            }
           
              welcome2 welcome2 =new welcome2 ();
        welcome2 .setVisible(true);
        wl.hide();
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
