
package behindnumbers;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.*;
import javax.swing.UIManager.*;

/**
 *
 * @author shaun smith
 */
public class BehindNumbers {
    
    
    
    public static void main(String[] args) {
        try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    //If Nimbus is not available, fall back to cross-platform
    try {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (Exception ex) {
        // not worth my time
    }
}

        MainGUI mg = new MainGUI();
        mg.getFile();
        mg.pack();
        
        
        
       
        
        
        
        
        
        
    }

        
        
    }

   