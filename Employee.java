package employeemain;
public class Employee {
    private String nama,id,jabatan,istri;
    private int anak,masa,masuk,total;
    private static final int tahun=2016;
    private static final int gaji=5000;
    private int bonus,tunjangan,tunjanganAnak,tunjanganIstri;
    public Employee(String n, String id, String j, String i,int a,int m){
        nama=n;this.id=id;jabatan=j;istri=i;anak=a;masuk=m;
    }
    public void Bonus(){
        masa=tahun-masuk;
        if(masa<=5){
            bonus=0;
            System.out.println("Anda Tidak Mendapat Bonus");
        }else if(masa>=6&&masa<=10){
            bonus=(5*gaji*masa)/100;
            System.out.println("Anda Mendapat Bonus                 = Rp. "+bonus);
        }else{
            bonus=(10*gaji*masa)/100;
            System.out.println("Anda Mendapat Bonus                 = Rp. "+bonus);
        }
    }
    public void Tunjangan(){
        masa=tahun-masuk;
        if(masa<=5){
            tunjangan=0;
            System.out.println("Anda Tidak Mendapat Tunjangan");
        }else if(masa>=6&&masa<=10){
            tunjangan=0;
            System.out.println("Anda Tidak Mendapat Tunjangan");
        }else{
            tunjangan=(10*gaji*masa)/100;
            System.out.println("Anda Mendapat Tunjangan             = Rp. "+tunjangan);
        }
    }
    public void TunjanganIstri(){
        if(istri.equalsIgnoreCase("y")){
            tunjanganIstri=(10*gaji)/100;
            System.out.println("Anda Mendapat Tunjangan Istri       = Rp. "+tunjanganIstri);
        }else{
            tunjanganIstri=0;
            System.out.println("Anda Tidak Mendapat Tunjangan Istri");
        }
    }
    public void TunjanganAnak(int a){
        if(a<=3){
            tunjanganAnak=(15*a*gaji)/100;
            System.out.println("Anda Mendapat Tunjangan Anak        = Rp. "+tunjanganAnak);
        }else{
            tunjanganAnak=(15*3*gaji)/100;
            System.out.println("Anda Mendapat Tunjangan Anak        = Rp. "+tunjanganAnak);
        }
    }
    public int getTotal(){
        total=gaji+bonus+tunjangan+tunjanganIstri+tunjanganAnak;
        System.out.println("Total Gaji Anda Adalah                  = Rp. "+total);
        return total;
    }
}
