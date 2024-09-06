package aula8.exemploInterface;

/**
 * Classe que representa uma lista de elementos do tipo String
 * @version 1
 * @author Brenda
 */
public class Vetor implements Lista {
    private String[] elementos;
    private int tamanho;

    /**
     * Cria/inicializa uma instancia de vetor com capacidade de elementos
     * @param capacidade capacidade inicial da lista 
     */
    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

    /**
     * Método que permite adicionar um elemento no final da lista
     * @param elemento elemento que será adicionado
     */
    @Override
    public void adiciona(String elemento){
        elementos[tamanho] = elemento;
        tamanho++;
    }

    /**
     * Remove o último elemento da lista
     * @return retorna o elemento removido
     */
    @Override
    public String remove(){
        if(tamanho > 0){
            return elementos[--tamanho];
        }
        return null;
    }

    /**
     * Retorna a quantidade de elementos atualmente na lista
     * @return inteiro contendo a quantidade de elementos
     */
    public int getTamanho(){
        return tamanho;
    }

    /**
     * Monta uma String com os elementos presentes na lista
     * @return um conjunto vazio para listas vazias [ ] ou um conjunto com os elementos da lista [ 'A' 'B' 'C' ]
     */
    @Override
    public String toString(){
        String resultado = " [ ";
        if(tamanho > 0){
            for(int i = 0; i < tamanho; i++){
                resultado += elementos[i] + " ";
            }
        }
        resultado += "] ";
        return resultado;
    }
}
