package vladproduction.com.app09;

import java.util.ArrayList;
import java.util.List;

public class MongoDBRepoImpl implements UserRepo<UserMongoDB>{

    UserMongoDB userMongoDB;

    public MongoDBRepoImpl(UserMongoDB userMongoDB) {
        this.userMongoDB = userMongoDB;
    }

    @Override
    public UserMongoDB create(UserMongoDB obj) {
        return new UserMongoDB(obj.getUsername(), obj.getAge());
    }

    public List<UserMongoDB> getUsers(){
        System.out.println("Connection to MONGO-DB");
        List<UserMongoDB> usersMongo = new ArrayList<>();
        UserMongoDB user = create(new UserMongoDB(userMongoDB.getUsername(), userMongoDB.getAge()));
        usersMongo.add(user);
        return usersMongo;
    }
}
