public class BankManager {
    Banker b = new Banker();
    public String submitReport(int typeOfReport){
        String report = null;
        try {
            report = b.makeReport(typeOfReport);
        }
        catch (Exceptions1 e) {
            e.printStackTrace();
            System.out.println("Exception happened " + e.getMessage());
        }
        return report;
    }
}
