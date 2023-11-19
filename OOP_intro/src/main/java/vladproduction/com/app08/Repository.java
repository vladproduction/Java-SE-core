package vladproduction.com.app08;

public interface Repository<T> {
    T create(T obj);

    T read();
    T update(T candidate, T old);
    void delete();
}
