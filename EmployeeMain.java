package employeemain;
import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("              INFORMASI PEGAWAI");
        System.out.println("=================================================");
        System.out.print("Masukan Nama Anda         : ");
        String nama=in.next();
        System.out.print("Masukan ID Anda           : ");
        String id=in.next();
        System.out.print("Masukan Jabatan Anda      : ");
        String jabatan=in.next();
        System.out.print("Anda Sudah Nikah?(y/t)    : ");
        String nikah=in.next();
        System.out.print("Masukan Tahun Anda Masuk  : ");
        int tahun=in.nextInt();
        System.out.print("Masukan Jumlah Anak       : ");
        int anak=in.nextInt();
        if(jabatan.equalsIgnoreCase("Manager")){
            Employee a=new Employee(nama,id,jabatan,nikah,anak,tahun);
            Manager b=new Manager(nama,id,jabatan,nikah,anak,tahun);
            a.Bonus();
            a.Tunjangan();
            a.TunjanganAnak(anak);
            a.TunjanganIstri();
            a.getTotal();
            b.TunjanganJabatan();
        }else if(jabatan.equalsIgnoreCase("Pegawai Tetap")){
            Employee c=new Employee(nama,id,jabatan,nikah,anak,tahun);
            c.Bonus();
            c.Tunjangan();
            c.TunjanganAnak(00);
            c.TunjanganIstri();
            c.getTotal();
        }else{
            Employee d=new Employee(nama,id,jabatan,nikah,anak,tahun);
            PTT e=new PTT(nama,id,jabatan,nikah,anak,tahun);
            d.Bonus();
            d.Tunjangan();
            d.TunjanganAnak(00);
            d.TunjanganIstri();
            d.getTotal();
            e.GajiLembur();
        }
    }
    
}
