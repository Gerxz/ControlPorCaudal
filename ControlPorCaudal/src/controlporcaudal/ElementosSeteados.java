//EN ESTA CLASE SETEAMOS LOS VALORES DEL REGLÓN NRO 1 Y LOS VALORES TANTO PARA ANALÓGICOS COMO DIGITALES
//DESARROLLADO POR GERXZ - PARA VOS CACATÚA
package controlporcaudal;

public class ElementosSeteados {

    Elementos elementos = new Elementos(); //INSTANCIAMOS A LA CLASE ELEMENTOS

    //ESTE MÉTODO RECOPILA EL VALOR DEL PRIMER REGLON DE CADA HOJA EXCEL PARA CREAR LOS TAGS
    public void setPrimerReglon(){
        elementos.setSelectx("Select (x)");
        elementos.setTag("Tag");
        elementos.setArchiving("archiving");
        elementos.setChangedate("changedate");
        elementos.setChanger("changer");
        elementos.setCompdev("compdev");
        elementos.setCompdevpercent("compdevpercent");
        elementos.setCompmax("compmax");
        elementos.setCompmin("compmin");
        elementos.setCompressing("compressing");
        elementos.setConvers("convers");
        elementos.setCreationdate("creationdate");
        elementos.setCreator("creator");
        elementos.setDatasecurity("datasecurity");
        elementos.setDescriptor("descriptor");
        elementos.setDigitalset("digitalset");
        elementos.setDisplaydigits("displaydigits");
        elementos.setEngunits("engunits");
        elementos.setExcdev("excdev");
        elementos.setExcdevpercent("excdevpercent");
        elementos.setExcmax("excmax");
        elementos.setExcmin("excmin");
        elementos.setExdesc("exdesc");
        elementos.setFiltercode("filtercode");
        elementos.setFuture("future");
        elementos.setInstrumenttag(("instrumenttag"));
        elementos.setLocation1("location1");
        elementos.setLocation2("location2");
        elementos.setLocation3("location3");
        elementos.setLocation4("location4");
        elementos.setLocation5("location5");
        elementos.setPointid("pointid");
        elementos.setPointsource("pointsource");
        elementos.setPointtype("pointtype");
        elementos.setPtclassname("ptclassname");
        elementos.setPtsecurity("ptsecurity");
        elementos.setRecno("recno");
        elementos.setScan("scan");
        elementos.setShutdown("shutdown");
        elementos.setSourcetag("sourcetag");
        elementos.setSpan("span");
        elementos.setSquareroot("squareroot");
        elementos.setSrcptid("srcptid");
        elementos.setStep("step");
        elementos.setTotalcode("totalcode");
        elementos.setTypicalvalue("typicalvalue");
        elementos.setUserint1("userint1");
        elementos.setUserint2("userint2");
        elementos.setUserreal1("userreal1");
        elementos.setUserreal2("userreal2");
        elementos.setZero("zero");
    }

   
}
