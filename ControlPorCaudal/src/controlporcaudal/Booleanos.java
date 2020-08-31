//CLASE QUE TIENE LOS BOOLEANOS PARA HABILITAR EL SWITCH DE LA CLASE METODOS
//DESARROLLADO POR GERXZ - PARA VOS CACATÚA 
package controlporcaudal;

public class Booleanos {
    //VARIABLES BOOLEANAS
    private static String faactorA; 
    private static String faactorB;
    private static boolean factorA;
    private static boolean factorB;
    private static boolean factorC;
    private static boolean factorD;
    private static boolean nivelSPEpan;
    private static boolean nivelSPLA;
    private static boolean nivelSPLB;
    private static boolean nivelSP;
    private static boolean nivelSPLC;
    private static boolean nivelSPLD;
    private static boolean SPEpbn;
    private static boolean caudalSPVA;
    private static boolean caudalSPVB;
    private static boolean caudalSPVC;
    private static boolean caudalSPVD;
    private static boolean digitalesValvRecirc;
    private static boolean digitalesEstadoValv;
    private static boolean digitalesEnclValc;
    private static boolean digitalesEncAltoNivel;
    private static boolean digitalesEncBajoNivel;
    private static boolean digitalesHiloLTCortado;
    private static boolean digitalesHiloPTCortado;
    private static boolean digitalesHiloYFallaAltus;
    private static boolean digitalesFallaComAltus;
    private static boolean digitalesFallaSensorAltus;
    private static boolean otrosSP;
    private static boolean otrosPresionGas;
    private static boolean otrosCaudalVariable;
    private static boolean otrosCaudalBruto;
    private static boolean otrosEnclavamiento;

    //CONSTRUCTOR VACIO    
    public Booleanos() {
    }
    
    //CONSTRUCTOR CON PARAMETROS
    public Booleanos(String faactorA, String faactorB,boolean factorA, boolean factorB, boolean factorC, boolean factorD, boolean nivelSPEpan, boolean nivelSPLA, boolean nivelSPLB, boolean nivelSP, boolean nivelSPLC, boolean nivelSPLD, boolean SPEpbn, boolean caudalSPVA, boolean caudalSPVB, boolean caudalSPVC, boolean caudalSPVD, boolean digitalesValvRecirc, boolean digitalesEstadoValv, boolean digitalesEnclValc, boolean digitalesEncAltoNivel, boolean digitalesEncBajoNivel, boolean digitalesHiloLTCortado, boolean digitalesHiloPTCortado, boolean digitalesHiloYFallaAltus, boolean digitalesFallaComAltus, boolean digitalesFallaSensorAltus, boolean otrosSP, boolean otrosPresionGas, boolean otrosCaudalVariable, boolean otrosCaudalBruto, boolean otrosEnclavamiento) {
        Booleanos.faactorA = faactorA;
        Booleanos.faactorB = faactorB;
        Booleanos.factorA = factorA;
        Booleanos.factorB = factorB;
        Booleanos.factorC = factorC;
        Booleanos.factorD = factorD;
        Booleanos.nivelSPEpan = nivelSPEpan;
        Booleanos.nivelSPLA = nivelSPLA;
        Booleanos.nivelSPLB = nivelSPLB;
        Booleanos.nivelSP = nivelSP;
        Booleanos.nivelSPLC = nivelSPLC;
        Booleanos.nivelSPLD = nivelSPLD;
        Booleanos.SPEpbn = SPEpbn;
        Booleanos.caudalSPVA = caudalSPVA;
        Booleanos.caudalSPVB = caudalSPVB;
        Booleanos.caudalSPVC = caudalSPVC;
        Booleanos.caudalSPVD = caudalSPVD;
        Booleanos.digitalesValvRecirc = digitalesValvRecirc;
        Booleanos.digitalesEstadoValv = digitalesEstadoValv;
        Booleanos.digitalesEnclValc = digitalesEnclValc;
        Booleanos.digitalesEncAltoNivel = digitalesEncAltoNivel;
        Booleanos.digitalesEncBajoNivel = digitalesEncBajoNivel;
        Booleanos.digitalesHiloLTCortado = digitalesHiloLTCortado;
        Booleanos.digitalesHiloPTCortado = digitalesHiloPTCortado;
        Booleanos.digitalesHiloYFallaAltus = digitalesHiloYFallaAltus;
        Booleanos.digitalesFallaComAltus = digitalesFallaComAltus;
        Booleanos.digitalesFallaSensorAltus = digitalesFallaSensorAltus;
        Booleanos.otrosSP = otrosSP;
        Booleanos.otrosPresionGas = otrosPresionGas;
        Booleanos.otrosCaudalVariable = otrosCaudalVariable;
        Booleanos.otrosCaudalBruto = otrosCaudalBruto;
        Booleanos.otrosEnclavamiento = otrosEnclavamiento;
    }
    
    //SETTERS

    public static void setFaactorA(String faactorA) {
        Booleanos.faactorA = faactorA;
    }

    public static void setFaactorB(String faactorB) {
        Booleanos.faactorB = faactorB;
    }
    
    public void setFactorA(boolean factorA) {
        Booleanos.factorA = factorA;
    }

    public void setFactorB(boolean factorB) {
        Booleanos.factorB = factorB;
    }

    public void setFactorC(boolean factorC) {
        Booleanos.factorC = factorC;
    }

    public void setFactorD(boolean factorD) {
        Booleanos.factorD = factorD;
    }

    public void setNivelSPEpan(boolean nivelSPEpan) {
        Booleanos.nivelSPEpan = nivelSPEpan;
    }

    public void setNivelSPLA(boolean nivelSPLA) {
        Booleanos.nivelSPLA = nivelSPLA;
    }

    public void setNivelSPLB(boolean nivelSPLB) {
        Booleanos.nivelSPLB = nivelSPLB;
    }

    public void setNivelSP(boolean nivelSP) {
        Booleanos.nivelSP = nivelSP;
    }

    public void setNivelSPLC(boolean nivelSPLC) {
        Booleanos.nivelSPLC = nivelSPLC;
    }

    public void setNivelSPLD(boolean nivelSPLD) {
        Booleanos.nivelSPLD = nivelSPLD;
    }

    public void setSPEpbn(boolean SPEpbn) {
        Booleanos.SPEpbn = SPEpbn;
    }

    public void setCaudalSPVA(boolean caudalSPVA) {
        Booleanos.caudalSPVA = caudalSPVA;
    }

    public void setCaudalSPVB(boolean caudalSPVB) {
        Booleanos.caudalSPVB = caudalSPVB;
    }

    public void setCaudalSPVC(boolean caudalSPVC) {
        Booleanos.caudalSPVC = caudalSPVC;
    }

    public void setCaudalSPVD(boolean caudalSPVD) {
        Booleanos.caudalSPVD = caudalSPVD;
    }

    public void setDigitalesValvRecirc(boolean digitalesValvRecirc) {
        Booleanos.digitalesValvRecirc = digitalesValvRecirc;
    }

    public void setDigitalesEstadoValv(boolean digitalesEstadoValv) {
        Booleanos.digitalesEstadoValv = digitalesEstadoValv;
    }

    public void setDigitalesEnclValc(boolean digitalesEnclValc) {
        Booleanos.digitalesEnclValc = digitalesEnclValc;
    }

    public void setDigitalesEncAltoNivel(boolean digitalesEncAltoNivel) {
        Booleanos.digitalesEncAltoNivel = digitalesEncAltoNivel;
    }

    public void setDigitalesEncBajoNivel(boolean digitalesEncBajoNivel) {
        Booleanos.digitalesEncBajoNivel = digitalesEncBajoNivel;
    }

    public void setDigitalesHiloLTCortado(boolean digitalesHiloLTCortado) {
        Booleanos.digitalesHiloLTCortado = digitalesHiloLTCortado;
    }

    public void setDigitalesHiloPTCortado(boolean digitalesHiloPTCortado) {
        Booleanos.digitalesHiloPTCortado = digitalesHiloPTCortado;
    }

    public void setDigitalesHiloYFallaAltus(boolean digitalesHiloYFallaAltus) {
        Booleanos.digitalesHiloYFallaAltus = digitalesHiloYFallaAltus;
    }

    public void setDigitalesFallaComAltus(boolean digitalesFallaComAltus) {
        Booleanos.digitalesFallaComAltus = digitalesFallaComAltus;
    }

    public void setDigitalesFallaSensorAltus(boolean digitalesFallaSensorAltus) {
        Booleanos.digitalesFallaSensorAltus = digitalesFallaSensorAltus;
    }

    public void setOtrosSP(boolean otrosSP) {
        Booleanos.otrosSP = otrosSP;
    }

    public void setOtrosPresionGas(boolean otrosPresionGas) {
        Booleanos.otrosPresionGas = otrosPresionGas;
    }

    public void setOtrosCaudalVariable(boolean otrosCaudalVariable) {
        Booleanos.otrosCaudalVariable = otrosCaudalVariable;
    }

    public void setOtrosCaudalBruto(boolean otrosCaudalBruto) {
        Booleanos.otrosCaudalBruto = otrosCaudalBruto;
    }

    public void setOtrosEnclavamiento(boolean otrosEnclavamiento) {
        Booleanos.otrosEnclavamiento = otrosEnclavamiento;
    }
    
    //GETTERS
    public static String getFaactorA() {
        return faactorA;
    }

    public static String getFaactorB() {
        return faactorB;
    }
       
    public boolean isFactorA() {
        return factorA;
    }

    public boolean isFactorB() {
        return factorB;
    }

    public boolean isFactorC() {
        return factorC;
    }

    public boolean isFactorD() {
        return factorD;
    }

    public boolean isNivelSPEpan() {
        return nivelSPEpan;
    }

    public boolean isNivelSPLA() {
        return nivelSPLA;
    }

    public boolean isNivelSPLB() {
        return nivelSPLB;
    }

    public boolean isNivelSP() {
        return nivelSP;
    }

    public boolean isNivelSPLC() {
        return nivelSPLC;
    }

    public boolean isNivelSPLD() {
        return nivelSPLD;
    }

    public boolean isSPEpbn() {
        return SPEpbn;
    }

    public boolean isCaudalSPVA() {
        return caudalSPVA;
    }

    public boolean isCaudalSPVB() {
        return caudalSPVB;
    }

    public boolean isCaudalSPVC() {
        return caudalSPVC;
    }

    public boolean isCaudalSPVD() {
        return caudalSPVD;
    }

    public boolean isDigitalesValvRecirc() {
        return digitalesValvRecirc;
    }

    public boolean isDigitalesEstadoValv() {
        return digitalesEstadoValv;
    }

    public boolean isDigitalesEnclValc() {
        return digitalesEnclValc;
    }

    public boolean isDigitalesEncAltoNivel() {
        return digitalesEncAltoNivel;
    }

    public boolean isDigitalesEncBajoNivel() {
        return digitalesEncBajoNivel;
    }

    public boolean isDigitalesHiloLTCortado() {
        return digitalesHiloLTCortado;
    }

    public boolean isDigitalesHiloPTCortado() {
        return digitalesHiloPTCortado;
    }

    public boolean isDigitalesHiloYFallaAltus() {
        return digitalesHiloYFallaAltus;
    }

    public boolean isDigitalesFallaComAltus() {
        return digitalesFallaComAltus;
    }

    public boolean isDigitalesFallaSensorAltus() {
        return digitalesFallaSensorAltus;
    }

    public boolean isOtrosSP() {
        return otrosSP;
    }

    public boolean isOtrosPresionGas() {
        return otrosPresionGas;
    }

    public boolean isOtrosCaudalVariable() {
        return otrosCaudalVariable;
    }

    public boolean isOtrosCaudalBruto() {
        return otrosCaudalBruto;
    }

    public boolean isOtrosEnclavamiento() {
        return otrosEnclavamiento;
    }
}
