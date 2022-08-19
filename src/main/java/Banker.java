public class Banker {
    public String makeReport(int typeOfReport) throws Exceptions1{
        if ((typeOfReport<1) || (typeOfReport>5)) throw new Exceptions1("Okidanje exceptiona", );
        return "Report " + typeOfReport;
    }
}

