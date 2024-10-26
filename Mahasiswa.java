public class Mahasiswa extends WargaKampus {
    public Mahasiswa(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void pekerjaan() {
        System.out.println("Mahasiswa");
    }
}
