public class ErrorHandler {

    public void stampaDivPer0AtIndex(int[] arrayDiNumeri, int indice) {

        try {

            System.out.println(arrayDiNumeri[indice] / 0);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Catturata ArrayIndexOutOfBoundException, messaggio: '" + e + "'");

        } catch (ArithmeticException e) {

            System.out.println("Catturata ArithmeticException, messaggio: '" + e + "'");

        }
    }

}
