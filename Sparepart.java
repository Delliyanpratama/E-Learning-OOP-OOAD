public class Sparepart extends Barang {

	//public String nama_brg;
    //public String no_stok_brg;
    //public String jenis_brg;
    //public String suplier;
	//public String jumlah_brg;
	//public String harga_brg;
	
	public String konfirmasi;
	
	public void tambah_sparepart(){
		System.out.println("\n \n \n");
		System.out.println(">>>>>>> MASUKAN DATA BARANG SPAREPART <<<<<<<\n");
		System.out.print("Masukan Nama Barang Sparepart : ");
		nama_brg = input.nextLine();
		System.out.print("Masukan No Stock Barang Sparepart Baru : ");
		no_stok_brg = input.nextLine();
		System.out.print("Masukan Jenis Barang Sparepart : ");
		jenis_brg = input.nextLine();
		System.out.print("Masukan Suplier Barang Sparepart : ");
		suplier = input.nextLine();
		System.out.print("Masukan Jumlah Barang Sparepart : ");
		jumlah_brg = input.nextLine();
		System.out.print("Masukan Harga Barang Sparepart : ");
		harga_brg = input.nextLine();	
    }
    public void ubah_sparepart(){
		System.out.println("\n\n\n");
		System.out.println(">>>>>>> MENGUBAH DATA BARANG SPAREPART <<<<<<<\n");
		System.out.println("Nama Barang Sparepart Sebelumnya : "+nama_brg);
		System.out.print("Masukan Nama Barang Sparepart Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Nama Barang Sparepart Telah Diubah Menjadi : "+no_stok_brg);
		
		System.out.println("No Stock Sparepart Sebelumnya : "+no_stok_brg);
		System.out.print("Masukan No Stok Sparepart Baru : ");
		no_stok_brg = input.nextLine();
		System.out.print("No Stock Sparepart Telah Diubah Menjadi  : "+no_stok_brg);
		
		System.out.println("Jenis Barang Sparepart Sebelumnya : "+jenis_brg);
		System.out.print("Masukan Jenis Barang Sparepart Baru : ");
		jenis_brg = input.nextLine();
		System.out.print("Jenis Barang Sparepart Telah Diubah Menjadi : "+jenis_brg);
		
		System.out.println("Suplier Barang Sparepart Sebelumnya : "+suplier);
		System.out.print("Masukan Suplier Barang Sparepart Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Suplier Barang Sparepart Telah Diubah Menjadi : "+suplier);
		
		System.out.println("Jumlah Barang Sparepart Sebelumnya : "+jumlah_brg);
		System.out.print("Masukan Jumlah Barang Sparepart Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Jumlah Barang Sparepart Telah Diubah Menjadi : "+jumlah_brg);
		
		System.out.println("Harga Barang Sparepart Sebelumnya : "+harga_brg);
		System.out.print("Masukan Harga Barang Sparepart Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Harga Barang Sparepart Telah Diubah Menjadi : "+harga_brg);
		}
		
	public void hapus_sparepart(){
		System.out.println("\n\n\n");
		System.out.println(">>>>>>> HAPUS DATA BARANG SPAREPART <<<<<<<\n");
		System.out.println("Nama Barang Sparepart Yang Akan Dihapus : "+nama_brg);
		System.out.println("No Stok Barang Sparepart Yang Akan Dihapus : "+no_stok_brg);
		System.out.println("Jenis Barang Sparepart Yang Akan Dihapus : "+jenis_brg);
		System.out.println("Suplier Barang Sparepart Yang Akan Dihapus : "+suplier);
		System.out.println("Jumlah Barang Sparepart Yang Akan Dihapus : "+jumlah_brg);
		System.out.println("Harga Barang Sparepart Yang Akan Dihapus : "+harga_brg);
		System.out.print("Yakin akan menghapus data ini (ya / tidak) ? " );
		konfirmasi2 = input.nextLine();
		if ("ya".equals(konfirmasi)) {
		nama_brg = "-";
		System.out.println("Barang Sparepart Telah di Hapus.. \nNama barang Sparepart : "+nama_brg);
		}
	}
}
		