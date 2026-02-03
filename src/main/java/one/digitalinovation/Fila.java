package one.digitalinovation;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first() {
        if (this.isEmpty()) {
            return null;
        }

        No primeiroNo = refNoEntradaFila;

        while (primeiroNo.getRefNo() != null) {
            primeiroNo = primeiroNo.getRefNo();
        }

        return primeiroNo;
    }

    public No dequeue() {
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
        return primeiroNo;
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
