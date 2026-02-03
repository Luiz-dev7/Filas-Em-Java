package one.digitalinovation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {

      Fila minhaFila = new Fila();

      minhaFila.enqueue(new No("primeiro"));
      minhaFila.enqueue(new No("segundo"));
      minhaFila.enqueue(new No("terceiro"));
      minhaFila.enqueue(new No("quarto"));
      minhaFila.enqueue(new No("ultimo"));

      System.out.println(minhaFila);

      System.out.println(minhaFila.dequeue());

      System.out.println(minhaFila);

    }

}
