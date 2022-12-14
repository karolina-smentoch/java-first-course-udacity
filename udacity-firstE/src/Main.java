public class Main {
    public static void main(String[] args) {
        System.out.println("ZADANIE 1 - Liczba pasażerów");
        int passengers;
        passengers = 0;
        passengers = passengers + 5;
        passengers = passengers - 3;
        passengers = passengers + 4;
        System.out.println("Na ostatnim przystanku było " + passengers + " pasażerow");
//        System.out.print("Na ostatnim przystanku było ") ;
//        System.out.print(passengers);
//        System.out.println(" pasazerow");

        System.out.println();
        System.out.println("ZADANIE 2 - Przystanki i bilety");
        int stops;
        int tickets;
        stops = 0;
        tickets = 0;
        stops = stops + 1;
        tickets = tickets + 5;
        stops = stops + 1;
        tickets = tickets + 3;
        stops = stops + 1;
        tickets = tickets + 7;
        System.out.println("Liczba wydanych biletów " + tickets);

        System.out.println();
        System.out.println("ZADANIE 3 - Kierowca");
        String driver;
        driver = "Heniek";
        System.out.println("Imię kierowcy to " + driver);
        int letters = driver.length();
        System.out.println("Ilość wyrazów w imiieniu kierowcy to " + letters);
        driver = driver.toUpperCase();
        System.out.println("Imię kierowcy wielkimi literami: " + driver);

        System.out.println();
        System.out.println("ZADANIE 4 - Łącznenie Stringów");
        String driverFirstName;
        driverFirstName = "Heniek";
        String driverLastName;
        driverLastName = "Kowalski";
        System.out.println(driverFirstName + " " + driverLastName);

        System.out.println();
        System.out.println("ZADANIE 5 - małe i wielkie litery");
        String language = "java";
        String feeling = "Love";
        feeling = feeling.toLowerCase();
        language = language.toUpperCase();
        System.out.println("I " + feeling + " " + language);

        System.out.println();
        System.out.println("ZADANIE 6 - Arytmetyka");
        double div1 = 5 / 2; //obie liczby są traktowane jako całkowite, więc wynik też jest l.całk.
        double div2 = 5 / 2.0; //druga z liczb jest z przecinkiem, więc całe wyrażenie też jest traktowane jako liczba z przecinkiem
        double div3 = 5 / 2d; //inny sposó uzyskiwania liczby z przecinkiem
        System.out.println(div1);
        System.out.println(div2);
        System.out.println(div3);
        int x = 2 + 3;
        int y = 4 - 5;
        int z = x * y;
        System.out.println("Wynik mnożenia to " + z);
        double paid = 10;
        double change = 3.25;
        double tip = (paid - change) * 0.2;
        System.out.println("Tip wynosi " + tip);

        System.out.println();
        System.out.println("ZADANIE 7 - Casting");
        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);
        int approx = (int) future;
        System.out.println("Odcinając końcówkę - " + approx);

        System.out.println();
        System.out.println("ZADANIE 8 - Oceny i średnia");
        /* Your friend seems to be really good at music, he managed to score 96% on his final exam!
        Now that you know all 5 subject grades, update the average calculation below to calculate the
        total average of all subjects. */
        double maths = 97.5;
        double english = 98;
        double science = 83.5;
        double drama = 75;
        double music = 96;
        double sum = maths + english + science + drama + music;
        double average = sum / 5;
        System.out.println("Po uwzględnieniu muzyki średni wynosi " +  average);

        System.out.println();
        System.out.println("ZADANIA DODATKOWE");
        System.out.println("Question 3");
        int bankBalance = 500;
        bankBalance = bankBalance + 250;
        bankBalance = bankBalance - 100;
        System.out.println(bankBalance);
        System.out.println("Question 5");
        int day = 20;
        String month = "czerwiec";
        System.out.println("Data moich urodzin to " + day + " " + month);
        System.out.println("Question 6");
        String firstName = "Karolina";
        String lastName = "Smentoch";
        String fullName = firstName + " " + lastName;
        int letters2 = firstName.length();
        System.out.println("Hello, my name is " + fullName + ".");
        System.out.println("There are " + letters2 + " letters in my name.");
        System.out.println("Question 7");
        double fahrenheit = 16.0;
        double celcius = ( fahrenheit - 32 ) * 5 / 9;
        System.out.println(celcius);




    }
}