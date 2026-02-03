package one.digitalinovation;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(Object obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public Object first() {
        if (this.isEmpty()) {
            return null;
        }

        No primeiroNo = refNoEntradaFila;

        while (primeiroNo.getRefNo() != null) {
            primeiroNo = primeiroNo.getRefNo();
        }

        return primeiroNo.getObject();
    }

    public Object dequeue() {
        if (this.isEmpty()) {
            return null;
        }

        No primeiroNo = refNoEntradaFila;
        No noAuxiliar = refNoEntradaFila;


        if (primeiroNo.getRefNo() == null) {
            refNoEntradaFila = null;
            return primeiroNo;
        }

        while (primeiroNo.getRefNo() != null) {
            noAuxiliar = primeiroNo;
            primeiroNo = primeiroNo.getRefNo();
        }

        noAuxiliar.setRefNo(null);
        return primeiroNo.getObject();
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
