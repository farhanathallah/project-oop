public class Main {
    public Main() {
    }
 
    public static void main(String[] args) {
      Customer customer1 = new Customer();
      customer1.namaCustomer = "Farhan";
      customer1.namaMotor = "Honda";
      customer1.jenisMotor = "Vario160";
      customer1.harga = "Rp 5.000.000";
      
      System.out.println("nama customer : "   + customer1.namaCustomer);
      System.out.println("nama motor : "   + customer1.namaMotor);
      System.out.println("jenis motor : "   + customer1.jenisMotor);
      System.out.println("harga : " +  customer1.harga);
 
      customer1.bayarCash();
      System.out.println();

      Tempatservice tempatservice1 = new Tempatservice();
      tempatservice1.namaMotor = "Yamaha";
      tempatservice1.jenisMotor = "Jupiter";
      tempatservice1.harga = "Rp 10.000.000";
      tempatservice1.yamahaservice = "PT.ciganitri";
      tempatservice1.alamatservice = "Sukabirus";

      System.out.println("nama motor : "   + tempatservice1.namaMotor);
      System.out.println("jenis motor : "   + tempatservice1.jenisMotor);
      System.out.println("harga : "   + tempatservice1.harga);
      System.out.println("yamaha service : " +  tempatservice1.yamahaservice);
      System.out.println("alamat service : " +  tempatservice1.alamatservice);
      
      tempatservice1.bayarCash();
   }
}