package sistemaDNJ;

import BaseDeDatos.Conexion;
import Interfaces.LoginUI;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class SistemaDNJ2 {

    public static void main(String[] args) {

        //Haciendo uso de Fatlaf
        try {

            FlatArcOrangeIJTheme.setup();

        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }//añade FatLaf

        /*
            AcrylLookAndFeel
            AeroLookAndFeel
            AluminiumLookAndFeel
            BernsteinLookAndFeel
            FastLookAndFeel
            HiFiLookAndFeel
            McWinLookAndFeel
            MintLookAndFeel
            NoireLookAndFeel
            SmartLookAndFeel
            LunaLookAndFeel
            TextureLookAndFeel
            McWinLookAndFeel
            SmartLookAndFeel
            AcrylLookAndFeel
            TextureLookAndFeel
            MintLookAndFeel
            AcrylLookAndFeel 
         */
        
        try {
            AeroLookAndFeel.setTheme("Textile");
            
            System.out.println(TextureLookAndFeel.getThemes());
            
            UIManager.setLookAndFeel(new TextureLookAndFeel());

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            ex.printStackTrace();
        }

        Conexion.iniciar();

        if (Conexion.conexion != null) {

            LoginUI loginUI = new LoginUI();
            loginUI.setVisible(true);
            loginUI.setLocationRelativeTo(null);
            System.out.println("Conectado");

        } else {
            JOptionPane.showMessageDialog(null, "No hubo conexion de con la base de datos");
            System.out.println("No hubo conexion con la base de datos");
        }
    }

}
