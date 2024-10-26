public abstract class Person {
    private String nama;
    private int usia;

    public Person(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public abstract void pekerjaan();

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
}
