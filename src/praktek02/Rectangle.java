package praktek02;
public class Rectangle {
    double panjang;
    double lebar;
    double tinggi;
    
    void cetakInfo(){
        System.out.println("==================");
        System.out.println("panjang = "+panjang);
        System.out.println("lebar   =   "+lebar);
        System.out.println("tinggi  =  "+tinggi);
        System.out.println("==================");
    }
    
    double hitungVolume(){
        double volume;
        volume=panjang*lebar*tinggi;
        return volume;
    }
    
}
