
package pbo1;

    import java.util.Scanner;

public class TransferBeraksi {
    public static void main(String[] args) {
//        objek

//Error handling
try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);

    //array
        TransferDetail[] pengguna = new TransferDetail[2];
        for(int i=0; i<pengguna.length; i++) {
                System.out.print("Masukkan Nomor Rekening "+(i+1)+" ");
                String norek = scanner.nextLine();
                System.out.print("Masukkan jumlah transfer "+(i+1)+" ");
                String jumlah = scanner.nextLine();

        //        objek
                pengguna[i] = new TransferDetail (norek, jumlah);
    }

        for(TransferDetail data: pengguna) {
            System.out.println("==================");
            System.out.println("Hasil Transfer: ");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format Rekening: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan meinput : "+e.getMessage());
    }
  }
}

