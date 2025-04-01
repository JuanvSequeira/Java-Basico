import java.util.Scanner;

public class RepJava2 {
  int num;

  public static void main(String[] args) {
    RepJava2 Fat = new RepJava2();
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um numero para fatorial: ");
    Fat.num = scan.nextInt();

    int fat = 1;
    for (int i = 1;i <= Fat.num; i++) { 
      fat *= i; 
    }

    System.out.println("O fatorial eh: " + fat);
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    System.out.println("Digite um numero que você queira vê a tabuada :");
    int numero,total = 0;
    numero = scan.nextInt();

    for(int i = 1;i<=10;i++){
      total = numero * i;
      System.out.println("R : "+total +"="+numero +"x" +i );
    
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Quantos termos você quer que apareça na sequencia de Fibonnaci: ");
    int numero;
    numero = scan.nextInt();
    int a = 0; int b = 1;int c =0;
    
    System.out.println(a+","+b);
    
    for(int i = 2;i<numero;i++){
      c =a+b;
      System.out.println(","+c);
      a = b;
      b = c;
      
    }
  }   
    
  public static void main(String[] args) {
    
  
   Scanner scanner = new Scanner(System.in);
   System.out.print("Digite um número: ");
   int num = scanner.nextInt();
    boolean primo = true;
    int divisor = 2;

    while (divisor <= num / 2 && primo) {
      if (num % divisor == 0) {
        primo = false;
    }
      divisor++;
    }

    if (primo && num > 1) {
      System.out.println(num + " é primo");
    } else {
    System.out.println(num + " não é primo");
  }
 }
  public static void main(String[] args) {
    int linhas = 1;
    while (linhas <= 5) {
      int asteriscos = 1;
      while (asteriscos <= linhas) {
          System.out.print("*");
         asteriscos++;
      }
      System.out.println();
      linhas++;
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número decimal: ");
    int decimal = scanner.nextInt();
    String binario = "";

    while (decimal > 0) {
    binario = (decimal % 2) + binario;
    decimal /= 2;
    }
    System.out.println("Binário: " + binario);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = -1;

    while (numero <= 0) {
      System.out.print("Digite um número positivo: ");
      numero = scanner.nextInt();
      if (numero <= 0) {
          System.out.println("Número inválido! Tente novamente.");
      }
    }

    System.out.println("Obrigado! Você digitou: " + numero);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao = -1;

   while (opcao != 0) {
      System.out.println("1 - Opção 1");
      System.out.println("2 - Opção 2");
      System.out.println("3 - Opção 3");
      System.out.println("0 - Sair");
      System.out.print("Escolha: ");
      opcao = scanner.nextInt();
    
      if (opcao == 1) {
         System.out.println("Opção 1 selecionada");
      } else if (opcao == 2) {
          System.out.println("Opção 2 selecionada");
      } else if (opcao == 3) {
          System.out.println("Opção 3 selecionada");
      }  else if (opcao != 0) {
          System.out.println("Opção inválida!");
      }
    }
    System.out.println("Saindo...");
  }

}
