# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Transfer Online Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nomor rekening dan jumlah uang yang ditransfer, dan memberikan output berupa informasi detail dari nomor rekening tersebut seperti nama bank, admin, jumlah uang yang ditransfer.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Transfer`, `TransferDetail`, dan `TransferBeraksi` adalah contoh dari class.

```bash
public class Transfer {
    ...
}

public class TransferDetail extends Transfer {
    ...
}

public class TransferBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pengguna[i] = new TransferDetail(norek, jumlah);` adalah contoh pembuatan object.

```bash
pengguna[i] = new transferDetail(norek, jumlah);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `norek` dan `jumlah` adalah contoh atribut.

```bash
String norek;
String jumlah;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Transfer` dan `TransferDetail`.

```bash
public Transfer(String norek, String jumlah) {
    this.norek = norek;
    this.jumlah = jumlah;
}

public TransferDetail(String norek, String jumlah {
    super(norek, jumlah);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNorek` dan `setJumlah` adalah contoh method mutator.

```bash
public void setNama(String norek) {
    this.norek = norek;
}

public void setNpm(String jumlah) {
    this.jumlah = jumlah;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNorek`, `getJumlah`, `getNoBank`, `getBank`, `getAdmin` adalah contoh method accessor.

```bash
public String getNorek() {
    return norek;
}

public String getJumlah() {
    return jumlah;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String npm;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `TransferDetail` mewarisi `Transfer` dengan sintaks `extends`.

```bash
public class TransferDetail extends Transfer {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Transfer` merupakan overloading method `displayInfo` dan `displayInfo` di `TransferDetail` merupakan override dari method `displayInfo` di `Transfer`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nKelas: " + kelas;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getNoBank` dan seleksi `switch` dalam method `getBank`.

```bash
   public String getNoBank(){
        String kodeFak = getNorek().substring(0,2);
        if(kodeFak.equals("10")){
            return "bank";
        } else {
            return "non-bank";
        }

    //return getNpm().substring(2, 4).equals("10") ? "Teknologi Informasi" : "Fakultas lain";
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < Transfer.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nomor Rekening ke-" + (i + 1) + ": ");
String norek = scanner.nextLine();

System.out.println("\nmasukkan nomor rekening:");
System.out.println(Transfer.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `TransferDetail[] Transfer = new TransferDetail[2];` adalah contoh penggunaan array.

```bash
TransferDetail[] Transfer = new TransferDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Yuded Saputera
NPM: 2110010566
