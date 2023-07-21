
package pbo1;
public class TransferDetail extends Transfer{
//    overriding
    public TransferDetail(String norek, String jumlah) {
        super(norek, jumlah);
    }
    
    public int getAdmin() {
        return Integer.parseInt(getJumlah().substring( 0 ,5 )) + 6000;
    }
    
    public String getNoBank(){
        String kodeFak = getNorek().substring(0,2);
        if(kodeFak.equals("10")){
            return "bank";
        } else {
            return "non-bank";
        }
    }
    
    public String getBank(){
        String kodeBank = getNorek().substring(2, 4);
//        seleksi switch
        switch (kodeBank){
            case "11":
                return "BRI";
            case "22":
                return "BCA";
             case "33":
                return "BANK KALSEL";
            default:
                return "transfer lainnya";
        }
    }
    

    
//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nJumlah Transfer: "+getAdmin()+
                "\nKeterangan: "+getNoBank()+
                "\nNama Bank: "+getBank();
        
    }
}