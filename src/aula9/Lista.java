package aula9;

   //Construtor que me permite omitir o tamanho da lista e construa uma lista com 10 elementos
  

   

public class Lista<T> { //pra  conseguir usar o tipo genérico e possa tornar a lista suscetivel a inteiros
            private T[] elementos;
            private int tamanho;

            private Lista(int capacidade){
                elementos = (T[])new Object[capacidade];
                tamanho = 0;
            }


        private void aumentaCapacide(){
            if(tamanho==elementos.length){
            T[] aux =(T[]) new Object[tamanho*2];
            for(int i=0; i<tamanho;i++)
            aux[i] = elementos[i];
            //System.arraycopy(elementos, 0, aux, 0, elementos.length); -- cópia de elementos de um vetor para o outro, mesma coisa que o for fez em cima 
           for(int i=0; i<tamanho;i++){
            aux[i] = elementos[i];
            elementos = aux;
           }
        }
        }
        public void adiciona(T elemento){
            aumentaCapacide();
                elementos[tamanho++] = elemento;
        }

        public void adiciona(int posicao, T elemento){
            if(posicao<0 || posicao>=tamanho)
                throw new IllegalArgumentException("Posição "+ posicao+"é inválida");
                aumentaCapacide();
            for(int i= tamanho-1;i>=posicao;i--)
                elementos[i+1] = elementos[i];
            elementos[posicao] = elemento;
            tamanho++;
            
        }

        public int posicaoDe(String elemento){
            for(int i=0;  i<tamanho;i++)
                if(elementos[i].equals(elemento))
                return i;
            return -1; 
        }

        public T obter(int posicao){
            if(posicao<0 || posicao>=tamanho)
            throw new IllegalArgumentException("Posição "+ posicao+"é inválida");
            return elementos[posicao];
        }

        public T remove(int posicao){
            if(posicao<0 || posicao>=tamanho)
            throw new IllegalArgumentException("Posição "+ posicao+ " é inválida");
            T elemento = elementos[posicao];
            for(int i=posicao; i<tamanho-1; i++){
                elementos[i] = elementos[i+1];
            }
            tamanho--;
            return elemento;
        }

        //Método para limpar a lista public void limpar();
        public void limpar() {
            for (int i = 0; i < tamanho; i++) {
                elementos[i] = null;
            }
            tamanho = 0;
        }

    //Criar o método que verifica se a lista está vazia public boolean estaVazia();
        public boolean estaVazia(){
          return tamanho == 0; //se a lista estiver vazia retorna true 
        }


        //Criar o método que retorne o tamanho da lista public int tamanho();
        public int Tamanho(){
            return tamanho;
        }

         //public int ultimaPosicaoElemento(T elemento);
         public int ultimaPosicaoElemento(T elemento){
            for(int i = tamanho -1; i>=0; i--){
                if(elementos[i].equals(elementos)){
                    return i;
                }
            }
            return -1;
         }

         //Método que remove o elemento pelo elemento public boolean remove(T elemento);

         public boolean remove(T elemento){
            int posicao = posicaoDe(elemento);
            if(posicao>=0){
                remove(posicao);
                return true;
            }
            return false;
         }
        //Método que pesquisa e diz se existe ou não public boolean contem(T elemento);
        public boolean contem(T elemento){
            for(int i =0; i<tamanho; i++){
                if(elementos[i].equals(elemento));
                return true;
            }
            return false;
        }

        //public int posicaoDe(String elemento){
          //  for(int i=0;  i<tamanho;i++)
            //    if(elementos[i].equals(elemento))
              //  return i;
            //return -1; 
        //}


    //Método que retorna o último índice que determinado elemento aparece na lista e retorna o índice, 
    //semelhante ao indiceDe(), porém lá ele encerra o método no momento que encontrar o elemento, aqui quero que ele 
    //continue pesquisando e encontre a última posição.

    public int ultimaPosicaoDe(T elemento){
        for(int i=0; i<tamanho; i++){
                
        }
    }
    public 
        @Override
        public String toString(){
            String retorno = "[";
            if(tamanho>0){
                for(int i=0;i<tamanho-1;i++){
                    retorno+=elementos[i]+", ";
                }
            retorno +=elementos[tamanho-1];
            }
                    return retorno+"]";
        }
}
