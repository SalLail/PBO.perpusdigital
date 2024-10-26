public class Dosen extends WargaKampus {
    public Dosen(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void pekerjaan() {
        System.out.println("Dosen");
    }
}

