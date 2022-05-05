package j17_최상위클래스.service;

import java.util.Scanner;
import j17_최상위클래스.repository.user.User;

public interface UserService {
    public User addUser(Scanner scanner);
    public User getUserByUserName(Scanner scanner);
    // username을 가지고 user 찾음
    public User loginUser(Scanner scanner);

    public User[] getUserAll();


}
