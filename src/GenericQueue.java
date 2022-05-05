public class GenericQueue<T> {
    private static final int CAPACIDAD_INICIAL = 5;

    private CustomCollection collection = new CustomCollection(CAPACIDAD_INICIAL);

    public void enqueue(Float numeros) {
        collection.insert(numeros, 0);
    }

    public void dequeue() {collection.delete(0);}

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < collection.length(); i++) {
            out += collection.getElement(i).toString();
            out +=" ";

        }
        return out;
    }
}
