import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.*;
import java.util.stream.Collectors;

public class UsersRepositoryFileImpl implements UserRepository {

    private final String fileName;

    public UsersRepositoryFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<User> findAll() {

        List<User> users = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String line = bufferedReader.readLine();

            while (line != null) {

                String[] parts = line.split("\\|");

                users.add(new User(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]), Boolean.parseBoolean(parts[3])));

                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        return users;
    }

    @Override
    public void save(User user) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true))) {


            if (findAll().stream().map(User::getId).noneMatch(id -> id == user.getId())) {

                bufferedWriter.write(user.getId() + "|" + user.getName() + "|" + user.getAge() + "|" + user.isWorker());
                bufferedWriter.newLine();
                bufferedWriter.flush();

            } else {

                System.out.println("повторяющийся id");
                //int max=findAll().stream().mapToInt(user1->user1.getId()).max().orElse(0);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }


    @Override
    public User findByID(int id) {

        return findAll().stream().filter(user1 -> user1.getId() == id).findFirst().orElse(null);

    }

    @Override
    public void update(User user) {

        if (findByID(user.getId()) == null) {

            System.out.println("Пользователя с таким id не существует");

        } else {
            //получаем список пользователей без старой версии обновляемого пользователя и добавляем в него обновленную
            List<User> users = findAll().stream().filter(user1 -> user1.getId() != user.getId()).collect(Collectors.toList());
            users.add(user);

            //очищаем файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false))) {

                writer.write("");
                writer.flush();

            } catch (Exception e) {

                throw new IllegalArgumentException(e);
            }
            //перезаписываем пользователей в файл предварительно отсортировав по id
            users.stream().sorted(Comparator.comparingInt(User::getId)).forEach(this::save);
        }


    }
}
