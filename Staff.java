public class Staff extends Person {
    public Staff(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void pekerjaan() {
        System.out.println("Staff");
    }
}

