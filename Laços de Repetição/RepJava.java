public class RepJava {
  public static void main(String[] args) {
    //Numeros de 0 a 10
    int numero = 0;
    while (numero < 10) {
      numero++;
      System.out.println("O numero atual eh " + numero);
    }
    //Contagem Regressiva
    int contagem = 10;
    while (contagem > 0) { // Corrigido para contagem > 0
      System.out.println("Contagem regressiva: " + contagem);
      contagem--;
    }//numeros impares e Pares de 1 ao 20
    for (int i = 0;i<=20;i++){
      if(i%2 == 0)
      System.out.println("Todos os numeros pares "+i);
    }
    for (int impar = 0;impar<=20;impar++){
      if(impar %3 == 0 && impar  %2 !=0)
      System.out.println("Todos os numero impares "+impar );
    }//SOMATORIO
    int soma = 0;
    int contador = 1;
    while(contador <= 100){
      soma +=contador;
      contador++;
      System.out.println("Soma :"+soma);

    }
    System.out.println("Soma :"+soma);

  }
}