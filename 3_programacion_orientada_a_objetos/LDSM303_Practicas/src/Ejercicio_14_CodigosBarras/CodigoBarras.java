/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_14_CodigosBarras;

import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import javax.imageio.ImageIO;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Code128;

/**
 *
 * @author mavel
 */
public class CodigoBarras {

    public void crea128(String c) throws IOException {
        JBarcodeBean jb = new JBarcodeBean();
        jb.setCodeType(new Code128());
        jb.setCode(c);
        jb.setCheckDigit(false);
        BufferedImage bi;
        bi = jb.draw(new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB));
        File f = new File("./src/Ejercicio_14_CodigosBarras/" + c + ".jpg");
        ImageIO.write(bi, "jpg", f);

    }

}
