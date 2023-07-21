
package pbo1;

public class Transfer {
    //    atribut dan enkapsulasi
    private String norek;
    private String jumlah;
    
//    construktor
    public Transfer(String norek, String jumlah) {
        this.norek = norek;
        this.jumlah = jumlah;
    }
    
//    mutator (seter)
    public void setNorek(String norek) {
        this.norek = norek;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

//    accesor (getter)
    public String getNorek() {
        return norek;
    }

    public String getJumlah() {
        return jumlah;
    }
    
    public String displayInfo(){
       return "Norek: "+getNorek()+
              "\nJumlah: "+getJumlah(); 
    }
    
//    polymorphism (overloading)
    public String displayInfo(String kelas){
        return displayInfo() + "\nKelas: "+kelas;
    }
}


