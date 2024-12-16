public class Calculo {

    public static void main(String args[]) {
        operacoesAtribuicoes();
    }
    private static void operacoesAtribuicoes () {
        int numero1 = 9;
        int numero2 = 10;
        int numero3 = 8;
        int numero4 = 9;
        int numero5 = numero1 + numero2 + numero3 + numero4;
        int numero6 = 4;
        System.out.println(numero5);
        numero5 /= numero6;
        System.out.println(numero5);
    }
}
