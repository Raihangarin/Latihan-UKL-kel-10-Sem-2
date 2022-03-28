/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl2;

/**
 *
 * @author ASUS
 */
public class TokoSaya {
    public static void main(String[] args) {
        Member member = new Member();
        Karyawan karyawan = new Karyawan();
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
        transaksi.prosesTransaksi(member, transaksi, barang);
        laporan.laporan(transaksi, barang);
        laporan.laporan(barang);
        laporan.laporan(member);
    }
}
