public class Letter {
    final static double larghezza= 8.5;
    final static double altezza= 11;
    
    public static double getDiagonale(){
        return Math.sqrt(Math.pow(larghezza, 2)+Math.pow(altezza, 2));
    }
    public static double getPerimetro(){
        return 2* altezza+2*larghezza;
    }

    
}