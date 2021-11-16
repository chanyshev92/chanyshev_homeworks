import java.util.*;
public class Main {
    public static void main(String[] args) {

        UserRepository usersRepository = new UsersRepositoryFileImpl("users.txt");
        List <User> users = usersRepository.findAll();

        for (User user : users) {
            System.out.println(user.getAge() + " " + user.getName() + " " + user.isWorker());
        }

        User user = new User("Игорь", 33, true);
        usersRepository.save(user);

        for (User user2 : users) {
            System.out.println(user2.getAge() + " " + user2.getName() + " " + user2.isWorker());
        }
        List <User> workers = usersRepository.findByIsWorkerIsTrue();

        for (User worker : workers) {
            System.out.println(worker.getAge() + " " + worker.getName() + " " + worker.isWorker());
        }

        List <User> aged = usersRepository.findByAge(65);
        for (User user1 : aged) {
            System.out.println(user1.getAge() + " " + user1.getName() + " " + user1.isWorker());
        }
    }
}
