import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        TokoElektronik tokoElektronik = new TokoElektronik("ElectroMart", "Jl. Raya Elektronik No. 123");

        int choice;
        System.out.println("Selamat Datang di Toko " + tokoElektronik.namaToko + "!!!");
        System.out.print("\nMasukkan Nama Anda : ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan Nomor Telepon Anda : ");
        String nomorTelepon = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(namaPelanggan, nomorTelepon);
        System.out.println("\nHalo " + namaPelanggan + " Selamat Berbelanja!!!");

        do {
            System.out.println("\n===== Menu Toko Elektronik =====");
            System.out.println("1. Buat Pesanan");
            System.out.println("2. Hapus Pesanan");
            System.out.println("3. Tampilkan Seluruh Pesanan");
            System.out.println("4. Keluar Program");
            System.out.print("Pilih menu (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                order.tampilkanDaftarProduk();
                
                System.out.print("\nMasukkan nomor produk yang ingin dibeli: ");
                int nomorProduk = scanner.nextInt();
                
                Produk produkDibeli = order.getProdukByNomor(nomorProduk);
                
                if (produkDibeli != null) {
                    order.tambahPesanan(produkDibeli);
                    System.out.println("\nProduk berhasil ditambahkan ke dalam pesanan.");
                } else {
                    System.out.println("\nNomor produk tidak valid.");
                }
                break;

                case 2:
                    order.tampilkanSeluruhPesanan();
                    System.out.print("\nMasukkan nomor produk yang ingin dihapus: ");
                    int nomorProdukHapus = scanner.nextInt();
                    order.hapusProduk(nomorProdukHapus);
                    break;

                case 3:
                    order.tampilkanSeluruhPesanan();
                    break;

                case 4:
                    order.informasiOrder(pelanggan, tokoElektronik);
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih menu 1-4.");
            }
        } while (choice != 4);
        scanner.close();
    }
}