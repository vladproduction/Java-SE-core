package vladproduction.com.app09;

import java.util.ArrayList;
import java.util.List;

public class MySqlDBRepoImpl implements UserRepo<UserMySqlDB>{

    UserMySqlDB userMySqlDB;

    public MySqlDBRepoImpl(UserMySqlDB userMySqlDB) {
        this.userMySqlDB = userMySqlDB;
    }

    @Override
    public UserMySqlDB create(UserMySqlDB obj) {
        return new UserMySqlDB(obj.getUsername(), obj.getAge());
    }

    public List<UserMySqlDB> getUsers(){
        System.out.println("Connection to MYSQL-DB");
        List<UserMySqlDB> usersMySql = new ArrayList<>();
        usersMySql.add(this.userMySqlDB);
        return usersMySql;
    }
}
