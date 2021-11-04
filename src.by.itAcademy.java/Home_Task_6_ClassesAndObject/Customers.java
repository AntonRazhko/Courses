package Home_Task_6_ClassesAndObject;

public class Customers {
    private String surname;
    private String name;
    private String middleName;
    private int yearOfBirth;
    private int numberCard;
    private int numberAccount;

    public Customers() {
    }

    public Customers(String surnames, String names, String middle_names, int year_of_births, int number_cards, int number_accounts) {
        surname = surnames;
        name = names;
        middleName = middle_names;
        yearOfBirth = year_of_births;
        numberCard = number_cards;
        numberAccount = number_accounts;
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

    public void setMiddleName(String userMiddle_surname) {
        middleName = userMiddle_surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setYearOfBirth(int userYear_of_birth) {
        yearOfBirth = userYear_of_birth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setNumberCard(int userNumber_card) {
        numberCard = userNumber_card;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberAccount(int userNumber_account) {
        numberAccount = userNumber_account;
    }

    public int getNumberAccount() {
        return numberAccount;
    }
    public int getAge(int yearOfBirthbirth){
        int age =2021-yearOfBirth;
        return age;
    }
    public void printUserParameters(){
        System.out.println(getSurname()+" "+getName()+" "+ getMiddleName()+" ,№ карты "+ getNumberCard()+" ,№ счета "+ getNumberAccount()+" ,возраст "+getAge(getYearOfBirth())+" лет");
    }
}

