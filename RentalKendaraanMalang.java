package javaapplication1;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RentalKendaraanMalang {
     private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
    public static void main(String[] args) {
        Scanner rental = new Scanner(System.in);
        //data pelanggan
        String pelanggan = "Lina";
        String pass_pel = "1234";
        int noktp = (1111111111);
        String alamat = "Jl. Tidar";
        int no_tlp = 021231;
        //data admin 
        String admin = "admin";
        String pass_admin = "admin";
        //Jumlah kendaraan
        int Sepeda_Vario = 10;
        int Sepeda_Vixion = 10;
        int Mobil_Jazz = 10;
        int Mobil_Alphard = 10;
        int Mini_Bus = 10;
        int Bus = 10;
        //masuk
        System.out.println("Selamat Datang Di Rental Kendaraan Malang : ");
        System.out.println("1. Login");
        System.out.println("2. Registrasi");
        int[] masuk = {1,2};
        System.out.print("Masukkan Pilihan Anda : ");
        int masuk_2 = rental.nextInt();
        if (masuk_2 == 2) {
                    System.out.println("Selamat Datang, Silahkan Masukkan Data Anda : ");
                    Scanner p = new Scanner(System.in);
                    System.out.print("Nama      : ");
                    String n = p.nextLine();
                    System.out.print("Password  : ");
                    String ps = p.nextLine();
                    System.out.print("No.KTP    : ");
                    String nk = p.nextLine();
                    System.out.print("Alamat    : ");
                    String a = p.nextLine();
                    System.out.print("No.Telp   : ");
                    String nt = p.nextLine();
                    System.out.println(""
                            + "");
                    System.out.println("Ini Data Anda");
                    System.out.println("Nama      : "+n);
                    System.out.println("Password  : "+ps);
                    System.out.println("No.KTP    : "+nk);
                    System.out.println("Alamat    : "+a);
                    System.out.println("No.Telp   : "+nt);
        
                    String jawab = "N";
                    System.out.print(" Apakah Anda ingin Login Sekarang (Y/T)?  ");
                    String masuk_3 = p.nextLine();
                    String[] jawab_2 = {"Y","N"};
                  
                    if (masuk_3.equals(jawab_2[0])){
                            for(String b = "y"; b.equals("y") || b.equals("Y");){
                            Scanner u = new Scanner(System.in);
                            System.out.print("User : ");
                            String user = u.nextLine();
                            System.out.print("Password : ");
                            String pass_user = u.nextLine();
                        
                        if(user.equals(n)&&pass_user.equals(ps)) {
                            System.out.println("Selamat Datang Di Rental Kami.");
                            System.out.println("1. Sepeda Vario  " + "| Per hari 60 ribu     | " + "Per minggu 420 ribu  | " + "Per bulan 1,8 jt  |" );
                            System.out.println("2. Sepeda Vixion " + "| Per hari 100 ribu    | " + "Per minggu 700 ribu  | " + "Per bulan 3 jt    |" );
                            System.out.println("3. Mobil Jazz    " + "| Per hari 300 ribu    | " + "Per minggu 2,1 juta | " + "Per bulan 9 jt    |" );
                            System.out.println("4. Mobil Alphard " + "| Per hari 600 ribu    | " + "Per minggu 4,2 juta | " + "Per bulan 18 jt   |" );
                            System.out.println("5. Mini Bus      " + "| Per hari 800 ribu    | " + "Per minggu 5,6 juta | " + "Per bulan 24 jt   |" );
                            System.out.println("6. Bus           " + "| Per hari 1,1 juta   | " + "Per minggu 7,7 juta | " + "Per bulan 33 jt   |" );
                            System.out.print("Silahkan Pilih No. Kendaraan yang Anda Inginkan : ");
                            Scanner kdr = new Scanner(System.in);
                            int kendaraan[] = {1,2,3,4,5,6};
                            int kendaraan1 = kdr.nextInt();
                            
                                if (kendaraan1 == kendaraan[0]) {
                                    System.out.println("Paket Yang Kami Sediakan =");
                                    System.out.println("1. Harian");
                                    System.out.println("2. Mingguan");
                                    System.out.println("3. Bulanan");
                                    System.out.print("Paket Apa yang Anda Pilih = ");
                                    Scanner pkt = new Scanner(System.in);
                                    int paket[] = {1,2,3};
                                    int paket1 = pkt.nextInt();
                                    System.out.print("Jumlah sepeda yang anda inginkan : ");
                                    int jke= pkt.nextInt();
                                    
                                    if (paket1 == paket[0]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(60000*jke));
                                        System.out.println("Nama Kendaraan  : Sepeda Vario");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"S"+"V"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[1]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(420000*jke));
                                        System.out.println("Nama Kendaraan  : Sepeda Vario");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"S"+"V"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(1800000*jke));
                                        System.out.println("Nama Kendaraan  : Sepeda Vario");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"S"+"V"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    }
                                } else if (kendaraan1 == kendaraan[1]){
                                    System.out.println("Paket Yang Kami Sediakan =");
                                    System.out.println("1. Harian");
                                    System.out.println("2. Mingguan");
                                    System.out.println("3. Bulanan");
                                    System.out.print("Paket Apa yang Anda Pilih = ");
                                    Scanner pkt = new Scanner(System.in);
                                    int paket[] = {1,2,3};
                                    int paket1 = pkt.nextInt();
                                    System.out.print("Jumlah sepeda yang anda inginkan : ");
                                    int jke= pkt.nextInt();
                                    
                                    if (paket1 == paket[0]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(100000*jke));
                                        System.out.println("Nama Kendaraan  : Sepeda Vixion");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"S"+"I"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[1]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(700000*jke));
                                        System.out.println("Nama Kendaraan  : Sepeda Vixion");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"S"+"I"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(3000000*jke));
                                        System.out.println("Nama Kendaraan  : Sepeda Vario");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"S"+"I"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    }
                                }else if (kendaraan1 == kendaraan[2]){
                                    System.out.println("Paket Yang Kami Sediakan =");
                                    System.out.println("1. Harian");
                                    System.out.println("2. Mingguan");
                                    System.out.println("3. Bulanan");
                                    System.out.print("Paket Apa yang Anda Pilih = ");
                                    Scanner pkt = new Scanner(System.in);
                                    int paket[] = {1,2,3};
                                    int paket1 = pkt.nextInt();
                                    System.out.print("Jumlah mobil yang anda inginkan : ");
                                    int jke= pkt.nextInt();
                            
                                    if (paket1 == paket[0]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(300000*jke));
                                        System.out.println("Nama Kendaraan  : Mobil Jazz");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"J"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[1]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(2100000*jke));
                                        System.out.println("Nama Kendaraan  : Mobil Jazz");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"J"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(9000000*jke));
                                        System.out.println("Nama Kendaraan  : Mobil Jazz");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"J"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    }
                                }else if (kendaraan1 == kendaraan[3]){
                                    System.out.println("Paket Yang Kami Sediakan =");
                                    System.out.println("1. Harian");
                                    System.out.println("2. Mingguan");
                                    System.out.println("3. Bulanan");
                                    System.out.print("Paket Apa yang Anda Pilih = ");
                                    Scanner pkt = new Scanner(System.in);
                                    int paket[] = {1,2,3};
                                    int paket1 = pkt.nextInt();
                                    System.out.print("Jumlah mobil yang anda inginkan : ");
                                    int jke= pkt.nextInt();
                            
                                    if (paket1 == paket[0]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(600000*jke));
                                        System.out.println("Nama Kendaraan  : Mobil Alphard");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"A"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[1]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(4200000*jke));
                                        System.out.println("Nama Kendaraan  : Mobil Alphard");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"A"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(18000000*jke));
                                        System.out.println("Nama Kendaraan  : Mobil Alphard");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"A"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    }
                                }else if (kendaraan1 == kendaraan[4]){
                                    System.out.println("Paket Yang Kami Sediakan =");
                                    System.out.println("1. Harian");
                                    System.out.println("2. Mingguan");
                                    System.out.println("3. Bulanan");
                                    System.out.print("Paket Apa yang Anda Pilih = ");
                                    Scanner pkt = new Scanner(System.in);
                                    int paket[] = {1,2,3};
                                    int paket1 = pkt.nextInt();
                                    System.out.print("Jumlah mini bus yang anda inginkan : ");
                                    int jke= pkt.nextInt();
                                    
                                    if (paket1 == paket[0]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(800000*jke));
                                        System.out.println("Nama Kendaraan  : Mini Bus");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"B"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[1]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(5600000*jke));
                                        System.out.println("Nama Kendaraan  : Mini Bus");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"B"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(24000000*jke));
                                        System.out.println("Nama Kendaraan  : Mini Bus");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"B"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    }
                                }else if (kendaraan1 == kendaraan[5]){
                                    System.out.println("Paket Yang Kami Sediakan =");
                                    System.out.println("1. Harian");
                                    System.out.println("2. Mingguan");
                                    System.out.println("3. Bulanan");
                                    System.out.print("Paket Apa yang Anda Pilih = ");
                                    Scanner pkt = new Scanner(System.in);
                                    int paket[] = {1,2,3};
                                    int paket1 = pkt.nextInt();
                                    System.out.print("Jumlah sepeda yang anda inginkan : ");
                                    int jke= pkt.nextInt();
                            
                                    if (paket1 == paket[0]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(1100000*jke));
                                        System.out.println("Nama Kendaraan  : Bus");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"B"+"0"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[1]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(7700000*jke));
                                        System.out.println("Nama Kendaraan  : Bus");
                                        System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"B"+"0"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+n);
                                        System.out.println("No.Ktp          : "+nk);
                                        System.out.println("No.Telp         : "+nt);
                                        System.out.println("Alamat          : "+a);
                                        System.out.println("Harga           : "+(33000000*jke));
                                        System.out.println("Nama Kendaraan  : Bus");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"B"+"0"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                    }
                                }
                            break;
                            } else {
                                System.out.print("Maaf, User dan Password anda salah. Ulangi Lagi (Y/T)?");
                                b = u.next();
                            }
                        }  
                            
                    }else if(masuk_3.equals(jawab_2[1])){
                        System.out.println("Terima kasih, telah mengunjungi rental kami");
                    }
                    
            } else if(masuk_2 == 1){
                for(String a = "y"; a.equals("y") || a.equals("Y");){
                Scanner usr = new Scanner(System.in);
                System.out.print("User : ");
                String user = usr.nextLine();
                System.out.print("Password : ");
                String pass_user = usr.nextLine();
            
            if(user.equals(admin)&&pass_user.equals(pass_admin)) {
                System.out.println("Selamat Datang Admin. Ini adalah tampilan daftar kendaraan : ");
                System.out.println("1. Sepeda Vario  " + "| Per hari 60 ribu     | " + "Per minggu 420 ribu  | " + "Per bulan 1,8 jt");
                System.out.println("2. Sepeda Vixion " + "| Per hari 100 ribu    | " + "Per minggu 700 ribu  | " + "Per bulan 3 jt");
                System.out.println("3. Mobil Jazz    " + "| Per hari 300 ribu    | " + "Per minggu 2,1 juta | " + "Per bulan 9 jt");
                System.out.println("4. Mobil Alphard " + "| Per hari 600 ribu    | " + "Per minggu 4,2 juta | " + "Per bulan 18 jt");
                System.out.println("5. Mini Bus      " + "| Per hari 800 ribu    | " + "Per minggu 5,6 juta | " + "Per bulan 24 jt");
                System.out.println("6. Bus           " + "| Per hari 1,1 juta   | " + "Per minggu 7,7 juta | " + "Per bulan 33 jt");
                System.out.println("Apakah anda ingin : ");
                System.out.println("1. Menambahkan Data");
                System.out.println("2. Menghapus Data");
                System.out.println("3. Exit");
                System.out.print("Masukkan Pilihan Anda : ");
                int pil = usr.nextInt();
                int ph = 0,pm = 0,pb = 0,jk = 0;
                
                    if (pil == 1) {
                        Scanner n = new Scanner(System.in);
                        System.out.println("Masukkan Nama Kendaraan     : ");
                        String nkr = n.nextLine();
                        System.out.println("Masukkan Paketan Per Hari   : ");
                        ph = usr.nextInt();
                        System.out.println("Masukkan Paketan Per Minggu : ");
                        pm = usr.nextInt();
                        System.out.println("Masukkan Paketan Per Bulan  : ");
                        pb = usr.nextInt();
                    
                        System.out.println("Ini Tampilan Baru Anda : ");
                        System.out.println("1. Sepeda Vario  " + "| Per hari 60 ribu     | " + "Per minggu 420 ribu  | " + "Per bulan 1,8 jt");
                        System.out.println("2. Sepeda Vixion " + "| Per hari 100 ribu    | " + "Per minggu 700 ribu  | " + "Per bulan 3 jt");
                        System.out.println("3. Mobil Jazz    " + "| Per hari 300 ribu    | " + "Per minggu 2,1 jt | " + "Per bulan 9 jt");
                        System.out.println("4. Mobil Alphard " + "| Per hari 600 ribu    | " + "Per minggu 4,2 juta | " + "Per bulan 18 jt");
                        System.out.println("5. Mini Bus      " + "| Per hari 800 ribu    | " + "Per minggu 5,6 juta | " + "Per bulan 24 jt");
                        System.out.println("6. Bus           " + "| Per hari 1,1 juta   | " + "Per minggu 7,7 juta | " + "Per bulan 33 jt");
                        System.out.println("7. "+ nkr + "           " + "| Per hari " + ph+ " ribu   | "+ "Per minggu " + pm + " jt | " + "Per bulan " + pb + "jt | ");                        
                        break;
                        
                } else if (pil == 2){
                    System.out.println("Data no. berapa yang anda ingin hapus ? ");
                    int hps = usr.nextInt();
                        if (hps == 1) {
                            System.out.println("Ini Tampilan Baru Anda : ");
                            System.out.println("1. Sepeda Vixion " + "| Per hari 100 ribu    | " + "Per minggu 700 ribu  | " + "Per bulan 3 jt");
                            System.out.println("2. Mobil Jazz    " + "| Per hari 300 ribu    | " + "Per minggu 2,1 juta | " + "Per bulan 9 jt");
                            System.out.println("3. Mobil Alphard " + "| Per hari 600 ribu    | " + "Per minggu 4,2 juta | " + "Per bulan 18 jt");
                            System.out.println("4. Mini Bus      " + "| Per hari 800 ribu    | " + "Per minggu 5,6 juta | " + "Per bulan 24 jt");
                            System.out.println("5. Bus           " + "| Per hari 1,1 juta   | " + "Per minggu 7,7 juta | " + "Per bulan 33 jt");
                            
                            } else if (hps == 2){
                                System.out.println("Ini Tampilan Baru Anda : ");
                                System.out.println("1. Sepeda Vario  " + "| Per hari 60 ribu     | " + "Per minggu 420 ribu  | " + "Per bulan 1,8 jt");
                                System.out.println("2. Mobil Jazz    " + "| Per hari 300 ribu    | " + "Per minggu 2,1 juta | " + "Per bulan 9 jt");
                                System.out.println("3. Mobil Alphard " + "| Per hari 600 ribu    | " + "Per minggu 4,2 juta | " + "Per bulan 18 jt");
                                System.out.println("4. Mini Bus      " + "| Per hari 800 ribu    | " + "Per minggu 5,6 juta | " + "Per bulan 24 jt");
                                System.out.println("5. Bus           " + "| Per hari 1,1 juta   | " + "Per minggu 7,7 juta | " + "Per bulan 33 jt");
                                
                                }else if (hps == 3){
                                    System.out.println("Ini Tampilan Baru Anda : ");
                                    System.out.println("1. Sepeda Vario  " + "| Per hari 60 ribu     | " + "Per minggu 420 ribu  | " + "Per bulan 1,8 jt");
                                    System.out.println("2. Sepeda Vixion " + "| Per hari 100 ribu    | " + "Per minggu 700 ribu  | " + "Per bulan 3 jt");
                                    System.out.println("3. Mobil Alphard " + "| Per hari 600 ribu    | " + "Per minggu 4,2 juta | " + "Per bulan 18 jt");
                                    System.out.println("4. Mini Bus      " + "| Per hari 800 ribu    | " + "Per minggu 5,6 juta | " + "Per bulan 24 jt");
                                    System.out.println("5. Bus           " + "| Per hari 1,1 juta   | " + "Per minggu 7,7 juta | " + "Per bulan 33 jt");
                                    
                                    }else if (hps == 4){
                                        System.out.println("Ini Tampilan Baru Anda : ");
                                        System.out.println("1. Sepeda Vario  " + "| Per hari 60 ribu     | " + "Per minggu 420 ribu  | " + "Per bulan 1,8 jt");
                                        System.out.println("2. Sepeda Vixion " + "| Per hari 100 ribu    | " + "Per minggu 700 ribu  | " + "Per bulan 3 jt");
                                        System.out.println("3. Mobil Jazz    " + "| Per hari 300 ribu    | " + "Per minggu 2,1 juta | " + "Per bulan 9 jt");
                                        System.out.println("4. Mini Bus      " + "| Per hari 800 ribu    | " + "Per minggu 5,6 juta | " + "Per bulan 24 jt");
                                        System.out.println("5. Bus           " + "| Per hari 1,1 juta   | " + "Per minggu 7,7 juta | " + "Per bulan 33 jt");
                                        
                                        }else if (hps == 5){
                                            System.out.println("Ini Tampilan Baru Anda : ");
                                            System.out.println("1. Sepeda Vario  " + "| Per hari 60 ribu     | " + "Per minggu 420 ribu  | " + "Per bulan 1,8 jt");
                                            System.out.println("2. Sepeda Vixion " + "| Per hari 100 ribu    | " + "Per minggu 700 ribu  | " + "Per bulan 3 jt");
                                            System.out.println("3. Mobil Jazz    " + "| Per hari 300 ribu    | " + "Per minggu 2,1 juta | " + "Per bulan 9 jt");
                                            System.out.println("4. Mobil Alphard " + "| Per hari 600 ribu    | " + "Per minggu 4,2 juta | " + "Per bulan 18 jt");
                                            System.out.println("5. Bus           " + "| Per hari 1,1 juta   | " + "Per minggu 7,7 juta | " + "Per bulan 33 jt");
                                            
                                            }else if (hps == 6){
                                                System.out.println("Ini Tampilan Baru Anda : ");
                                                System.out.println("1. Sepeda Vario  " + "| Per hari 60 ribu     | " + "Per minggu 420 ribu  | " + "Per bulan 1,8 jt");
                                                System.out.println("2. Sepeda Vixion " + "| Per hari 100 ribu    | " + "Per minggu 700 ribu  | " + "Per bulan 3 jt");
                                                System.out.println("3. Mobil Jazz    " + "| Per hari 300 ribu    | " + "Per minggu 2,1 juta | " + "Per bulan 9 jt");
                                                System.out.println("4. Mobil Alphard " + "| Per hari 600 ribu    | " + "Per minggu 4,2 juta | " + "Per bulan 18 jt");
                                                System.out.println("5. Mini Bus      " + "| Per hari 800 ribu    | " + "Per minggu 5,6 juta | " + "Per bulan 24 jt");
                break;
                }else if (pil == 3){
                    System.out.println("Selamat Tinggal Admin");
                }
                break;
            }
        }
            else if(user.equals(pelanggan)&&pass_user.equals(pass_pel)) {
                System.out.println("Selamat Datang Di Rental Kami.");
                System.out.println("1. Sepeda Vario  " + "| Per hari 60 ribu     | " + "Per minggu 420 ribu  | " + "Per bulan 1,8 jt  |" );
                System.out.println("2. Sepeda Vixion " + "| Per hari 100 ribu    | " + "Per minggu 700 ribu  | " + "Per bulan 3 jt    |" );
                System.out.println("3. Mobil Jazz    " + "| Per hari 300 ribu    | " + "Per minggu 2,1 juta | " + "Per bulan 9 jt    |" );
                System.out.println("4. Mobil Alphard " + "| Per hari 600 ribu    | " + "Per minggu 4,2 juta | " + "Per bulan 18 jt   |" );
                System.out.println("5. Mini Bus      " + "| Per hari 800 ribu    | " + "Per minggu 5,6 juta | " + "Per bulan 24 jt   |" );
                System.out.println("6. Bus           " + "| Per hari 1,1 juta   | " + "Per minggu 7,7 juta | " + "Per bulan 33 jt   |" );
                System.out.print("Silahkan Pilih No. Kendaraan yang Anda Inginkan : ");
                Scanner kdr = new Scanner(System.in);
                int kendaraan[] = {1,2,3,4,5,6};
                int kendaraan1 = kdr.nextInt();
                    if (kendaraan1 == kendaraan[0]) {
                        System.out.println("Paket Yang Kami Sediakan =");
                        System.out.println("1. Harian");
                        System.out.println("2. Mingguan");
                        System.out.println("3. Bulanan");
                        System.out.print("Paket Apa yang Anda Pilih = ");
                        Scanner pkt = new Scanner(System.in);
                        int paket[] = {1,2,3};
                        int paket1 = pkt.nextInt();
                        System.out.print("Jumlah sepeda yang anda inginkan : ");
                        int jke= pkt.nextInt();
                            if (paket1 == paket[0]) {
                                System.out.println("--------------Nota----------------");
                                System.out.println("Nama            : "+pelanggan);
                                System.out.println("No.Ktp          : "+noktp);
                                System.out.println("No.Telp         : "+no_tlp);
                                System.out.println("Alamat          : "+alamat);
                                System.out.println("Harga           : "+(60000*jke));
                                System.out.println("Nama Kendaraan  : Sepeda Vario");
                                System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                for (int i = 0; i < jke; i++) {
                                    System.out.println("No.Plat         : "+"S"+"V"+i+(i+1));
                                }
                                RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                            } else if (paket1 == paket[1]) {
                                    System.out.println("--------------Nota----------------");
                                    System.out.println("Nama            : "+pelanggan);
                                    System.out.println("No.Ktp          : "+noktp);
                                    System.out.println("No.Telp         : "+no_tlp);
                                    System.out.println("Alamat          : "+alamat);
                                    System.out.println("Harga           : "+(420000*jke));
                                    System.out.println("Nama Kendaraan  : Sepeda Vario");
                                    System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                    for (int i = 0; i < jke; i++) {
                                        System.out.println("No.Plat         : "+"S"+"V"+i+(i+1));
                                    }
                                    RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                    System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                    System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+pelanggan);
                                        System.out.println("No.Ktp          : "+noktp);
                                        System.out.println("No.Telp         : "+no_tlp);
                                        System.out.println("Alamat          : "+alamat);
                                        System.out.println("Harga           : "+(1800000*jke));
                                        System.out.println("Nama Kendaraan  : Sepeda Vario");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"S"+"V"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                }
                    } else if (kendaraan1 == kendaraan[1]){
                        System.out.println("Paket Yang Kami Sediakan =");
                        System.out.println("1. Harian");
                        System.out.println("2. Mingguan");
                        System.out.println("3. Bulanan");
                        System.out.print("Paket Apa yang Anda Pilih = ");
                        Scanner pkt = new Scanner(System.in);
                        int paket[] = {1,2,3};
                        int paket1 = pkt.nextInt();
                            System.out.print("Jumlah sepeda yang anda inginoktpan : ");
                        int jke= pkt.nextInt();
                            if (paket1 == paket[0]) {
                                System.out.println("--------------Nota----------------");
                                System.out.println("Nama            : "+pelanggan);
                                System.out.println("No.Ktp          : "+noktp);
                                System.out.println("No.Telp         : "+no_tlp);
                                System.out.println("Alamat          : "+alamat);
                                System.out.println("Harga           : "+(100000*jke));
                                System.out.println("Nama Kendaraan  : Sepeda Vixion");
                                System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                for (int i = 0; i < jke; i++) {
                                    System.out.println("No.Plat         : "+"S"+"I"+i+(i+1));
                                }
                                RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                            } else if (paket1 == paket[1]) {
                                    System.out.println("--------------Nota----------------");
                                    System.out.println("Nama            : "+pelanggan);
                                    System.out.println("No.Ktp          : "+noktp);
                                    System.out.println("No.Telp         : "+no_tlp);
                                    System.out.println("Alamat          : "+alamat);
                                    System.out.println("Harga           : "+(700000*jke));
                                    System.out.println("Nama Kendaraan  : Sepeda Vixion");
                                    System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                    for (int i = 0; i < jke; i++) {
                                        System.out.println("No.Plat         : "+"S"+"I"+i+(i+1));
                                    }
                                    RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                    System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                    System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+pelanggan);
                                        System.out.println("No.Ktp          : "+noktp);
                                        System.out.println("No.Telp         : "+no_tlp);
                                        System.out.println("Alamat          : "+alamat);
                                        System.out.println("Harga           : "+(3000000*jke));
                                        System.out.println("Nama Kendaraan  : Sepeda Vario");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"S"+"I"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                }
                    }else if (kendaraan1 == kendaraan[2]){
                        System.out.println("Paket Yang Kami Sediakan =");
                        System.out.println("1. Harian");
                        System.out.println("2. Mingguan");
                        System.out.println("3. Bulanan");
                        System.out.print("Paket Apa yang Anda Pilih = ");
                        Scanner pkt = new Scanner(System.in);
                        int paket[] = {1,2,3};
                        int paket1 = pkt.nextInt();
                            System.out.print("Jumlah mobil yang anda inginoktpan : ");
                        int jke= pkt.nextInt();
                            if (paket1 == paket[0]) {
                                System.out.println("--------------Nota----------------");
                                System.out.println("Nama            : "+pelanggan);
                                System.out.println("No.Ktp          : "+noktp);
                                System.out.println("No.Telp         : "+no_tlp);
                                System.out.println("Alamat          : "+alamat);
                                System.out.println("Harga           : "+(300000*jke));
                                System.out.println("Nama Kendaraan  : Mobil Jazz");
                                System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                for (int i = 0; i < jke; i++) {
                                    System.out.println("No.Plat         : "+"M"+"J"+i+(i+1));
                                }
                                RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                            } else if (paket1 == paket[1]) {
                                    System.out.println("--------------Nota----------------");
                                    System.out.println("Nama            : "+pelanggan);
                                    System.out.println("No.Ktp          : "+noktp);
                                    System.out.println("No.Telp         : "+no_tlp);
                                    System.out.println("Alamat          : "+alamat);
                                    System.out.println("Harga           : "+(2100000*jke));
                                    System.out.println("Nama Kendaraan  : Mobil Jazz");
                                    System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                    for (int i = 0; i < jke; i++) {
                                        System.out.println("No.Plat         : "+"M"+"J"+i+(i+1));
                                    }
                                    RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                    System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                    System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+pelanggan);
                                        System.out.println("No.Ktp          : "+noktp);
                                        System.out.println("No.Telp         : "+no_tlp);
                                        System.out.println("Alamat          : "+alamat);
                                        System.out.println("Harga           : "+(9000000*jke));
                                        System.out.println("Nama Kendaraan  : Mobil Jazz");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"J"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                }
                    }else if (kendaraan1 == kendaraan[3]){
                        System.out.println("Paket Yang Kami Sediakan =");
                        System.out.println("1. Harian");
                        System.out.println("2. Mingguan");
                        System.out.println("3. Bulanan");
                        System.out.print("Paket Apa yang Anda Pilih = ");
                        Scanner pkt = new Scanner(System.in);
                        int paket[] = {1,2,3};
                        int paket1 = pkt.nextInt();
                        System.out.print("Jumlah mobil yang anda inginoktpan : ");
                        int jke= pkt.nextInt();
                            if (paket1 == paket[0]) {
                                System.out.println("--------------Nota----------------");
                                System.out.println("Nama            : "+pelanggan);
                                System.out.println("No.Ktp          : "+noktp);
                                System.out.println("No.Telp         : "+no_tlp);
                                System.out.println("Alamat          : "+alamat);
                                System.out.println("Harga           : "+(600000*jke));
                                System.out.println("Nama Kendaraan  : Mobil Alphard");
                                System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                for (int i = 0; i < jke; i++) {
                                    System.out.println("No.Plat         : "+"M"+"A"+i+(i+1));
                                }
                                RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                            } else if (paket1 == paket[1]) {
                                    System.out.println("--------------Nota----------------");
                                    System.out.println("Nama            : "+pelanggan);
                                    System.out.println("No.Ktp          : "+noktp);
                                    System.out.println("No.Telp         : "+no_tlp);
                                    System.out.println("Alamat          : "+alamat);
                                    System.out.println("Harga           : "+(4200000*jke));
                                    System.out.println("Nama Kendaraan  : Mobil Alphard");
                                    System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                    for (int i = 0; i < jke; i++) {
                                        System.out.println("No.Plat         : "+"M"+"A"+i+(i+1));
                                    }
                                    RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                    System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                    System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+pelanggan);
                                        System.out.println("No.Ktp          : "+noktp);
                                        System.out.println("No.Telp         : "+no_tlp);
                                        System.out.println("Alamat          : "+alamat);
                                        System.out.println("Harga           : "+(18000000*jke));
                                        System.out.println("Nama Kendaraan  : Mobil Alphard");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"A"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                }
                    }else if (kendaraan1 == kendaraan[4]){
                        System.out.println("Paket Yang Kami Sediakan =");
                        System.out.println("1. Harian");
                        System.out.println("2. Mingguan");
                        System.out.println("3. Bulanan");
                        System.out.print("Paket Apa yang Anda Pilih = ");
                        Scanner pkt = new Scanner(System.in);
                        int paket[] = {1,2,3};
                        int paket1 = pkt.nextInt();
                        System.out.print("Jumlah mini bus yang anda inginoktpan : ");
                        int jke= pkt.nextInt();
                            if (paket1 == paket[0]) {
                                System.out.println("--------------Nota----------------");
                                System.out.println("Nama            : "+pelanggan);
                                System.out.println("No.Ktp          : "+noktp);
                                System.out.println("No.Telp         : "+no_tlp);
                                System.out.println("Alamat          : "+alamat);
                                System.out.println("Harga           : "+(800000*jke));
                                System.out.println("Nama Kendaraan  : Mini Bus");
                                System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                for (int i = 0; i < jke; i++) {
                                    System.out.println("No.Plat         : "+"M"+"B"+i+(i+1));
                                }
                                RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                            } else if (paket1 == paket[1]) {
                                    System.out.println("--------------Nota----------------");
                                    System.out.println("Nama            : "+pelanggan);
                                    System.out.println("No.Ktp          : "+noktp);
                                    System.out.println("No.Telp         : "+no_tlp);
                                    System.out.println("Alamat          : "+alamat);
                                    System.out.println("Harga           : "+(5600000*jke));
                                    System.out.println("Nama Kendaraan  : Mini Bus");
                                    System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                    for (int i = 0; i < jke; i++) {
                                        System.out.println("No.Plat         : "+"M"+"B"+i+(i+1));
                                    }
                                    RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                    System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                    System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+pelanggan);
                                        System.out.println("No.Ktp          : "+noktp);
                                        System.out.println("No.Telp         : "+no_tlp);
                                        System.out.println("Alamat          : "+alamat);
                                        System.out.println("Harga           : "+(24000000*jke));
                                        System.out.println("Nama Kendaraan  : Mini Bus");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"M"+"B"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                }
                    }else if (kendaraan1 == kendaraan[5]){
                        System.out.println("Paket Yang Kami Sediakan =");
                        System.out.println("1. Harian");
                        System.out.println("2. Mingguan");
                        System.out.println("3. Bulanan");
                        System.out.print("Paket Apa yang Anda Pilih = ");
                        Scanner pkt = new Scanner(System.in);
                        int paket[] = {1,2,3};
                        int paket1 = pkt.nextInt();
                        System.out.print("Jumlah sepeda yang anda inginoktpan : ");
                        int jke= pkt.nextInt();
                            if (paket1 == paket[0]) {
                                System.out.println("--------------Nota----------------");
                                System.out.println("Nama            : "+pelanggan);
                                System.out.println("No.Ktp          : "+noktp);
                                System.out.println("No.Telp         : "+no_tlp);
                                System.out.println("Alamat          : "+alamat);
                                System.out.println("Harga           : "+(1100000*jke));
                                System.out.println("Nama Kendaraan  : Bus");
                                System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                for (int i = 0; i < jke; i++) {
                                    System.out.println("No.Plat         : "+"B"+"0"+i+(i+1));
                                }
                                RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                            } else if (paket1 == paket[1]) {
                                    System.out.println("--------------Nota----------------");
                                    System.out.println("Nama            : "+pelanggan);
                                    System.out.println("No.Ktp          : "+noktp);
                                    System.out.println("No.Telp         : "+no_tlp);
                                    System.out.println("Alamat          : "+alamat);
                                    System.out.println("Harga           : "+(7700000*jke));
                                    System.out.println("Nama Kendaraan  : Bus");
                                    System.out.println("Jumlah kendaraan yang anda minta = " + jke);
                                    for (int i = 0; i < jke; i++) {
                                        System.out.println("No.Plat         : "+"B"+"0"+i+(i+1));
                                    }
                                    RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                    System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                    System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                } else if (paket1 == paket[2]) {
                                        System.out.println("--------------Nota----------------");
                                        System.out.println("Nama            : "+pelanggan);
                                        System.out.println("No.Ktp          : "+noktp);
                                        System.out.println("No.Telp         : "+no_tlp);
                                        System.out.println("Alamat          : "+alamat);
                                        System.out.println("Harga           : "+(33000000*jke));
                                        System.out.println("Nama Kendaraan  : Bus");
                                        System.out.println("Jumlah kendaraan yang anda minta : " + jke);
                                        for (int i = 0; i < jke; i++) {
                                            System.out.println("No.Plat         : "+"B"+"0"+i+(i+1));
                                        }
                                        RentalKendaraanMalang tgl = new RentalKendaraanMalang();  
                                        System.out.println("Tanggal Penyewaan    : "+tgl.getTanggal());
                                        System.out.println("Tanggal Pengembalian : "+tgl.getTanggal());
                                }
                    }
                    break;
                    } else {
                    System.out.print("Maaf, User dan Password anda salah. Ulangi Lagi (Y/T)?");
                    a = usr.next();
                }    
            }
        }
    }
}