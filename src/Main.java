import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.*;


public class Main {

    public static void main(String[] args) {
//
//        LocalDate localDate = LocalDate.now();
//        localDate.isAfter();
//
//        Date date = new Date();
//        date.after()

        ArrayList<User> userArrayList = new ArrayList<>();

        userArrayList.add(new User("Ali", new Date(System.currentTimeMillis() - 365 * 24 * 3600)));
        userArrayList.add(new User("Kimdur", new Date(System.currentTimeMillis() - 365 * 24 * 3600 + 18000)));
        userArrayList.add(new User("Guli", new Date(System.currentTimeMillis() - 400 * 24 * 3600)));
        userArrayList.add(new User("Dilshod", new Date(System.currentTimeMillis() - 200 * 24 * 3600)));
        userArrayList.add(new User("Botir", new Date(System.currentTimeMillis() - 665 * 24 * 3600)));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        Scanner scanner = new Scanner(System.in);

        String beginDate = scanner.nextLine();
        String endDate = scanner.nextLine();

        // 12.12.2021, 04.25.2023
        try {
            Date begin = simpleDateFormat.parse(beginDate);
            System.out.println(begin);
            Date end = simpleDateFormat.parse(endDate);
            System.out.println(end);

            for (User user : userArrayList) {
                if(user.getBirthDate().after(begin) && user.getBirthDate().before(end)) {
                    System.out.println(user);
                }
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}