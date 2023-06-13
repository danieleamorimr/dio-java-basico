public class OperadoresRelacionais {

       static public void main (String[]args) {

        String nome1 = "JAVA";
        String nome2 = "JAVA";  

             System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
            System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

            System.out.println(nome3 == nome4); //true
        
         //equals na parada quando se tratar de objetos
            System.out.println(nome1.equals(nome2)); //??
            System.out.println(nome2.equals(nome3)); //??
            System.out.println(nome3.equals(nome4)); //??
        
        int numero1 = 1;
        int numero2 = 2;

            boolean simNao = numero1 == numero2;
        
        if(numero1 > numero2)
	        System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
	        System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
	        System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
	        System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
	        System.out.print("Numero 1 é diferente de numero 2");

       }


}
