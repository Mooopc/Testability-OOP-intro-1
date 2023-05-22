public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 1_021;
        int miles = service.calculate(price); //Должно получиться 51
        System.out.println(miles);
    }
}