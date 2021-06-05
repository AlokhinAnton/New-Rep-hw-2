public class NameEncoderDecoder {
    public static void main(String[] args) {
        NameEncoderDecoder encoderDecoder = new NameEncoderDecoder();
        String nameCode = encoderDecoder.encode("Crab");
        String namedeCode = encoderDecoder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("names.getNameCode(\"Crab\") = " + nameCode);
        System.out.println("names.getNamedeCode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + namedeCode);
    }

    public String encode(String name) {
        return "NOTFORYOU" + name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5") + "YESNOTFORYOU";

    }

    public String decode(String name) {
        return name.trim().replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a").trim()
                .replaceFirst("(NOTFORYOU)", " ")
                .replaceFirst("(YESNOTFORYOU)", " ").trim();
    }
}
