package aula9;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    //cria uma lista com 10 elm
    public Lista() {
        this(10);
    }

    //define capacidade inicial
    public Lista(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    //aumenta a capacidade
    private void aumentaCapacide() {
        if (tamanho == elementos.length) {
            T[] aux = (T[]) new Object[tamanho * 2];
            for (int i = 0; i < tamanho; i++) {
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
    }

    //adiciona um elemento no final
    public void adiciona(T elemento) {
        aumentaCapacide();
        elementos[tamanho++] = elemento;
    }

    //adiciona um elemento em uma posição 
    public void adiciona(int posicao, T elemento) {
        if (posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        aumentaCapacide();
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    //retorna a posição de um elemento
    public int posicaoDe(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }

    //obtém um elemento de uma posição específica
    public T obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        return elementos[posicao];
    }

    //remove o elemento de uma posição específica
    public T remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        T elemento = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elemento;
    }

    //limpa a lista
    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    //verifica se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    //retorna o tamanho da lista
    public int Tamanho() {
        return tamanho;
    }

    //retorna a última posição de um elemento
    public int ultimaPosicaoElemento(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    //remove o elemento pelo valor
    public boolean remove(T elemento) {
        int posicao = posicaoDe(elemento);
        if (posicao >= 0) {
            remove(posicao);
            return true;
        }
        return false;
    }

    //verifica se a lista contém o elemento
    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    //retorna a última posição de um elemento na lista
    public int ultimaPosicaoDe(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder("[");
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) {
                retorno.append(elementos[i]).append(", ");
            }
            retorno.append(elementos[tamanho - 1]);
        }
        retorno.append("]");
        return retorno.toString();
    }
}
