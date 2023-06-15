public class UjianEnum {
    public enum Kendaraan{
        MOBIL,SEPEDA,BAJAJ,DELMAN
    }
    public static Kendaraan tebakJenisKendaraan(int rodaDepan,int rodaBelakang){
        if (rodaDepan==0&&rodaBelakang==2){
            System.out.println(Kendaraan.DELMAN);
        } else if (rodaDepan==1&&rodaBelakang==1){
            System.out.println(Kendaraan.SEPEDA);
        } else if (rodaDepan==1&&rodaBelakang==2){
            System.out.println(Kendaraan.BAJAJ);
        } else if (rodaDepan==2&&rodaBelakang==2){
            System.out.println(Kendaraan.MOBIL);
        }
        return Kendaraan.MOBIL;
    }
    public static void main(String[] args) {
        tebakJenisKendaraan(1,1);
    }
}
