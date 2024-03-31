package datastructure.learn;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void add(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
           if (elementos[i] == null){
               elementos[i] = elemento;
               break;
           }
        }
    }

    public void add(String elemento, int position) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }


        if (!(position >=0 && position < tamanho)){
            throw new IllegalArgumentException("Posição ilegal");
        }

        for (int i=tamanho; i>=position; i-- ){

        }

    }

    public boolean addFinalList(String elemento) {
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public String search(int position){
        if (!(position >=0 && position < tamanho)){
            throw new IllegalArgumentException("Posição ilegal");
        }
        return this.elementos[position];
    }


}
