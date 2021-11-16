import java.util.*;
public interface UserRepository {

    List<User> findAll();
    void save(User user);
    List<User> findByAge(int age);
    List<User> findByIsWorkerIsTrue();


}
