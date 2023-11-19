package vladproduction.com.app09;

public class Main {
    public static void main(String[] args) {


        MongoDBRepoImpl mongoDBRepo = new MongoDBRepoImpl(new UserMongoDB("John", 18));
        UserService serviceMongo = new UserService(mongoDBRepo);
        serviceMongo.filterUserByAge(18);

        MySqlDBRepoImpl mySqlDBRepo = new MySqlDBRepoImpl(new UserMySqlDB("Bob", 21));
        UserService serviceMySql = new UserService(mySqlDBRepo);
        serviceMySql.filterUserByAge(21);
    }
}
