package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 62000;
        double uangDiDompet = 43000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang Kurangnya, Kurangi Jajan Anda");
        }else{
            System.out.println("Uangnya cukup, Selamat Menikmati");
        }
    }
}
