package list;

/**
 * Interface para listas sequenciais
 * @param <T> O tipo da lista.
 */
public interface List<T> {

    /**
     * Tenta adicionar um elemento ao final da lista.
     * @param element O elemento para adicionar à lista.
     * @return True se foi possível adicionar o elemento, false caso contrário.
     */
    boolean add(T element);

    /**
     * Tenta remover um elemento da lista baseado em sua posição.
     * @param index A posição do elemento na lista.
     * @throws NullPointerException se a posição a ser acessada é invalida(excede o tamanho do array ou é um valor negativo)
     */
    void remove(int index);

    // ...

    // TODO
}
