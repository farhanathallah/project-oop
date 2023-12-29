class Produk {
    private String namaProduk;
    private double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public String informasiProduk() {
        return "Nama Produk : " + namaProduk +
                "\nHarga Produk : " + harga;
    }
}
