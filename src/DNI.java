import java.util.Locale;

public class DNI {
    private static final char[] LETRAS = {'T','R','W','A','G','M','Y','F','P',
            'D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    private int number;
    private char letra;

    public DNI(int number) {
        this.number = number;
        letra = LETRAS[number % 23];
    }
    public DNI(int number, char letra){
        this.letra = letra;
        char realLetter = LETRAS[number % 23];
        if (realLetter != letra){
            this.number = -number;
        } else {
            this.number = number;
        }
    }

    public DNI(String str){
        String strNumber = str.replaceAll("[^\\d.]", "");
        number = Integer.parseInt(strNumber);
        letra = str.toUpperCase().charAt(str.length() - 1);
        char realLetter = LETRAS[number % 23];
        if (realLetter != letra){
            number = -number;
        }
    }

    public boolean isCorrect(){
        return number >= 0;
    }

    public int getNumber() {
        return number;
    }

    public char getLetra() {
        return letra;
    }

    public void setNumber(int number) {
        this.number = number;
        char realLetter = LETRAS[number %23];
        if (realLetter != letra){
            this.number = -this.number;
        }
    }
    public static char letterForDni (int number){
        return LETRAS[number % 23];

    }
    public static String NifForDni(int number){
        return "" + number + "-" + letterForDni(number);
    }

    @Override
    public String toString() {
        return number + "-" + letra;
    }

}