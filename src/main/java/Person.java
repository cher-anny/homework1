import java.io.IOException;
import java.time.LocalDate;

class Person {
    private LocalDate birthday;
    private int age;
    private String sex;
    private String name;
    private String surname;
    private String middleName;
    private String placeOfBirth;
    private int index;
    private String country;
    private String district;
    private String city;
    private String street;
    private int house;
    private int flat;
    private UserData userData = new UserData();

     Person() {
        try{
            birthday = userData.getRandomBirthday();
            age = userData.calculateAge(birthday);
            sex = userData.getRandomSex();
            name = userData.getRandomName(sex);
            surname = userData.getRandomSurname(sex);
            middleName = userData.getRandomMiddleName(sex);
            placeOfBirth = userData.getRandomCity();
            index = userData.getRandomIndex();
            country = userData.getRandomCountry();
            district = userData.getRandomDistrict();
            city = userData.getRandomCity();
            street = userData.getRandomStreet();
            house = userData.getRandomHouse();
            flat = userData.getRandomFlat();}
        catch (IOException e){
            e.printStackTrace();
        }
    }

    String getSex() {
        return sex;
    }

    int getAge() {
        return age;
    }

    LocalDate getBirthday() {
        return birthday;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getMiddleName() {
        return middleName;
    }

    String getPlaceOfBirth() {
        return placeOfBirth;
    }

    int getIndex() {
        return index;
    }

    String getCountry() {
        return country;
    }

    String getDistrict() {
        return district;
    }

    String getCity() {
        return city;
    }

    String getStreet() {
        return street;
    }

    int getHouse() {
        return house;
    }

    int getFlat() {
        return flat;
    }

}
