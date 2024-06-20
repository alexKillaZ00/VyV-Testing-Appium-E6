package sistemaDNJ;

import escpos.EscPos;
import escpos.EscPosConst;
import escpos.Style;
import java.io.IOException;
import javax.print.PrintService;
import output.PrinterOutputStream;

public class Ticket {
    //PEGAR DENTRO DE UNA CLASE

 //proporciona información y funcionalidad relacionada
    //con los servicios de impresión disponibles en el sistema.
    private PrintService servicioImpresion;

    //EscPos (Esc/POS) es un estándar de comandos de 
    //impresión utilizados en impresoras térmicas y de recibos.
    private EscPos escpos;
    private Style title;
    private Style subtitle;
    private Style bold;
    private Style prod;

    public void imprimirPOS80C(String impresora, String nombreTienda, String vendedor, String[][] datos, float subtotal, float iva ,float total, float pago, float cambio, String mensaje, int noVenta) {

        try {
            this.servicioImpresion = PrinterOutputStream.getPrintServiceByName(impresora);

            this.escpos = new EscPos(new PrinterOutputStream(this.servicioImpresion));

            this.escpos.setCharacterCodeTable(EscPos.CharacterCodeTable.ISO8859_2_Latin2);

            //estilos
            this.title = new Style()
                    .setFontSize(Style.FontSize._2, Style.FontSize._2)
                    .setJustification(EscPosConst.Justification.Center);

            this.subtitle = new Style(escpos.getStyle())
                    .setBold(true)
                    .setFontSize(Style.FontSize._1, Style.FontSize._1)
                    .setUnderline(Style.Underline.OneDotThick);

            this.bold = new Style(escpos.getStyle())
                    .setBold(true)
                    .setFontSize(Style.FontSize._1, Style.FontSize._1);

            this.prod = new Style(escpos.getStyle())
                    .setFontSize(Style.FontSize._1, Style.FontSize._1)
                    .setUnderline(Style.Underline.None_Default);

            this.escpos.writeLF(this.title, nombreTienda);//Nombre establecimiento
            this.escpos.feed(1);
            this.escpos.write("Vendedor: ");//Clientes
            this.escpos.feed(1);
                        
            this.escpos.writeLF(this.subtitle, vendedor);//Nombre Vendedor
            this.escpos.feed(1);

            this.escpos.writeLF(this.subtitle, "No. Ticket: " + noVenta);
            this.escpos.feed(1);
            this.escpos.writeLF("CANT.    DESCR.                     IMPORT.");
            this.escpos.writeLF("-------------------------------------------");//43

            for (String[] dato : datos) {
                String linea = String.format("%-7s%-28s$%s", dato[0], dato[1], dato[2]);
                this.escpos.writeLF(this.prod, linea);
            }

            this.escpos.writeLF("-------------------------------------------");
            this.escpos.feed(1);
            String lineaSubtotal = String.format("%-37s%s", "Subtotal", "$" + subtotal);
            String lineaIVA = String.format("%-37s%s", "IVA", "$" + iva);
            String lineaTotal = String.format("%-37s%s", "TOTAL", "$" + total);
            String lineaPago = String.format("%-37s%s", "Pago con", "$" + pago);
            String lineaCambio = String.format("%-37s%s", "Cambio", "$" + cambio);

            this.escpos.writeLF(this.bold, lineaSubtotal);
            this.escpos.writeLF(this.bold, lineaIVA);            
            this.escpos.writeLF(this.bold, lineaTotal);
            this.escpos.writeLF(this.bold, lineaPago);
            this.escpos.writeLF(this.bold, lineaCambio);
            this.escpos.feed(1);
            this.escpos.writeLF(this.prod, mensaje);
            this.escpos.writeLF("-------------------------------------------");
            this.escpos.feed(4);

            this.escpos.cut(EscPos.CutMode.FULL);

            this.escpos.close();

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public String[] listaImpresoras() {
        try {
            //retornamos la lista de nombres de las impresoras
            return PrinterOutputStream.getListPrintServicesNames();
        } catch (Exception e) {
            System.out.println("Error al obtener impresoras: " + e.getMessage());
            return new String[]{"No hay nada"};
        }

    }


}

