package one.digitalinovation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {

      Fila <String> minhaFila = new Fila<>();

      minhaFila.enqueue("Primeiro");
      minhaFila.enqueue("segundo");
      minhaFila.enqueue("terceiro");
      minhaFila.enqueue("quarto");


      System.out.println(minhaFila);

      System.out.println(minhaFila.dequeue());

      System.out.println(minhaFila);

    }

}
