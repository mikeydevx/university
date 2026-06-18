package Ejercicio_6_Universidad;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.net.URISyntaxException;

public class Test {

    public static void main(String[] args) throws URISyntaxException, IOException {

        Universidad[] U = new Universidad[5];
        U[0] = new Universidad("IPN", "https://www.ipn.mx/", 1);
        U[1] = new Universidad("Universidad Autonoma de Mexico", "https://www.unam.mx/", 2);
        U[2] = new Universidad("Universidad tecnologica de leon", "https://www.utleon.edu.mx/", 3);
        U[3] = new Universidad("Universidad de Guanajuto", "https://www.ugto.mx/", 4);
        U[4] = new Universidad("Centro de investigacion de guanajuato", "https://www.ciatec.mx/ciatec", 5);

        String menu = "Las mejores universidades de mexico " + "\n"
                + "1. IPN" + "\n"
                + "2. Unam" + "\n"
                + "3. UTL" + "\n"
                + "4. UG " + "\n"
                + "5. CIG" + "\n"
                + "---------------------------" + "\n"
                + "ELIGE UNA UNIVERSIDAD";

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    Desktop.getDesktop().browse(new URI(U[0].getUrl()));
                    break;

                case 2:
                    Desktop.getDesktop().browse(new URI(U[1].getUrl()));
                    break;

                case 3:
                    Desktop.getDesktop().browse(new URI(U[2].getUrl()));
                    break;

                case 4:
                    Desktop.getDesktop().browse(new URI(U[3].getUrl()));
                    break;

                case 5:
                    Desktop.getDesktop().browse(new URI(U[4].getUrl()));
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }

        } while (op != 6);

    }
}
