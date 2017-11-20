public class Elektronik extends Barang {

	//public String nama_brg;
    //public String no_stok_brg;
    //public String jenis_brg;
    //public String suplier;
	//public String jumlah_brg;
	//public String harga_brg;
	
	public String konfirmasi;
	
	public void tambah_elektronik(){
		System.out.println("\n \n \n");
		System.out.println(">>>>>>> MASUKAN DATA BARANG ELEKTRONIK <<<<<<<\n");
		System.out.print("Masukan Nama Barang Elektrinik : ");
		nama_brg = input.nextLine();
		System.out.print("Masukan No Stock Barang Baru Elektronik : ");
		no_stok_brg = input.nextLine();
		System.out.print("Masukan Jenis Barang Elektronik : ");
		jenis_brg = input.nextLine();
		System.out.print("Masukan Suplier Barang Elektronik : ");
		suplier = input.nextLine();
		System.out.print("Masukan Jumlah Barang Elektronik : ");
		jumlah_brg = input.nextLine();
		System.out.print("Masukan Harga Barang Elektronik : ");
		harga_brg = input.nextLine();	
    }
    public void ubah_elektronik(){
		System.out.println("\n\n\n");
		System.out.println(">>>>>>> MENGUBAH DATA BARANG ELEKTRONIK <<<<<<<\n");
		System.out.println("Nama Barang Elektronik Sebelumnya : "+nama_brg);
		System.out.print("Masukan Nama Barang Elektronik Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Nama Barang Elektronik Telah Diubah Menjadi : "+no_stok_brg);
		
		System.out.println("No Stock Elektronik Sebelumnya : "+no_stok_brg);
		System.out.print("Masukan No Stok Elektronik Baru : ");
		no_stok_brg = input.nextLine();
		System.out.print("No Stock Elektronik Telah Diubah Menjadi  : "+no_stok_brg);
		
		System.out.println("Jenis Barang Elektronik Sebelumnya : "+jenis_brg);
		System.out.print("Masukan Jenis Barang Elektronik Baru : ");
		jenis_brg = input.nextLine();
		System.out.print("Jenis Barang Elektronik Telah Diubah Menjadi : "+jenis_brg);
		
		System.out.println("Suplier Barang Elektronik Sebelumnya : "+suplier);
		System.out.print("Masukan Suplier Barang Elektronik Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Suplier Barang Elektronik Telah Diubah Menjadi : "+suplier);
		
		System.out.println("Jumlah Barang Elektronik Sebelumnya : "+jumlah_brg);
		System.out.print("Masukan Jumlah Barang Elektronik Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Jumlah Barang Elektronik Telah Diubah Menjadi : "+jumlah_brg);
		
		System.out.println("Harga Barang Elektronik Sebelumnya : "+harga_brg);
		System.out.print("Masukan Harga Barang Elektronik Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Harga Barang Elektronik Telah Diubah Menjadi : "+harga_brg);
		}
		
	public void hapus_elektronik(){
		System.out.println("\n\n\n");
		System.out.println(">>>>>>> HAPUS DATA BARANG ELEKTRONIK <<<<<<<\n");
		System.out.println("Nama Barang Elektronik Yang Akan Dihapus : "+nama_brg);
		System.out.println("No Stok Barang Elektronik Yang Akan Dihapus : "+no_stok_brg);
		System.out.println("Jenis Barang Elektronik Yang Akan Dihapus : "+jenis_brg);
		System.out.println("Suplier Barang Elektronik Yang Akan Dihapus : "+suplier);
		System.out.println("Jumlah Barang Elektronik Yang Akan Dihapus : "+jumlah_brg);
		System.out.println("Harga Barang Elektronik Yang Akan Dihapus : "+harga_brg);
		System.out.print("Yakin akan menghapus data ini (ya / tidak) ? " );
		konfirmasi2 = input.nextLine();
		if ("ya".equals(konfirmasi)) {
		nama_brg = "-";
		System.out.println("Barang Elektronik Telah di Hapus.. \nNama barang Elektronik : "+nama_brg);
		}
	}
}
		