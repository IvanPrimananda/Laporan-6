package employeemain;
public class Manager extends Employee{
    private int tunjanganJabatan;
    private String nama,id,jabatan;
    private int anak,masa,masuk;
    public Manager(String n, String id, String j, String i,int a,int m){
        super(n,id,j,i,a,m);
    }
    public void TunjanganJabatan(){
        tunjanganJabatan=(10*getTotal())/100;
        System.out.println("Anda Mendapat Tunjangan Jabatan             = Rp. "+tunjanganJabatan);
    }
}
