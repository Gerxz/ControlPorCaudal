//ESTA CLASE CONTIENE LOS MÉTODOS PARA ARMAR LOS REGLONES
//DESARROLLADOR POR GERXZ - PARA VOS CACATÚA
package controlporcaudal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Metodos {

    int contador = 1;

    //INSTANCIAMOS LAS CLASES
    Elementos obtenerElementos = new Elementos();
    ElementosSeteados setearElementos = new ElementosSeteados();
    Flechazo flechazo1 = new Flechazo();
    Booleanos booleano = new Booleanos();

    //LE DAMOS LUZ VERDE PARA CREAR LOS TAGS
    Workbook libro = new HSSFWorkbook(); //LLAMAMOS A ESTA LIBRERIA
    Sheet hoja = libro.createSheet("TAGS"); //CREAMOS LA HOJA CON LOS TAGS
    Row row = hoja.createRow(0); //HABILITAMOS PARA CREAR EL PRIMER REGLON DEL EXCEL
    Row row1 = hoja.createRow(contador); //REGLON DE PRUEBA ANALOGICO
    Row row2 = hoja.createRow(contador);

    //CREAMOS LOS ARRAYS
    String[] vector = flechazo1.llamandoAlPrimerReglon();
    String[] vectorAnalogico = flechazo1.llamandoAlTagAnalogico();
    String[] vectorDigital = flechazo1.llamandoAlTagDigital();
    String[] vectorEspecial = flechazo1.llamandoAlTagEspecial();

    //MÉTODO PRINCIPAL PARA CREAR EL EXCEL
    public void creandoExcel() {
        //FOR QUE CREA EL PRIMER REGLON
        for (int i = 0; i <= 50; i++) {
            row.createCell(i).setCellValue(vector[i]);
        }
        //superMetodo();
        if (Booleanos.getFaactorA().equals("ENCENDIDO")) {
            factorA();
            //contador = contador + 1;
            System.out.println("PASASTE EL PRIMER IF DE LA CLASE METODOS");
            if (Booleanos.getFaactorB().equals("ENCENDIDO")) {
                factorB();
                //contador = contador + 1;
                System.out.println("PASASTE EL SEGUNDO IF DE LA CLASE METODOS");
            } else {
                JOptionPane.showMessageDialog(null, "NO CARGASTE NADA LORO");
            }
        }

        //LANZAMOS UN TRY - CATCH PARA VERIFICAR QUE NO EXIST AUN ARCHIVO IGUAL O SINO ENCUENTRA LA CLASE
        try {
            FileOutputStream fileout = new FileOutputStream("CONTROL X CAUDAL.xls");//NOMBRE DEL ARCHIVO A CREAR
            libro.write(fileout); //SOBREESCRIBIMOS
            fileout.close();//CERRAMOS EL ARCHIVO EN ESTE PROGRAMA

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ElementosSeteados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElementosSeteados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//METODO DEL FACTOR A
    public void factorA() {
        for (int a = 0; a <= 50; a++) {
            row1.createCell(1).setCellValue(Elementos.getZona() + "_" + obtenerElementos.getTag() + "_TKAXX_LT001_SPLA0");
            row1.createCell(15).setCellValue("SET POINT DE NIVEL - LIMITE A :: " + obtenerElementos.getTag());
            row1.createCell(17).setCellValue("m");
            row1.createCell(a).setCellValue(vectorAnalogico[a]);
        }
    }

    //METODO DEL FACTOR B
    public void factorB() {
        for (int a = 0; a <= 50; a++) {
            row2.createCell(1).setCellValue(Elementos.getZona() + "_" + obtenerElementos.getTag() + "_TKAXX_LT001_SPLB0");
            row2.createCell(15).setCellValue("SET POINT DE NIVEL - LIMITE B :: " + obtenerElementos.getTag());
            row2.createCell(17).setCellValue("m");
            row2.createCell(a).setCellValue(vectorAnalogico[a]);
        }
    }

    //METODO QUE RECOPILA TODO -> PERRO
    public void superMetodo() {
        if (Booleanos.getFaactorA().equals("ENCENDIDO")) {
            factorA();
            contador = contador + 1;
        } else if (Booleanos.getFaactorB().equals("ENCENDIDO")) {
            factorB();
            contador = contador + 1;
        } else {
            JOptionPane.showMessageDialog(null, "NO CARGASTE NADA LORO");
        }
    }

    public void superSwitch() {
        //switch(contador > 0){

    }
}
