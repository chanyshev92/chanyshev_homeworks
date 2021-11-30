import java.util.List;

public interface UserRepository {

    List<User> findAll();

    void save(User user);

    User findByID(int id);

    void update(User user);
}
