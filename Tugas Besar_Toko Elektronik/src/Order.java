import java.util.ArrayList;

class Order {
    private ArrayList<Produk> produkList;
    private ArrayList<Produk> pesananList;

    public Order() {
        produkList = new ArrayList<>();
        tambahProduk(new Produk("TV", 10000));
        tambahProduk(new Produk("Laptop", 12000));
        tambahProduk(new Produk("Iphone", 5000));
        pesananList = new ArrayList<>();
    }

    public Produk getProdukByNomor(int nomorProduk) {
        if (nomorProduk > 0 && nomorProduk <= produkList.size()) {
            return produkList.get(nomorProduk - 1);
        } else {
            return null;
        }
    }

    public void tampilkanDaftarProduk() {
        if (produkList != null && produkList.size() > 0) {
            System.out.println("\n===== Daftar Produk dan Harga =====");
            System.out.println("No\tNama Produk\tHarga");
            for (int i = 0; i < produkList.size(); i++) {
                System.out.println((i + 1) + "\t" + produkList.get(i).getNamaProduk() + "\t\t" + "Rp" + produkList.get(i).getHarga());
            }
        } else {
            System.out.println("\nBelum ada produk yang dimasukkan ke dalam pesanan.\n");
        }
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public void tambahPesanan(Produk produk) {
        pesananList.add(produk);
    }

    public void hapusProduk(int nomorProduk) {
        if (nomorProduk > 0 && nomorProduk <= pesananList.size()) {
            pesananList.remove(nomorProduk - 1);
            System.out.println("\nProduk berhasil dihapus dari pesanan.\n");
        } else {
            System.out.println("\nNomor produk tidak valid.\n");
        }
    }

    public void tampilkanSeluruhPesanan() {
        if (pesananList != null && pesananList.size() > 0) {
            System.out.println("\n===== Seluruh Pesanan Anda =====");
            System.out.println("No\tNama Produk\t\tHarga");
            for (int i = 0; i < pesananList.size(); i++) {
                System.out.println((i + 1) + "\t" + pesananList.get(i).getNamaProduk() + "\t\t\t" + "Rp" + pesananList.get(i).getHarga());
            }
        } else {
            System.out.println("\nAnda belum memesan produk.\n");
        }
    }

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (Produk produk : pesananList) {
            totalHarga += produk.getHarga();
        }
        return totalHarga;
    }

    public void informasiOrder(Pelanggan pelanggan, TokoElektronik tokoElektronik) {
        System.out.println("\n===== Informasi Pesanan =====\n");
        System.out.println("Pelanggan: " + pelanggan.informasiPelanggan());
    
        System.out.println("\nProduk dalam Pesanan:");
        for (int i = 0; i < pesananList.size(); i++) {
            Produk produk = pesananList.get(i);
            System.out.println(((i + 1)) + ".\t" + produk.getNamaProduk() + "\t\t" + produk.getHarga());
        }
    
        double totalHarga = hitungTotalHarga();
        System.out.println("\nTotal Harga Pesanan: " + totalHarga);
    
        System.out.println("\nInformasi Toko:");
        System.out.println(tokoElektronik.informasiToko());

        System.out.println("\n===== Terimakasih Telah Berbelanja =====\n");
    }
}