package main.pl.grzegorz;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public static List<User>getUser(){
        List<User>users= new ArrayList<>();
        users.add(new User(1,"Adam","asd","grzegorz@gmail.com"));
        return users;
    }
}
