public class Karyawan {

    //declare variable
    static String namaKaryawan;
    static float gaji;

    //declare set method
    public static void setKaryawan(String nama, float salary){

        namaKaryawan = nama;
        gaji = salary;
    }

    //declare get method
    public static void getKaryawan() {
        System.out.println("Nama Karyawan : " + namaKaryawan);
        System.out.println("Gaji Karyawan : " + gaji);
    }

    public static void main(String[] args) {
        Karyawan result = new Karyawan();
        result.setKaryawan("Fajar", 9000000);
        result.getKaryawan();
    }
}
