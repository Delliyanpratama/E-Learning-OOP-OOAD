//package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		String menu, menu2, elt, spr, prb, lapor;
		
		System.out.println("Menu Utama : ");
		System.out.println("\t - Laporan");
		System.out.println("\t - Admin");
		System.out.println("\t - Transaksi");
		System.out.println("\t - Barang");
		System.out.print("\nSilahkan Pilih Menu Yang Akan Ditampilkan : ");
		menu = input.nextLine();
		
		if("Laporan".equals(menu)) {
			Laporan lap = new Laporan();
			lap.buat_lap();
			System.out.print("\nKelola Laporan : (ubah / hapus / cetak) ?");
			lapor = input.nextLine();
			if ("ubah".equals(lapor)) {
			lap.ubah_lap();
			} else if ("hapus".equals(lapor)) {
			lap.hapus_lap();
			} else if ("cetak".equals(lapor)) {
			lap.cetak();
			}
			}			
			
			
		else if ("Barang".equals(menu)) {
			System.out.println("Menu Barang : ");
			System.out.println("\t - Elektronik");
			System.out.println("\t - Sparepart");
			System.out.println("\t - Perabotan");
			System.out.print("\nSilahkan Pilih Menu Yang Akan Ditampilkan : ");
			menu2 = input.nextLine();
			if("Elektronik".equals(menu2)) {
				Elektronik TR = new Elektronik();	
				TR.tambah_elektronik();
				System.out.print("\nKelola Elektronik : (ubah / hapus / jual / retur) ?");
				elt = input.nextLine();
				if ("ubah".equals(elt)) {
				TR.ubah_elektronik();
				} else if ("hapus".equals(elt)) {
				TR.hapus_elektronik();
				} else if ("jual".equals(elt)) {
				TR.jual_brg();
				} else if ("retur".equals(elt)) {
				TR.retur_brg();
			}
			}
			
			else if("Sparepart".equals(menu2)) {
				Sparepart SP = new Sparepart();	
				SP.tambah_sparepart();
				System.out.print("\nKelola Sparepart : (ubah / hapus / jual / retur) ?");
				spr = input.nextLine();
				if ("ubah".equals(spr)) {
				SP.ubah_sparepart();
				} else if ("hapus".equals(spr)) {
			SP.hapus_sparepart();
			} else if ("jual".equals(spr)) {
			SP.jual_brg();
			} else if ("retur".equals(spr)) {
			SP.retur_brg();
			}
			}
			
			else if("Perabotan".equals(menu2)) {
				Perabotan PR = new Perabotan();	
				PR.tambah_perabotan();
				System.out.print("\nKelola Perabotan : (ubah / hapus / jual / retur) ?");
				prb = input.nextLine();
				if ("ubah".equals(prb)) {
				PR.ubah_perabotan();
				} else if ("hapus".equals(prb)) {
				PR.hapus_perabotan();
				} else if ("jual".equals(prb)) {
				PR.jual_brg();
				} else if ("retur".equals(prb)) {
				PR.retur_brg();
				}
				}
				}
			
			
		else if ("Transaksi".equals(menu)) {
			Transaksi Trans = new Transaksi();
			Trans.membuat_transaksi();
			}
		
		else if ("Admin".equals(menu)) {
			Admin ADM = new Admin();
			ADM.menginput_admin();
			ADM.menampilkan_data_admin();
		}
		}
		
		
    }
    
	
