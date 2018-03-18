import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

class UserData {

    static LocalDate getRandomBirthday() {
        return LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 90))));
    }

    static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        if (birthDate.plus(Period.ofYears(age)).compareTo(currentDate) == 1) {
            age--;
        }
        return age;
    }

    static int getRandomIndex() {
        return (int) (Math.random() * (999999 - 100000) + 100000);
    }

    static int getRandomFlat() {
        return (int) (Math.random() * (999 - 1) + 1);
    }

    static int getRandomHouse() {
        return (int) (Math.random() * (200 - 1) + 1);
    }

    static String getRandomSex() {
        String[] sex = {"М", "Ж"};
        return sex[(int) (Math.random() * 2)];
    }

    static String getRandomCity() throws IOException {
        FileInputStream cityFile = new FileInputStream("src/main/resources/city.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(cityFile));
        String city = "";
        int random = new Random().nextInt(315);
        for(int i = 0; i < 314; i++) {
            city = reader.readLine();
            if (i == random){
                break;
            }
        }
        return city;
    }

    static String getRandomStreet() throws IOException {
        FileInputStream cityFile = new FileInputStream("src/main/resources/street.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(cityFile));
        String city = "";
        int random = new Random().nextInt(275);
        for(int i = 0; i < 274; i++) {
            city = reader.readLine();
            if (i == random){
                break;
            }
        }
        return city;
    }

    static String getRandomDistrict() throws IOException {
        FileInputStream cityFile = new FileInputStream("src/main/resources/district.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(cityFile));
        String city = "";
        int random = new Random().nextInt(47);
        for(int i = 0; i < 46; i++) {
            city = reader.readLine();
            if (i == random){
                break;
            }
        }
        return city;
    }

    static String getRandomCountry() throws IOException {
        FileInputStream cityFile = new FileInputStream("src/main/resources/country.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(cityFile));
        String city = "";
        int random = new Random().nextInt(213);
        for(int i = 0; i < 212; i++) {
            city = reader.readLine();
            if (i == random){
                break;
            }
        }
        return city;
    }

    static String getRandomName(String sex) throws IOException {
        FileInputStream nameFile;
        if (sex.equals("Ж")){
             nameFile = new FileInputStream("src/main/resources/female_name.txt");
        } else  nameFile = new FileInputStream("src/main/resources/male_name.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(nameFile));
        String name = "";
        int random = new Random().nextInt(616);
        for(int i = 0; i < 615; i++) {
            name = reader.readLine();
            if (i == random){
                break;
            }
        }
        return name;
    }

    static String getRandomSurname(String sex) throws IOException {
        FileInputStream nameFile = new FileInputStream("src/main/resources/surname.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(nameFile));
        String surname = "";
        int random = new Random().nextInt(250);
        for(int i = 0; i < 615; i++) {
            surname = reader.readLine();
            if (i == random){
                break;
            }
        }
        if (sex.equals("Ж")){
            return surname + "a";
        } else return surname;
    }

    static String getRandomMiddleName(String sex) throws IOException {
        FileInputStream nameFile;
        if (sex.equals("Ж")){
            nameFile = new FileInputStream("src/main/resources/female_middle_name.txt");
        } else  nameFile = new FileInputStream("src/main/resources/male_middle_name.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(nameFile));
        String name = "";
        int random = new Random().nextInt(76);
        for(int i = 0; i < 75; i++) {
            name = reader.readLine();
            if (i == random){
                break;
            }
        }
        return name;
    }

}
