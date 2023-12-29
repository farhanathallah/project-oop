class TokoElektronik {
    protected String namaToko;
    protected String alamatToko;

    public TokoElektronik(String namaToko, String alamatToko) {
        this.namaToko = namaToko;
        this.alamatToko = alamatToko;
    }

    public String informasiToko() {
        return "Nama Toko : " + namaToko +
                "\nAlamat Toko : " + alamatToko;
    }
}