public class Main {
    public static void main(String[] args) {

        List<Mahasiswa> MahasiswaList = new ArrayList<>();
        MahasiswaList.add(new Mahasiswa(1, "Patrick", "TIF1", 9));
        MahasiswaList.add(new Mahasiswa(2, "Spongebob", "TIF2", 4));
        MahasiswaList.add(new Mahasiswa(3, "Sandy", "TIF3", 6));
        MahasiswaList.add(new Mahasiswa(4, "Plankton", "TIF4", 5));
        MahasiswaList.add(new Mahasiswa(5, "Squidward", "TIF5", 3));

        MahasiswaList.set(4, new Mahasiswa(6, "Lisa", "TIF6", 12));

        MahasiswaList.add(3, new Mahasiswa(8, "Billie", "TIF7", 11));

        System.out.println(MahasiswaList.contains(new Mahasiswa(1, "Rocky", "TIF8", 10));
        System.out.println(MahasiswaList.indexOf(new Mahasiswa(9, "Gerung", "TIF9",13));

        MahasiswaList.remove(2);
        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa));

    }
}