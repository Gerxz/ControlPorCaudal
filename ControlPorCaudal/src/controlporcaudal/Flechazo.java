//CLASE QUE CONTIENE LOS ARRAYS PARA PODER GENERAR LOS TAGS
//DESARROLLADO POR GERXZ - PARA VOS CACATÚA
package controlporcaudal;

public class Flechazo {

    Elementos elementox = new Elementos();

    String[] primerReglonazo = new String[52]; //DECLARAMOS EL PRIMER ARREGLO PARA GENERAR EL PRIMER REGLON EN EXCEL
    String[] tagAnalogico = new String[52];
    String[] tagDigital = new String[52];
    String[] tagEspecial = new String[52];
    int[] sape = new int[30];
    int masBienLoquita = 1;
    

    //CREAMOS EL PRIMER ARRAY DEL REGLON DE LOS TITULOS
    public String[] llamandoAlPrimerReglon() {
        primerReglonazo[0] = "Select (x)";
        primerReglonazo[1] = "Tag";
        primerReglonazo[2] = "archiving";
        primerReglonazo[3] = "changedate";
        primerReglonazo[4] = "changer";
        primerReglonazo[5] = "compdev";
        primerReglonazo[6] = "compdevpercent";
        primerReglonazo[7] = "compmax";
        primerReglonazo[8] = "compmin";
        primerReglonazo[9] = "compressing";
        primerReglonazo[10] = "convers";
        primerReglonazo[11] = "creationdate";
        primerReglonazo[12] = "creator";
        primerReglonazo[13] = "datasecurity";
        primerReglonazo[14] = "descriptor";
        primerReglonazo[15] = "digitalset";
        primerReglonazo[16] = "displaydigits";
        primerReglonazo[17] = "engunits";
        primerReglonazo[18] = "excdev";
        primerReglonazo[19] = "excdevpercent";
        primerReglonazo[20] = "excmax";
        primerReglonazo[21] = "excmin";
        primerReglonazo[22] = "exdesc";
        primerReglonazo[23] = "filtercode";
        primerReglonazo[24] = "future";
        primerReglonazo[25] = "instrumenttag";
        primerReglonazo[26] = "location1";
        primerReglonazo[27] = "location2";
        primerReglonazo[28] = "location3";
        primerReglonazo[29] = "location4";
        primerReglonazo[30] = "location5";
        primerReglonazo[31] = "pointid";
        primerReglonazo[32] = "pointsource";
        primerReglonazo[33] = "pointtype";
        primerReglonazo[34] = "ptclassname";
        primerReglonazo[35] = "ptsecurity";
        primerReglonazo[36] = "recno";
        primerReglonazo[37] = "scan";
        primerReglonazo[38] = "shutdown";
        primerReglonazo[39] = "sourcetag";
        primerReglonazo[40] = "span";
        primerReglonazo[41] = "squareroot";
        primerReglonazo[42] = "srcptid";
        primerReglonazo[43] = "step";
        primerReglonazo[44] = "totalcode";
        primerReglonazo[45] = "typicalvalue";
        primerReglonazo[46] = "userint1";
        primerReglonazo[47] = "userint2";
        primerReglonazo[48] = "userreal1";
        primerReglonazo[49] = "userreal2";
        primerReglonazo[50] = "zero";

        return primerReglonazo;
    }
    
    //CREAMOS EL ARRAY DE LOS TAGS ANALOGICOS
    public String[] llamandoAlTagAnalogico() {
        tagAnalogico[0] = "x";
        //tagAnalogico[1] = "Se arma desde Jframe y metodo";
        tagAnalogico[2] = "1";
        tagAnalogico[3] = "31-Jan-89 10:30:00";
        tagAnalogico[4] = "YPF/YD";
        tagAnalogico[5] = "0";
        tagAnalogico[6] = "0";
        tagAnalogico[7] = "28800";
        tagAnalogico[8] = "0";
        tagAnalogico[9] = "0";
        tagAnalogico[10] = "1";
        tagAnalogico[11] = "31-Jan-89 10:30:00";
        tagAnalogico[12] = "YPF/YD";
        tagAnalogico[13] = "piadmin: A(r,w) | stc.pro: A(r) | PIWorld: A()";
        tagAnalogico[14] = "Desde el metodo";
        //tagAnalogico[15] = "";
        tagAnalogico[16] = "-5";
        //tagAnalogico[17] = "Desde el metodo";
        tagAnalogico[18] = "0";
        tagAnalogico[19] = "0";
        tagAnalogico[20] = "600";
        tagAnalogico[21] = "0";
        tagAnalogico[22] = "";
        tagAnalogico[23] = "0";
        tagAnalogico[24] = "0";
        tagAnalogico[25] = "Se arma desde Jframe y metodo";
        tagAnalogico[26] = "1";
        tagAnalogico[27] = "0";
        tagAnalogico[28] = "0";
        tagAnalogico[29] = "3";
        tagAnalogico[30] = "0";
        tagAnalogico[31] = "323685";
        tagAnalogico[32] = "";
        tagAnalogico[33] = "float32";
        tagAnalogico[34] = "classic";
        tagAnalogico[35] = "piadmin: A(r,w) | stc.pro: A(r) | PIWorld: A()";
        tagAnalogico[36] = "242011";
        tagAnalogico[37] = "1";
        tagAnalogico[38] = "0";
        tagAnalogico[39] = "";
        tagAnalogico[40] = "250";
        tagAnalogico[41] = "0";
        tagAnalogico[42] = "0";
        tagAnalogico[43] = "0";
        tagAnalogico[44] = "0";
        tagAnalogico[45] = "50";
        tagAnalogico[46] = "0";
        tagAnalogico[47] = "0";
        tagAnalogico[48] = "0";
        tagAnalogico[49] = "0";
        tagAnalogico[50] = "0";

        return tagAnalogico;
    }
    
    //CREAMOS EL ARRAY DE LOS TAGS ESPECIALES
    public String[] llamandoAlTagEspecial() {
        tagEspecial[0] = "x";
        tagEspecial[1] = "Se arma desde Jframe y metodo";
        tagEspecial[2] = "1";
        tagEspecial[3] = "31-Jan-89 10:30:00";
        tagEspecial[4] = "YPF/YD";
        tagEspecial[5] = "0,0005";
        tagEspecial[6] = "0,0005";
        tagEspecial[7] = "28800";
        tagEspecial[8] = "0";
        tagEspecial[9] = "0";
        tagEspecial[10] = "1";
        tagEspecial[11] = "31-Jan-89 10:30:00";
        tagEspecial[12] = "YPF/YD";
        tagEspecial[13] = "piadmin: A(r,w) | stc.pro: A(r) | PIWorld: A()";
        tagEspecial[14] = "Se arma en metodo";
        tagEspecial[15] = "";
        tagEspecial[16] = "-5";
        tagEspecial[17] = "kp";
        tagEspecial[18] = "0,0002";
        tagEspecial[19] = "0,0002";
        tagEspecial[20] = "600";
        tagEspecial[21] = "0";
        tagEspecial[22] = "";
        tagEspecial[23] = "0";
        tagEspecial[24] = "0";
        tagEspecial[25] = "Se arma desde Jframe y metodo";
        tagEspecial[26] = "1";
        tagEspecial[27] = "0";
        tagEspecial[28] = "0";
        tagEspecial[29] = "3";
        tagEspecial[30] = "0";
        tagEspecial[31] = "323699";
        tagEspecial[32] = "";
        tagEspecial[33] = "float32";
        tagEspecial[34] = "classic";
        tagEspecial[35] = "piadmin: A(r,w) | stc.pro: A(r) | PIWorld: A()";
        tagEspecial[36] = "242025";
        tagEspecial[37] = "1";
        tagEspecial[38] = "0";
        tagEspecial[39] = "";
        tagEspecial[40] = "100";
        tagEspecial[41] = "0";
        tagEspecial[42] = "0";
        tagEspecial[43] = "0";
        tagEspecial[44] = "0";
        tagEspecial[45] = "50";
        tagEspecial[46] = "0";
        tagEspecial[47] = "0";
        tagEspecial[48] = "0";
        tagEspecial[49] = "0";
        tagEspecial[50] = "0";

        return tagEspecial;
    }

    //CREAMOS EL ARRAY DE LOS TAGS DIGITALES
    public String[] llamandoAlTagDigital() {
        tagDigital[0] = "x";
        tagDigital[1] = "Se arma desde Jframe y metodo";
        tagDigital[2] = "1";
        tagDigital[3] = "31-Jan-89 10:30:00";
        tagDigital[4] = "YPF/YD";
        tagDigital[5] = "0";
        tagDigital[6] = "0";
        tagDigital[7] = "28800";
        tagDigital[8] = "0";
        tagDigital[9] = "0";
        tagDigital[10] = "1";
        tagDigital[11] = "31-Jan-89 10:30:00";
        tagDigital[12] = "YPF/YD";
        tagDigital[13] = "piadmin: A(r,w) | stc.pro: A(r) | PIWorld: A()";
        tagDigital[14] = "Desde el metodo";
        tagDigital[15] = "Desde método";
        tagDigital[16] = "2";
        tagDigital[17] = "ESTADO";
        tagDigital[18] = "0";
        tagDigital[19] = "0";
        tagDigital[20] = "600";
        tagDigital[21] = "0";
        tagDigital[22] = "";
        tagDigital[23] = "0";
        tagDigital[24] = "0";
        tagDigital[25] = "se arma en el metodo.F_CV";
        tagDigital[26] = "1";
        tagDigital[27] = "0";
        tagDigital[28] = "0";
        tagDigital[29] = "2";
        tagDigital[30] = "0";
        tagDigital[31] = "323712";
        tagDigital[32] = "desde JFrame";
        tagDigital[33] = "digital";
        tagDigital[34] = "classic";
        tagDigital[35] = "piadmin: A(r,w) | stc.pro: A(r) | PIWorld: A()";
        tagDigital[36] = "242038";
        tagDigital[37] = "1";
        tagDigital[38] = "0";
        tagDigital[39] = "";
        tagDigital[40] = "1";
        tagDigital[41] = "0";
        tagDigital[42] = "0";
        tagDigital[43] = "1";
        tagDigital[44] = "0";
        tagDigital[45] = "0";
        tagDigital[46] = "0";
        tagDigital[47] = "0";
        tagDigital[48] = "0";
        tagDigital[49] = "0";
        tagDigital[50] = "70";

        return tagDigital;
    }

}
