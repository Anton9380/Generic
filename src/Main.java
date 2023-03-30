public class Main {
    public static void main(String[] args) {

        MagicBox<String> stringMagicBox = new MagicBox<>(4);
        stringMagicBox.add("1234");
        stringMagicBox.add("qwerty");
        stringMagicBox.add("someString");
        stringMagicBox.add("magicString");

        String pick = stringMagicBox.pick();
        System.out.println(pick);
    }
}