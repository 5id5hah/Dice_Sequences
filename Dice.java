public class Dice {
    public static void main(String[] args) {
        Dice("", 3);
    }
    public static void Dice(String p, int up ){
        if (up == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= up; i++) {
            Dice(p+i, up-i);
        }
    }
}
