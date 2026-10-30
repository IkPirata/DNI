public class Main {
    public static void main(String[] args) {
        DNI dni = new DNI(18957690, 'E');
        System.out.println(dni);
        System.out.println(dni.isCorrect() ? "correcto" : "incorrecto");

        DNI dni1 = new DNI("18957690J");
        System.out.println(dni1);

        System.out.println(DNI.letterForDni(18957690));

        System.out.println(DNI.NifForDni(18957690));
    }
}
