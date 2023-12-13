public class Main {

    public static void main(String[] args) {

        int[] numeri = {5, 6, 7, 8, 1};

        stampaDivisionePer0(numeri, 3);

    }

    public static void stampaDivisionePer0(int[] arrayDiNumeri, int indice) {

        try {

            System.out.println(arrayDiNumeri[indice] / 0);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Catturata ArrayIndexOutOfBoundException, messaggio: '" + e + "'");

        } catch (ArithmeticException e) {

            System.out.println("Catturata ArithmeticException, messaggio: '" + e + "'");

        } catch (Exception e) {

            System.out.println("Catturata Exception, messaggio: '" + e + "'");

        } finally {
            System.out.println("Gestione errori terminata");
        }
    }

}
