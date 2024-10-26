public class Universitas {
    public static void main(String[] args) {
        Person person = new Mahasiswa("Alya Aulia Azzahra", 19);
        System.out.printf("Pekerjaan: ");
        person.pekerjaan();

        Person person2 = new Dosen("Abdul Rahman, S.T.", 35);
        System.out.printf("Pekerjaan: ");
        person2.pekerjaan();

        Person person3 = new Staff("Rudi Habibi", 27);
        System.out.printf("Pekerjaan: ");
        person3.pekerjaan();
    }

}