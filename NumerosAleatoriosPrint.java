public class NumerosAleatorios {

  public static void main(String[] args) {
    final int LONGITUDNUMEROS = 30;
    final int MINIMO = 1;
    final int MAXIMO = 10;
    int[] numerosAleatorios = new int[LONGITUDNUMEROS];
    for (int i = 0; i < LONGITUDNUMEROS; i++) {
      numerosAleatorios[i] = (int)(Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);
      }
    for (int i = 0; i < LONGITUDNUMEROS; i++) {
      System.out.println("numerosAleatorios[" + i + "] = " + numerosAleatorios[i]);
    }
    int[] vecesRepetidas = new int[MAXIMO];
    for (int j = 0; j < MAXIMO; j++) {
      for (int k = 0; k < LONGITUDNUMEROS; k++) {
        if (numerosAleatorios[j] == k) {
          vecesRepetidas[j]++;
        }
      }
      System.out.print("El número " + (j + 1) + " se repite " + vecesRepetidas[j] + " veces." );
    }
    
  }

}
