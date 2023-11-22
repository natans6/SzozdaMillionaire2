import java.util.Scanner;

public class Millionaire {
    Player player = new Player("Nate");
    private int randomNumber;
    private int j = 0;
    Scanner scanner = new Scanner(System.in);
    String questions [] = {"What is the capital of France?",
            "Which critically acclaimed and heavily influential Atlanta Rapper is currently being tried for A RICO case?",
            "Which fast-food chain was sued for false advertisement in 2023 and lost?",
            "Which of these 4 US presidents are made up?",
            "In which ocean is the Great Barrier Reef located?",
            "Who is known as the 'Queen of Pop'?",
            "Which planet is known as the 'Red Planet'?",
            "What is the largest mammal in the world?",
            "Which famous scientist developed the theory of relativity?",
            "What is the currency of Japan?",
            "Which element has the chemical symbol 'O'?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the largest desert in the world?",
            "Which famous painting features a woman with an enigmatic smile?",
            "Which ancient wonder of the world was located in Egypt?",
            "What is the smallest prime number?",
            "Which novel features the character Jay Gatsby?",
            "In what year did Christopher Columbus first reach the Americas?",
            "Which gas do plants absorb during photosynthesis?",
            "Who is the author of the Harry Potter series?",
            "What is the capital city of Australia?",
            "Which famous scientist discovered the laws of motion?",
            "What is the largest mammal in North America?",
            "Which element has the chemical symbol 'Fe'?",
            "What is the main ingredient in guacamole?",
            "In what year did the United States declare its independence?",
            "Which mountain range spans seven countries in Southern Europe?",
            "Who wrote 'The Canterbury Tales'?",
            "What is the largest moon in our solar system?",
            "Which planet is known as the 'Morning Star' or 'Evening Star'?"};

    String questionOptions [] = {"A. Paris\nB. London\nC. Rome\nD. Berlin",
            "A. YNW Melly\nB. Young Thug\nC. Kanye West\nD. Kay Flock",
            "A. McDonald's\nB. Taco Bell\nC. Burger King\nD. Tim Horton",
            "A. Zachary Taylor\nB. Chester\nA. Arthur C. Calvin Coolidge\nD. Jefferson Steele",
            "A. Pacific\nB. Atlantic\nC. Indian\nD. Southern",
            "A. Madonna\nB. Beyoncé\nC. Taylor Swift\nD. Adele",
            "A. Mars\nB. Venus\nC. Jupiter\nD. Saturn",
            "A. Elephant\nB. Blue Whale\nC. Giraffe\nD. Hippopotamus",
            "A. Isaac Newton\nB. Albert Einstein\nC. Galileo Galilei\nD. Stephen Hawking",
            "A. Yen\nB. Won\nC. Ringgit\nD. Baht",
            "A. Oxygen\nB. Gold\nC. Silver\nD. Mercury",
            "A. Charles Dickens\nB. William Shakespeare\nC. Jane Austen\nD. Mark Twain",
            "A. Sahara\nB. Gobi\nC. Antarctic\nD. Atacama",
            "A. The Starry Night\nB. Guernica\nC. The Scream\nD. Mona Lisa",
            "A. Hanging Gardens of Babylon\nB. Great Pyramid of Giza\nC. Temple of Artemis\nD. Statue of Zeus at Olympia",
            "A. 0\nB. 1\nC. 2\nD. 3",
            "A. Pride and Prejudice\nB. The Great Gatsby\nC. To Kill a Mockingbird\nD. 1984",
            "A. 1492\nB. 1505\nC. 1607\nD. 1776",
            "A. Oxygen\nB. Nitrogen\nC. Carbon Dioxide\nD. Hydrogen",
            "A. J.K. Rowling\nB. George R.R. Martin\nC. Stephen King\nD. Suzanne Collins",
            "A. Sydney\nB. Melbourne\nC. Canberra\nD. Brisbane",
            "A. Isaac Newton\nB. Albert Einstein\nC. Galileo Galilei\nD. Marie Curie",
            "A. Grizzly Bear\nB. Bison\nC. Moose\nD. Blue Whale",
            "A. Iron\nB. Gold\nC. Silver\nD. Mercury",
            "A. Tomato\nB. Avocado\nC. Onion\nD. Lime",
            "A. 1620\nB. 1776\nC. 1812\nD. 1945",
            "A. Rocky Mountains\nB. Alps\nC. Andes\nD. Himalayas",
            "A. Geoffrey Chaucer\nB. William Shakespeare\nC. Jane Austen\nD. Charles Dickens",
            "A. Io\nB. Titan\nC. Ganymede\nD. Phobos",
            "A. Venus\nB. Mars\nC. Jupiter\nD. Saturn"};

    String questionAnswers [] = {"A", "B", "B", "D", "A", "A", "A", "B", "B", "A", "A", "B", "C", "D", "B", "C", "B", "A", "C", "A", "C", "A", "D", "A", "B", "B", "B", "A", "C", "A"};

    int moneyWon [] = {500, 1000, 2000, 3000, 5000, 7500, 10000, 15000, 25000, 50000, 75000, 150000, 250000, 500000, 1000000};

    // Constructor
    public Millionaire(){
        randomNumber = (int) (Math.random() * 30);
    }

    // Method that will run the other methods
    public void start(){
        introduction();
        for (int i = 1; i  <= 15; i++){
            printQuestionTotal();
            boolean answer = userAnswer();
            if (!answer){
                break;
            }
            setRandomNumber(0);
        }
    }

    public boolean userAnswer(){
        System.out.print("What do you think is the answer to this question? ");
        String letter = scanner.nextLine();
        if(letter.equals(getAnswer())){
            System.out.println("Congrats! That is correct!");
            // increment money here
            player.increaseMoney(moneyWon[j]);
            j++;
            System.out.println("You as of right now have $" + player.getMoney());
            return true;
        } else{
            System.out.println("You could have kept a grand total of $" + player.getMoney());
            System.out.println("And that is the end for you today. Thank you for coming!");
            return false;
        }

    }

    public void printQuestionTotal(){
        System.out.println("<------------------------------------------------------->");
        System.out.println(getQuestion());
        System.out.println(getOptions());
    }
    public String getQuestion(){
        return questions[randomNumber];
    }
    public String getOptions(){
        return questionOptions[randomNumber];
    }
    public String getAnswer(){
        return questionAnswers[randomNumber];
    }

    public void setRandomNumber(int rand){
        rand = (int) (Math.random() * 30);
        randomNumber = rand;
    }

    public void introduction(){
        System.out.println("Welcome to 'Who Wants to Be a Millionaire!' This Java-based game will challenge you with a series of questions offering one lifeline to eliminate two options and boost your chances of answering correctly! Have fun!");
    }
}

