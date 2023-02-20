import com.sun.javafx.runtime.SystemProperties;

//membuat class array
class Motivasi {

    public String kata;
    Motivasi (String kata){
        this.kata = kata;
    }

    public String getMotivasi() {
        return kata;
    }
}
public class classArray {

    public static void main(String[] args){

        methodArray();

        //getclass Motivasi

        Motivasi[] gapai = new Motivasi[]{new Motivasi("selalu belajar"), new Motivasi("konsisten"),
        new Motivasi("Jangan pernah menyerah"), new Motivasi("jangan berpuas diri")};

        System.out.println("Jika ingin sukses maka lakukan ini! ");
        for(Motivasi capai:gapai){
            System.out.println(capai.getMotivasi().toLowerCase());
        }

        arrayInt();

        //getMethod MultiArray
        multidimensional();

        //penjumalahArray
        int[] angka1 = {4,5,6,7,8};
        penjumlahanArray(angka1);

        //memanggil method yang mengembalikan arry
        int[] angka2 = methodAray();

        for(int i = 0; i < angka2.length; i++){
            System.out.print(angka2[i]);
        }

        cloneArray();
    }

    public static void methodArray() {

        String[] arr;
        arr = new String[5];
        arr[0] = new String("Fajar");
        arr[1] = new String("Pikekah");
        arr[2] = new String("Tita");
        arr[3] = new String("Nurpiyana");
        arr[4] = new String("Aisyah");

        for(int i = 0; i < arr.length; i++) {

            System.out.println("index ke " + i + " : " + arr[i]+" \n");
        }
    }

    //Method arrayInt

    public static void arrayInt() {

        int[] arrayInteger;
        arrayInteger = new int[3];

        arrayInteger[0] = 1;
        arrayInteger[1] = 2;
        arrayInteger[2] = 3;

        for(int i = 0; i < arrayInteger.length; i++) {
            System.out.println("indek ke " + i + ": "+ arrayInteger[i]);
        }
    }

    //arrayMultidimensional
    public static void multidimensional(){

        int[][] multiarray = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int index1 = 0; index1 < multiarray.length; index1++){
            for(int index2 = 0; index2 < multiarray.length; index2++) {

                System.out.print(multiarray[index1][index2]);

            }
        }
    }

    //penjumlahan array
    public static void penjumlahanArray(int[] angka1) {

        int sum = 0;

        for(int i = 0; i < angka1.length; i++) {

            sum += angka1[i];

        }
        System.out.println("\n"+sum);
    }

    //method mengembalikan array
    public static int[] methodAray() {

        return new int[] {1,2,3};
    }

    //method clone array

    public static void cloneArray() {

        String[] nama = {"Fajar", "Pikekah", "Tita"};

        String[] nami = nama.clone();

        for(int i = 0; i < nami.length; i++) {
            System.out.print("\n"+ nami[i]);
        }
    }


}
