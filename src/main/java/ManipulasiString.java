public class ManipulasiString {
    public static boolean bolakBalikOk(String kata){
        String balik="";
        for (int i=kata.length()-1;i>=0;i--){
            balik+=kata.charAt(i);
        }
        if (kata.equalsIgnoreCase(balik)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String kata = "Kasurrusak";
        String kata2 = "Sedotwc";
        System.out.println(bolakBalikOk(kata2));
    }
}
