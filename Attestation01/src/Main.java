import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserRepository usersRepository = new UsersRepositoryFileImpl("users.txt");
        List<User> users = usersRepository.findAll();

        for (User user : users) {
            user.print();
        }

        User user1 = usersRepository.findByID(2);

        user1.setAge(55);
        user1.setName("Светлана");
        user1.setWorker(false);

        System.out.println("Update");
        usersRepository.update(user1);

        users= usersRepository.findAll();

        for (User user : users) {
            user.print();
        }
    }
}
