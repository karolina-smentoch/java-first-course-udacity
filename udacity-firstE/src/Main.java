public class Main {
    public static void main(String[] args) {
        System.out.println("PIERWSZY MODUŁ");
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
        System.out.println("Po uwzględnieniu muzyki średni wynosi " + average);

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
        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celcius);

        System.out.println("DRUGI MODUŁ");
        System.out.println("if Statement");
        boolean isCold = true;
        if (isCold) {
            System.out.println("Take your jacket!");
        } else {
            System.out.println("It's warm today, you can leave the jacket at home.");
        }
        System.out.println("Self-Driving Car");
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;
        if (isLightGreen) {
            System.out.println("Drive!"); // the light is green
        } else if (isLightYellow && isLightRed) {
            System.out.println("Prepare yourself"); // the light is yellow and red
        } else if (isLightYellow) {
            System.out.println("Slow down.");
        } else {
            System.out.println("Stop!"); // the light is only red (without the yellow one!)
        }

        System.out.println();
        System.out.println("Boolean Expressions");
        int x1 = 10;
        int y1 = 10;
        boolean z1 = x1 != y1;
        if (z1) {
            System.out.println("That's true!");
        } else {
            System.out.println("Not good!");
        }

        System.out.println();
        System.out.println("Tickets to the Museum");
        int ticketPrice = 10;
        int age = 70;
        boolean isStudent = false;
        if (age <= 15 || age > 60 || isStudent) {
            // dzięki zastosowaniu || wystarczy warunek if
            ticketPrice = 5;
            System.out.println("You have to pay $" + ticketPrice);
//        } else if (age > 60) {
//            ticketPrice = 5;
//            System.out.println("You have to pay $" + ticketPrice);
//        } else if (isStudent) {
//            ticketPrice = 5;
//            System.out.println("You have to pay $" + ticketPrice);
        } else {
            System.out.println("You have to pay $" + ticketPrice);
        }

        System.out.println();
        System.out.println("Choosing movie");
        boolean action = true;
        boolean romance = true;
        boolean horror = true;
        boolean comedy = true;
        if (action && romance) {
            System.out.println("This movie includes action and romance.");
            if (comedy || horror) {
                System.out.println("This movie also includes comedy or horror!");
            }
        }
        System.out.println();
        System.out.println("Choosing coffee by it's number");
        int password = 6;
        String coffeeType;
        switch (password) {
            case 1 : coffeeType="Espresso";
            break;
            case 2 : coffeeType="Americana";
            break;
            case 3 : coffeeType="Latte";
            break;
            case 4: coffeeType="Cappuccino";
            break;
            default: coffeeType="Wrong number. Choose the number from 1 to 4.";
            break;
        }
        System.out.println(coffeeType);

        System.out.println();
        System.out.println("Months");
        int yourMonth = 6; //liczby pomiędzy 1-12
        String monthString;
        switch(yourMonth) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "You have to choose between 1 and 12.";
                break;
        }
        System.out.println(monthString);

    }
}