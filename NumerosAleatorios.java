public class NumerosAleatorios {

  public static void main(String[] args) {
    final int LONGITUDNUMEROS = 20;
    final int MINIMO = 1;
    final int MAXIMO = 10;
    int[] numerosAleatorios = new int[LONGITUDNUMEROS];
    for (int i = 0; i < LONGITUDNUMEROS; i++) {
      numerosAleatorios[i] = (int)(Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);

  }
    
  }

}
