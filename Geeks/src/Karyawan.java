
class DataKaryawan {

    public String Nik;
    public String Divisi;
    public String Jabatan;

    DataKaryawan(String noNik, String Div, String Jabatan){
        this.Nik = noNik;
        this.Divisi = Div;
        this.Jabatan = Jabatan;
    }

    public String getNik() {
        return Nik;
    }

    public String getDivisi() {
        return Divisi;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public String toString() {

        return ("Nik Karyawan " + this.getNik() + "\n" + "Divisi Karyawan : " + this.getDivisi() + "\n"
        + "Jabatan Karyawan : " + this.getJabatan());
    }

}

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

        //get class DataKaryawan
        DataKaryawan datakaryawan = new DataKaryawan("018097", "IT Middleware", "Section Head");
        String data = datakaryawan.toString();
        System.out.println(data);
    }

}
