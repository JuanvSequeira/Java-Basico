public class Usuarios {
  public static void main(String[] args) throws Exception {
    SmartTv smartTV = new SmartTv();

    System.out.println("Tv ligada ?" + smartTV.ligada);
    System.out.println("Volume atual ?" + smartTV.volume);
    System.out.println("Canal atual ?" + smartTV.canal);

    smartTV.ligar();
    System.out.println("Novo Status -> TV ligada ?" +" "+ smartTV.ligada);
    
    smartTV.desligar();
    System.out.println("Novo Status -> TV ligada ?" +" "+ smartTV.ligada);

    smartTV.aumentarVolume();
    System.out.println("Novo Status -> Volume atual ?" +" "+ smartTV.volume);

    smartTV.diminuirVolume();
    System.out.println("Novo Status -> Volume atual ?" +" "+ smartTV.volume);

    smartTV.mudarCanal(13);
    smartTV.aumentarCanal();
    System.out.println("Novo Status -> Canal atual" + " "+smartTV.canal);

    smartTV.diminuirCanal();
    System.out.println("Novo Status -> Canal atual" + " " +smartTV.canal);
  }  
}
