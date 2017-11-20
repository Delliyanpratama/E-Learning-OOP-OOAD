//package barang;

import java.util.Scanner;

public class Barang {

Scanner input = new Scanner (System.in);
    public String nama_brg;
    public String no_stok_brg;
    public String jenis_brg;
    public String suplier;
	public String jumlah_brg;
	public String harga_brg;
	
	public String konfirmasi1, konfirmasi2;
    
    public void jual_brg(){
		System.out.println("\n\n\n");
		System.out.println("Nama Barang : "+nama_brg);
		System.out.println("No Stok Barang  : "+no_stok_brg);
		System.out.println("Jenis Barang  : "+jenis_brg);
		System.out.println("Suplier Barang : "+suplier);
		System.out.println("Jumlah Barang : "+jumlah_brg);
		System.out.println("Harga Barang : "+harga_brg);
		System.out.println("\n");
		System.out.print("Apakah Mau Melanjutkan Penjualan (ya / tidak) ? " );
		konfirmasi1 = input.nextLine();
		if ("ya".equals(konfirmasi1)) {
		System.out.println("\n");
		System.out.println("Barang Telah Terjual.. ");
    }
}    
    public void retur_brg(){
		System.out.println("\n\n\n");
		System.out.println("Nama Barang Yang di Retur : "+nama_brg);
		System.out.println("No Stok Barang Yang Akan Diretur  : "+no_stok_brg);
		System.out.println("Jenis Barang Yang Diretur  : "+jenis_brg);
		System.out.println("Suplier Barang Yang Diretur : "+suplier);
		System.out.println("Jumlah Barang Yang Diretur : "+jumlah_brg);
		System.out.println("Harga Barang Yang Diretur : "+harga_brg);
		System.out.println("\n");
		System.out.print("Apakah Barang Akan Diretur (ya / tidak) ? " );
		konfirmasi2 = input.nextLine();
		if ("ya".equals(konfirmasi2)) {
		System.out.println("\n");
		System.out.println("Data Retur Sekses.. ");
    }
}
}