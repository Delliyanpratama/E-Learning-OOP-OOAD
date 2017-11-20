public class Perabotan extends Barang {

	//public String nama_brg;
    //public String no_stok_brg;
    //public String jenis_brg;
    //public String suplier;
	//public String jumlah_brg;
	//public String harga_brg;
	
	public String konfirmasi;
	
	public void tambah_perabotan(){
		System.out.println("\n \n \n");
		System.out.println(">>>>>>> MASUKAN DATA BARANG PERABOTAN <<<<<<<\n");
		System.out.print("Masukan Nama Barang Perabotan : ");
		nama_brg = input.nextLine();
		System.out.print("Masukan No Stock Barang Perabotan Baru : ");
		no_stok_brg = input.nextLine();
		System.out.print("Masukan Jenis Barang Perabotan : ");
		jenis_brg = input.nextLine();
		System.out.print("Masukan Suplier Barang Perabotan : ");
		suplier = input.nextLine();
		System.out.print("Masukan Jumlah Barang Perabotan : ");
		jumlah_brg = input.nextLine();
		System.out.print("Masukan Harga Barang Perabotan : ");
		harga_brg = input.nextLine();	
    }
    public void ubah_perabotan(){
		System.out.println("\n\n\n");
		System.out.println(">>>>>>> MENGUBAH DATA BARANG PERABOTAN <<<<<<<\n");
		System.out.println("Nama Barang Perabotan Sebelumnya : "+nama_brg);
		System.out.print("Masukan Nama Barang Perabotan Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Nama Barang Perabotan Telah Diubah Menjadi : "+no_stok_brg);
		
		System.out.println("No Stock Perabotan Sebelumnya : "+no_stok_brg);
		System.out.print("Masukan No Stok Perabotan Baru : ");
		no_stok_brg = input.nextLine();
		System.out.print("No Stock Perabotan Telah Diubah Menjadi  : "+no_stok_brg);
		
		System.out.println("Jenis Barang Perabotan Sebelumnya : "+jenis_brg);
		System.out.print("Masukan Jenis Barang Perabotan Baru : ");
		jenis_brg = input.nextLine();
		System.out.print("Jenis Barang Perabotan Telah Diubah Menjadi : "+jenis_brg);
		
		System.out.println("Suplier Barang Perabotan Sebelumnya : "+suplier);
		System.out.print("Masukan Suplier Barang Perabotan Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Suplier Barang Perabotan Telah Diubah Menjadi : "+suplier);
		
		System.out.println("Jumlah Barang Perabotan Sebelumnya : "+jumlah_brg);
		System.out.print("Masukan Jumlah Barang Perabotan Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Jumlah Barang Perabotan Telah Diubah Menjadi : "+jumlah_brg);
		
		System.out.println("Harga Barang Perabotan Sebelumnya : "+harga_brg);
		System.out.print("Masukan Harga Barang Perabotan Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Harga Barang Perabotan Telah Diubah Menjadi : "+harga_brg);
		}
		
	public void hapus_perabotan(){
		System.out.println("\n\n\n");
		System.out.println(">>>>>>> HAPUS DATA BARANG PERABOTAN <<<<<<<\n");
		System.out.println("Nama Barang Perabotan Yang Akan Dihapus : "+nama_brg);
		System.out.println("No Stok Barang Perabotan Yang Akan Dihapus : "+no_stok_brg);
		System.out.println("Jenis Barang Perabotan Yang Akan Dihapus : "+jenis_brg);
		System.out.println("Suplier Barang Perabotan Yang Akan Dihapus : "+suplier);
		System.out.println("Jumlah Barang Perabotan Yang Akan Dihapus : "+jumlah_brg);
		System.out.println("Harga Barang Perabotan Yang Akan Dihapus : "+harga_brg);
		System.out.print("Yakin akan menghapus data ini (ya / tidak) ? " );
		konfirmasi2 = input.nextLine();
		if ("ya".equals(konfirmasi)) {
		nama_brg = "-";
		System.out.println("Barang Perabotan Telah di Hapus.. \nNama barang Perabotan : "+nama_brg);
		}
		}
}