//CLASE QUE TIENE LOS TITULOS Y ELEMENTOS 
//DESARROLLADO POR GERXZ - PARA VOS CACATÚA
package controlporcaudal;

public class Elementos {
//VARIABLES
    private String Selectx;
    private static String zona;
    private static String Tag;
    private String archiving;
    private String changedate;
    private String changer;
    private String compdev;
    private String compdevpercent;
    private String compmax;
    private String compmin;
    private String compressing;
    private String convers;
    private String creationdate;
    private String creator;
    private String datasecurity;
    private String descriptor;
    private String digitalset;
    private String displaydigits;
    private String engunits;
    private String excdev;
    private String excdevpercent;
    private String excmax;
    private String excmin;
    private String exdesc;
    private String filtercode;
    private String future;
    private String instrumenttag;
    private String location1;
    private String location2;
    private String location3;
    private String location4;
    private String location5;
    private String pointid;
    private String pointsource;
    private String pointtype;
    private String ptclassname;
    private String ptsecurity;
    private String recno;
    private String scan;
    private String shutdown;
    private String sourcetag;
    private String span;
    private String squareroot;
    private String srcptid;
    private String step;
    private String totalcode;
    private String typicalvalue;
    private String userint1;
    private String userint2;
    private String userreal1;
    private String userreal2;
    private String zero;
    private int superRow;

//CONSTRUCTOR CON PARAMETROS
    public Elementos(int superRow, String zona, String Selectx, String Tag, String archiving, String changedate, String changer, String compdev, String compdevpercent, String compmax, String compmin, String compressing, String convers, String creationdate, String creator, String datasecurity, String descriptor, String digitalset, String displaydigits, String engunits, String excdev, String excdevpercent, String excmax, String excmin, String exdesc, String filtercode, String future, String instrumenttag, String location1, String location2, String location3, String location4, String location5, String pointid, String pointsource, String pointtype, String ptclassname, String ptsecurity, String recno, String scan, String shutdown, String sourcetag, String span, String squareroot, String srcptid, String step, String totalcode, String typicalvalue, String userint1, String userint2, String userreal1, String userreal2, String zero) {
        this.Selectx = Selectx;
        Elementos.zona = zona;
        Elementos.Tag = Tag;
        this.superRow = superRow;
        this.archiving = archiving;
        this.changedate = changedate;
        this.changer = changer;
        this.compdev = compdev;
        this.compdevpercent = compdevpercent;
        this.compmax = compmax;
        this.compmin = compmin;
        this.compressing = compressing;
        this.convers = convers;
        this.creationdate = creationdate;
        this.creator = creator;
        this.datasecurity = datasecurity;
        this.descriptor = descriptor;
        this.digitalset = digitalset;
        this.displaydigits = displaydigits;
        this.engunits = engunits;
        this.excdev = excdev;
        this.excdevpercent = excdevpercent;
        this.excmax = excmax;
        this.excmin = excmin;
        this.exdesc = exdesc;
        this.filtercode = filtercode;
        this.future = future;
        this.instrumenttag = instrumenttag;
        this.location1 = location1;
        this.location2 = location2;
        this.location3 = location3;
        this.location4 = location4;
        this.location5 = location5;
        this.pointid = pointid;
        this.pointsource = pointsource;
        this.pointtype = pointtype;
        this.ptclassname = ptclassname;
        this.ptsecurity = ptsecurity;
        this.recno = recno;
        this.scan = scan;
        this.shutdown = shutdown;
        this.sourcetag = sourcetag;
        this.span = span;
        this.squareroot = squareroot;
        this.srcptid = srcptid;
        this.step = step;
        this.totalcode = totalcode;
        this.typicalvalue = typicalvalue;
        this.userint1 = userint1;
        this.userint2 = userint2;
        this.userreal1 = userreal1;
        this.userreal2 = userreal2;
        this.zero = zero;
        
    }
//CONSTRUCTOR SIN PARAMETROS
    public Elementos() {
    }

//SETTERS
    public void setSelectx(String Selectx) {
        this.Selectx = Selectx;
    }

    public void setTag(String Tag) {
        Elementos.Tag = Tag;
    }

    public void setArchiving(String archiving) {
        this.archiving = archiving;
    }

    public void setChangedate(String changedate) {
        this.changedate = changedate;
    }

    public void setChanger(String changer) {
        this.changer = changer;
    }

    public void setCompdev(String compdev) {
        this.compdev = compdev;
    }

    public void setCompdevpercent(String compdevpercent) {
        this.compdevpercent = compdevpercent;
    }

    public void setCompmax(String compmax) {
        this.compmax = compmax;
    }

    public void setCompmin(String compmin) {
        this.compmin = compmin;
    }

    public void setCompressing(String compressing) {
        this.compressing = compressing;
    }

    public void setConvers(String convers) {
        this.convers = convers;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDatasecurity(String datasecurity) {
        this.datasecurity = datasecurity;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public void setDigitalset(String digitalset) {
        this.digitalset = digitalset;
    }

    public void setDisplaydigits(String displaydigits) {
        this.displaydigits = displaydigits;
    }

    public void setEngunits(String engunits) {
        this.engunits = engunits;
    }

    public void setExcdev(String excdev) {
        this.excdev = excdev;
    }

    public void setExcdevpercent(String excdevpercent) {
        this.excdevpercent = excdevpercent;
    }

    public void setExcmax(String excmax) {
        this.excmax = excmax;
    }

    public void setExcmin(String excmin) {
        this.excmin = excmin;
    }

    public void setExdesc(String exdesc) {
        this.exdesc = exdesc;
    }

    public void setFiltercode(String filtercode) {
        this.filtercode = filtercode;
    }

    public void setFuture(String future) {
        this.future = future;
    }

    public void setInstrumenttag(String instrumenttag) {
        this.instrumenttag = instrumenttag;
    }

    public void setLocation1(String location1) {
        this.location1 = location1;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    public void setLocation3(String location3) {
        this.location3 = location3;
    }

    public void setLocation4(String location4) {
        this.location4 = location4;
    }

    public void setLocation5(String location5) {
        this.location5 = location5;
    }

    public void setPointid(String pointid) {
        this.pointid = pointid;
    }

    public void setPointsource(String pointsource) {
        this.pointsource = pointsource;
    }

    public void setPointtype(String pointtype) {
        this.pointtype = pointtype;
    }

    public void setPtclassname(String ptclassname) {
        this.ptclassname = ptclassname;
    }

    public void setPtsecurity(String ptsecurity) {
        this.ptsecurity = ptsecurity;
    }

    public void setRecno(String recno) {
        this.recno = recno;
    }

    public void setScan(String scan) {
        this.scan = scan;
    }

    public void setShutdown(String shutdown) {
        this.shutdown = shutdown;
    }

    public void setSourcetag(String sourcetag) {
        this.sourcetag = sourcetag;
    }

    public void setSpan(String span) {
        this.span = span;
    }

    public void setSquareroot(String squareroot) {
        this.squareroot = squareroot;
    }

    public void setSrcptid(String srcptid) {
        this.srcptid = srcptid;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public void setTotalcode(String totalcode) {
        this.totalcode = totalcode;
    }

    public void setTypicalvalue(String typicalvalue) {
        this.typicalvalue = typicalvalue;
    }

    public void setUserint1(String userint1) {
        this.userint1 = userint1;
    }

    public void setUserint2(String userint2) {
        this.userint2 = userint2;
    }

    public void setUserreal1(String userreal1) {
        this.userreal1 = userreal1;
    }

    public void setUserreal2(String userreal2) {
        this.userreal2 = userreal2;
    }

    public void setZero(String zero) {
        this.zero = zero;
    }

    public static void setZona(String zona) {
        Elementos.zona = zona;
    }

    public void setSuperRow(int superRow) {
        this.superRow = superRow;
    }

//GETTERS
    public String getSelectx() {
        return Selectx;
    }

    public String getTag() {
        return Tag;
    }

    public String getArchiving() {
        return archiving;
    }

    public String getChangedate() {
        return changedate;
    }

    public String getChanger() {
        return changer;
    }

    public String getCompdev() {
        return compdev;
    }

    public String getCompdevpercent() {
        return compdevpercent;
    }

    public String getCompmax() {
        return compmax;
    }

    public String getCompmin() {
        return compmin;
    }

    public String getCompressing() {
        return compressing;
    }

    public String getConvers() {
        return convers;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public String getCreator() {
        return creator;
    }

    public String getDatasecurity() {
        return datasecurity;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public String getDigitalset() {
        return digitalset;
    }

    public String getDisplaydigits() {
        return displaydigits;
    }

    public String getEngunits() {
        return engunits;
    }

    public String getExcdev() {
        return excdev;
    }

    public String getExcdevpercent() {
        return excdevpercent;
    }

    public String getExcmax() {
        return excmax;
    }

    public String getExcmin() {
        return excmin;
    }

    public String getExdesc() {
        return exdesc;
    }

    public String getFiltercode() {
        return filtercode;
    }

    public String getFuture() {
        return future;
    }

    public String getInstrumenttag() {
        return instrumenttag;
    }

    public String getLocation1() {
        return location1;
    }

    public String getLocation2() {
        return location2;
    }

    public String getLocation3() {
        return location3;
    }

    public String getLocation4() {
        return location4;
    }

    public String getLocation5() {
        return location5;
    }

    public String getPointid() {
        return pointid;
    }

    public String getPointsource() {
        return pointsource;
    }

    public String getPointtype() {
        return pointtype;
    }

    public String getPtclassname() {
        return ptclassname;
    }

    public String getPtsecurity() {
        return ptsecurity;
    }

    public String getRecno() {
        return recno;
    }

    public String getScan() {
        return scan;
    }

    public String getShutdown() {
        return shutdown;
    }

    public String getSourcetag() {
        return sourcetag;
    }

    public String getSpan() {
        return span;
    }

    public String getSquareroot() {
        return squareroot;
    }

    public String getSrcptid() {
        return srcptid;
    }

    public String getStep() {
        return step;
    }

    public String getTotalcode() {
        return totalcode;
    }

    public String getTypicalvalue() {
        return typicalvalue;
    }

    public String getUserint1() {
        return userint1;
    }

    public String getUserint2() {
        return userint2;
    }

    public String getUserreal1() {
        return userreal1;
    }

    public String getUserreal2() {
        return userreal2;
    }

    public String getZero() {
        return zero;
    }

    public static String getZona() {
        return zona;
    }

    public int getSuperRow() {
        return superRow;
    }
 }
