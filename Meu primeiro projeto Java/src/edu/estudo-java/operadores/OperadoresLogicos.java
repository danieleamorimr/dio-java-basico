public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = true;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */

        if (condicao1 && (5 > 2)) {
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 && condicao2)
            System.out.print("as duas condições são verdadeiras");

        System.out.println("fim");

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.print("uma das condições é verdadeira");

    }
}
