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

        System.out.println();
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
            case 1:
                coffeeType = "Espresso";
                break;
            case 2:
                coffeeType = "Americana";
                break;
            case 3:
                coffeeType = "Latte";
                break;
            case 4:
                coffeeType = "Cappuccino";
                break;
            default:
                coffeeType = "Wrong number. Choose the number from 1 to 4.";
                break;
        }
        System.out.println(coffeeType);

        System.out.println();
        System.out.println("Months");
        int yourMonth = 6; //liczby pomiędzy 1-12
        String monthString;
        switch (yourMonth) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "You have to choose between 1 and 12.";
                break;
        }
        System.out.println(monthString);

        System.out.println();
        System.out.println("ZADANIA DODATKOWE");
        System.out.println("Question 3");
        boolean playerPoweredUp = true;
        boolean canSeePlayer = false;
        if (canSeePlayer) {
            if (playerPoweredUp) {
                System.out.println("Run away!");
            } else {
                System.out.println("Attack!");
            }
        } else {
            System.out.println("Wander.");
        }
        System.out.println("Question 4");
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        //TODO: print "Let’s stay home." if its raining, snowing or
        //below 50 degrees and print "Let’s go out!" otherwise.
        if (isSnowing || isRaining || temperature < 50) {
            System.out.println("Let's stay home");
        } else {
            System.out.println("Let's go out!");
        }
        System.out.println("Question 5");
        //Assume this could have any value between 0 and 24:
        int time = 22;
        String timeOfDay;
        //TODO: set timeOfDay to the correct String value.
        if (time >= 5 && time < 12) {
            System.out.println("Morning");
        } else if (time >= 12 && time < 20) {
            System.out.println("Daytime");
        } else {
            System.out.println("Night");
        }
        System.out.println("Question 6");
        //Assume these could have any value:
        int dayOfTheWeek = 1; // Wybierz liczbę pomiędzy 1-7, które odpowiadają dniom tygodnia
        boolean holiday = false;
        if (dayOfTheWeek >= 1 && dayOfTheWeek <= 5 && !holiday) {
            System.out.println("Wake up at 7:00");
        } else {
            System.out.println("Sleep in!");
        }
        System.out.println("Question 8");
        //Assume this can have any value from 1 to 7:
        int dayOfWeek = 7;
        //TODO: declare a String variable called schedule.
        //TODO: write a switch statement that give schedule a different
        //value for each day of the week based on the dayOfWeek variable.
        //Don’t forget to "break" after each case, and don’t forget to
        //provide a default case!
        String schedule;
        switch (dayOfWeek) {
            case 1:
                schedule = "Gym in the morning.";
                break;
            case 2:
                schedule = "Class after work.";
                break;
            case 3:
                schedule = "Meetings all day.";
                break;
            case 4:
                schedule = "Work from home.";
                break;
            case 5:
                schedule = "Game night afert work.";
                break;
            case 6:
            case 7:
                schedule = "Free";
                break;
            default:
                schedule = "Please correct the day";
        }
        System.out.println(schedule);

        System.out.println();
        System.out.println("TRZECI MODUŁ");
        System.out.println("Karaoke Machine");
        chorus();

        System.out.println();
        System.out.println("Play button");
        playMusic();

        System.out.println();
        System.out.println("Greeting for a city");
        greeting("Gdańsk");

        System.out.println();
        System.out.println("Greeting for a city");
        weatherInterpreter(25);
        int degreesC = 32;
        weatherInterpreter(degreesC);

        System.out.println();
        System.out.println("Photograph");
        printPhoto(200, 300, true);

        System.out.println();
        System.out.println("Height requirements");
        System.out.println(admission(110)); // bez souta mi się ten wynik nie pokaże, ale jest zwracany przez funkcję


        System.out.println();
        System.out.println("Change");
        System.out.println("Your change is $" + makeChange(298, 300));

        System.out.println();
        System.out.println("Rolling the dice");
        int roll1 = rollDice(6);
        int roll2 = rollDice(20);
        System.out.println("Roll 1 " + roll1);
        System.out.println("Roll 2 " + roll2);

        System.out.println();
        System.out.println("CZWARTY MODUŁ");
        System.out.println("Yahtzee");
        keepRolling();

        System.out.println();
        System.out.println("Warnings");
        raiseAlarm(3);
        raiseAlarm2(4);

        System.out.println();
        System.out.println("Pyramid");
        countBlocks(3);

        System.out.println();
        System.out.println("Counting up");
        addNumbers(14, 20);

        System.out.println();
        System.out.println("Rolling the dice - 6 wins, 3 lose");
        rollASix();

        System.out.println();
        System.out.println("ARRAY - Press Conference");
        String[] newsOutlet = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "sky", "Aljazeera"};
        double lucky = Math.random();
        lucky *= 10;
        int luckyIndex = (int) lucky;
        System.out.println(newsOutlet[luckyIndex]);

        System.out.println();
        System.out.println("ARRAY - Average temperature");
        double[] temperatures = {75, 73, 72, 80};
        System.out.println(calculateAverage(temperatures));

        System.out.println();
        System.out.println("ARRAY - The longest name");
        String[] names = {"Ana", "David", "Lucy", "Caroline"};
        findLongestName(names);


    }


    public static void chorus() {
        // print out 4 lines of chorus
        System.out.println("First line of chorus");
        System.out.println("Second line of chorus");
        System.out.println("Third line of chorus");
        System.out.println("Forth line of chorus");
    }

    public static void playMusic() {
        boolean playButton = true;
        if (playButton) {
            System.out.println("Music is plaing.");
        } else {
            System.out.println("Music is paused.");
        }
    }

    public static void greeting(String location) {
        System.out.println("Hello, " + location);
    }

    public static void weatherInterpreter(int temperature) {
        if (temperature > 30) {
            System.out.println("It's so hot!");
        } else if (temperature < 5) {
            System.out.println("It's so cold");
        } else {
            System.out.println("It's perfect weather outside!");
        }
    }

    public static void printPhoto(int width, int height, boolean inColor) {
        System.out.println("Weidth = " + width + "cm");
        System.out.println("Heigth = " + height + "cm");
        if (inColor) {
            System.out.println("Print is full color.");
        } else {
            System.out.println("Print is black and white.");
        }
    }

    public static String admission(double height) {
        String passText;
        if (height > 120) {
            passText = "You pass the height requirements.";
        } else {
            passText = "Sorry, you don't pass.";
        }
        return passText;
    }

    public static double makeChange(double itemCost, double dollarProvided) {
        double makeChange = dollarProvided - itemCost;  // określam zmienną makeChange typu double jako różnicę dwóch zmiennych double
        return makeChange; //zwracam wynik funkcji w formie zmiennej makeChange typu, ale to jeszcze nie wyśiwetla jej wartości
    }

    public static int rollDice(int sides) { //jeżeli damy tutaj pusty nawiast to poniżej zamiast zmiennej sides należy dać liczbę ścianek kostki
        /**
         * This dice function simulates a random dice roll
         * for a dice with a given number of sides.
         *
         * @param sides the number od sides of a dice
         * @return random roll value (an int)
         */
        double randomNumber = Math.random();
        randomNumber = randomNumber * sides; //uzależnia wartość na kostce od ilości ścianek
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }

    public static void beep() {
    }

    /**
     * makes a single beep sound
     */
    public static boolean checkAlarm() {
        return true;
    }

    /**
     * @return true if alarm is on, false if off
     */
    public static void alarm() {
    }

    {
        /**
         * keep beeping until snoozed
         */
        boolean on = checkAlarm();
        while (on) {
            beep();
            on = checkAlarm();
        }
    }

    public static int keepRolling() {
        int dice1 = rollDice(6);
        int dice2 = rollDice(6);
        int dice3 = rollDice(6);
        int dice4 = rollDice(6);
        int dice5 = rollDice(6);
        int count = 1;
        while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
            dice1 = rollDice(6);
            dice2 = rollDice(6);
            dice3 = rollDice(6);
            dice4 = rollDice(6);
            dice5 = rollDice(6);
            count = count + 1;
        }
        System.out.println("It took " + count + " tries to have the dices matched.");
        return count;
    }

    public static void raiseAlarm(int numOfWarnings) {
        int i = 1;
        while (i <= numOfWarnings) {
            System.out.println("Warning");
            // i = i + 1; longer version of what's written below
            i++;
        }
    }

    public static void raiseAlarm2(int numOfWarnings) {
        for (int i = 1; i <= numOfWarnings; i++) {
            System.out.println("Warning2 #" + i);
        }
    }

    public static int countBlocks(int levels) {
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            total = total + i * i;
        }
        System.out.println(total + " blocks are needed");
        return total;
    }

    /**
     * Adding numbers from the first to the last one
     *
     * @param firstNumber
     * @param lastNumber
     * @return the total sum of these numbers
     */
    public static int addNumbers(int firstNumber, int lastNumber) {
        int sum = 0;
        for (int i = firstNumber; i <= lastNumber; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }

    /**
     * Rolls a dice till you get a 6 then you win
     * but if you get a 3 you lose
     */
    public static boolean rollASix() {
        int dice = rollDice(6);
        while (dice != 6) {
            dice = rollDice(6);
            if (dice == 3)
                break;
        }
        if (dice == 6) {
            System.out.println("You win");
            return true;
        } else {
            System.out.println("You loose");
            return false;
        }
    }

//    public static int martingale() {
//        int money = 1000;
//        int target = 1200;
//        int bet = 10;
//        while (money > bet) {
//            boolean win = play();
//            if (win && money < target) {
//                money += bet;
//                bet = 10;
//            } else {
//                money -= bet;
//                bet *= 2;
//            }
//            if (money >= target)
//                break;
//        }
//        return money;
//    }

    public static double calculateAverage(double[] temperatures) {
        int size = temperatures.length; //liczba zmiennych w tabeli
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += temperatures[i];
        }
        double average = total / size;
        return average;
    }

    public static String findLongestName(String[] names) {
        int size = names.length;
        String longestName = names[0];
        for (int i = 1; i < size; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        System.out.println(longestName);
        return longestName;
    }

    public static double allSubjectsAverage(int[][] grades, int student) {
        int subjects = grades.length;
        int total = 0;
        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < student; j++) {
                total += grades[i][student];
            }
        }
        double average = total / (double) subjects;
        return average;
    }
}
