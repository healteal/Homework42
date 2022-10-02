package Task1;

public class General {
    public static void main(String[] args) {
        System.out.println(phoneWithStars("+375-29-158-21-11"));
        System.out.println(phoneWithStars("802911611101"));
    }

    static String phoneWithStars (String number) {
        return number.replaceAll("^(\\+?)(375|80)(-?)(29|33)(-?)(\\d{3})(-?)(\\d{2})(-?)(\\d{2})", "$1$2$3$4$5***$7$8$9$10");
    }
}
