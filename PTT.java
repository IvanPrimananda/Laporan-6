package employeemain;
import java.util.Scanner;
public class PTT extends Employee {
    private static final int tambahanGajiLembur=1000;
    private int jam,gajiLembur;
    private String nama,id,jabatan;
    private int anak,masa,masuk;
    public PTT(String n, String id, String j, String i,int a,int m){
        super(n,id,j,i,a,m);
    }
    public void GajiLembur(){
        Scanner in=new Scanner(System.in);
        System.out.print("Masukan Jumlah Jam Lembur         : ");
        jam=in.nextInt();
        if(jam>10){
            gajiLembur=(jam*tambahanGajiLembur)+getTotal();
            System.out.println("Total Gaji Anda karena Lembur           = Rp. "+gajiLembur);
        }else{
            gajiLembur=0;
            System.out.println("Total Gaji Anda                         = Rp. "+gajiLembur);
        }
    }
}
