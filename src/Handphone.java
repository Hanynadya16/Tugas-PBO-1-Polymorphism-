public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan + ": " + pesan);
    }

    // Overload untuk mengirim pesan ke dua nomor tujuan
    public void kirimPesan(String nomorTujuan, String nomorTujuan2, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan + " dan " + nomorTujuan2 + ": " + pesan);
    }

    // Overload untuk mengirim pesan ke beberapa nomor sekaligus (array)
    public void kirimPesan(String[] daftarNomor, String pesan) {
        for (String nomor : daftarNomor) {
            kirimPesan(nomor, pesan); // Panggil metode overload dengan satu nomor
        }
    }

    // Method telepon ditambahkan
    public void telepon(String nomor) {
        System.out.println("Melakukan panggilan ke " + nomor + " menggunakan " + merk + " " + model);
    }
}

