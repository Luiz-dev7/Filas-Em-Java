package one.digitalinovation;

public class Fila <T> {

    private No <T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) {
        No <T> novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if (this.isEmpty()) {
            return null;
        }

        No <T> primeiroNo = refNoEntradaFila;

        while (primeiroNo.getRefNo() != null) {
            primeiroNo = primeiroNo.getRefNo();
        }

        return (T) primeiroNo.getObject();
    }

    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        }

        No <T> primeiroNo = refNoEntradaFila;
        No <T> noAuxiliar = refNoEntradaFila;


        if (primeiroNo.getRefNo() == null) {
            refNoEntradaFila = null;
            return (T) primeiroNo;
        }

        while (primeiroNo.getRefNo() != null) {
            noAuxiliar = primeiroNo;
            primeiroNo = primeiroNo.getRefNo();
        }

        noAuxiliar.setRefNo(null);
        return (T) primeiroNo.getObject();
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (this.isEmpty()) {
            return "null";
        }

        while (noAuxiliar != null) {
            stringRetorno += "{No {objeto=" + noAuxiliar.getObject() + "}}---->";
            noAuxiliar = noAuxiliar.getRefNo();
        }

        stringRetorno += "null";
        return stringRetorno;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }
}
