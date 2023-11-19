package vladproduction.com.app09;

import java.util.List;

public class UserService {

    UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void filterUserByAge(int age){
        List users = this.userRepo.getUsers();
        for (Object user : users) {
            if (age >= 18) {
                System.out.println(user);
            }
        }

    }
}
