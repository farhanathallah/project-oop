class Pelanggan {
    private String nama;
    private String nomorTelepon;

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String informasiPelanggan() {
        return "Nama : " + nama +
                "\nNomor Telepon : " + nomorTelepon;
    }
}