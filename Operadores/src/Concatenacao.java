public class Concatenacao {

    public static void main(String[] args) {
        int numero = 5;

        numero = -numero *-1;
        System.out.println(-numero);
        System.out.println(numero);
        System.out.println(numero);


        String nomeCompleto = "LINGUAGEM" + " JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

    }
}
