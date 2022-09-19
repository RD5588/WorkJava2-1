public class main {
    public static void main(String[] args) {
        int check = 500;
        int added = 2000;

        int bonus;
        if (added > 1000) {
            bonus = added / 100 * 1;
        } else {
            bonus = 0;
        }
        System.out.println(check + bonus + added + " На вашем счете");
        System.out.println(bonus + " Накопленных бонусов");
    }
}
