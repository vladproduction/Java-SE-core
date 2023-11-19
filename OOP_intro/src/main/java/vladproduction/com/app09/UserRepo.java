package vladproduction.com.app09;

import java.util.List;

public interface UserRepo<T> {

    T create(T obj);
    List<T> getUsers();


}
