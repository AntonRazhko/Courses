package Home_Task_6_ClassesAndObject;

public class Customers {
    private String surname;
    private String name;
    private String middle_name;
    private int year_of_birth;
    private int number_card;
    private int number_account;

    public Customers() {
    }

    public Customers(String surnames, String names, String middle_names, int year_of_births, int number_cards, int number_accounts) {
        surname = surnames;
        name = names;
        middle_name = middle_names;
        year_of_birth = year_of_births;
        number_card = number_cards;
        number_account = number_accounts;
    }

    public void setSurname(String userSurname) {
        surname = userSurname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }

    public void setMiddle_name(String userMiddle_surname) {
        middle_name = userMiddle_surname;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setYear_of_birth(int userYear_of_birth) {
        year_of_birth = userYear_of_birth;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setNumber_card(int userNumber_card) {
        number_card = userNumber_card;
    }

    public int getNumber_card() {
        return number_card;
    }

    public void setNumber_account(int userNumber_account) {
        number_account = userNumber_account;
    }

    public int getNumber_account() {
        return number_account;
    }
    public int getAge(int year_of_birth){
        int age =2021-year_of_birth;
        return age;
    }
    public void printUserParameters(){
        System.out.println(getSurname()+" "+getName()+" "+getMiddle_name()+" ,№ карты "+getNumber_card()+" ,№ счета "+getNumber_account()+" ,возраст "+getAge(getYear_of_birth())+" лет");
    }
}

