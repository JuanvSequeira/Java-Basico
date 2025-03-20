public class operadoresJava2 {
  
  public static void main(String[] args) {
    int numero = 5;
    numero = numero +2;
    numero++;
    System.out.println(numero);
    boolean variavel = true;
    System.out.println(!variavel);

    int a = 5;
    int b =6;
    int resultado = a==b ? 1 : 0;
    System.out.println(resultado);

    int numero1 = 10;
    int numero2 = 20;

    boolean simNao = numero1 == numero2;
    System.out.println("Número 1 é igual ao Número 2 ?" + simNao);

    
    simNao = numero1 != numero2;
    System.out.println("Número 1 é diferente ao Número 2 ?" + simNao);

    
    simNao = numero1 > numero2;
    System.out.println("Número 1 é Maior ao Número 2 ?" + simNao);

    
    simNao = numero1 < numero2;
    System.out.println("Número 1 é Menor ao Número 2 ?" +simNao);
  
    
    simNao = numero1 >= numero2;
    System.out.println("Número 1 é Maior igual ao Número 2 ?" +simNao);
  
  }

}
