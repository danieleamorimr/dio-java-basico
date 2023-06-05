public class MinhaClasse {
    public static void main(String[] args) throws Exception {

        String primeiroNome = "Daniele";
        String segundoNome = "Amorim";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNomwe) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNomwe);

    }

} 


