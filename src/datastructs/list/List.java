package datastructs.list;

/**
 * Interface para listas sequenciais.
 * @param <T> O tipo da lista.
 */
public interface List<T> {

    /**
     * Tenta adicionar um elemento ao final da lista.
     * @param element O elemento para adicionar à lista.
     */
    void add(T element);

    /**
     * Tenta remover um elemento da lista baseado em sua posição.
     * @param index A posição do elemento na lista.
     * @throws IndexOutOfBoundsException Caso (index < 0 || index >= size())
     */
    T remove(int index);

    /**
     * @return o tamanho da lista
     */
    int size();

    /**
     * Deletes stuff from the end of the datastructs.list
     * @return
     */
    T pop();

    /**
     * Gets the element on the positon
     * @param index
     * @return
     */
    T get(int index);

    // ...
    // TODO
}
