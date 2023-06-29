
package Simulation_of_Inventory_Systems;

import javax.swing.JOptionPane;

public class Simulation_of_Inventory_Systems {

    public static void main(String[] args) {
        try{
FRM_investory f = new FRM_investory();
       f.setVisible(true);
      f.setLocationRelativeTo(null);
    }
     
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
    }
}
}
