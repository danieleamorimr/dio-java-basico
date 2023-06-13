
public class OperadoresUnarios {
    static public void main (String[]args) {
         //classe Operadores.java
int numero = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++;
System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
System.out.println(numero ++);// ops algo de errado não está certo

System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
System.out.println(++ numero);

numero --;
System.out.println(numero);

System.out.println(numero --);
System.out.println(-- numero);

boolean variavel = true;

variavel = !true;

System.out.println(variavel);

    }

  
}
