public class rpg
{
    public static void main (String args [])
    {
        new rpg ();
    }

    public rpg ()
    {
        //declaring each points variable, each one assosiates with one of the challenges
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        int p5=0;
        int p6=0;
        int totalpts=0;

        //creating a while loop which will keep repeating the game if the user wants to play again
        char again = 'y';
        while (again == 'y')
        {
            /*
             * The ASCII Art was very distorted, this is how it was suposed to look (I commented it out):

            System.out.println ("                                         _ __ ");
            System.out.println ("         ___                             | '  \ ");
            System.out.println ("    ___  \ /  ___         ,'\_           | .-. \        /| ");
            System.out.println ("    \ /  | |,'__ \  ,'\_  |   \          | | | |      ,' |_   /| ");
            System.out.println ("  _ | |  | |\/  \ \ |   \ | |\_|    _    | |_| |   _ '-. .-',' |_   _ ");
            System.out.println (" // | |  | |____| | | |\_|| |__    //    |     | ,'_`. | | '-. .-',' `. ,'\_ ");
            System.out.println (" \\_| |_,' .-, _  | | |   | |\ \  //    .| |\_/ | / \ || |   | | / |\  \|   \ ");
            System.out.println ("  `-. .-'| |/ / | | | |   | | \ \//     |  |    | | | || |   | | | |_\ || |\_| ");
            System.out.println ("    | |  | || \_| | | |   /_\  \ /      | |`    | | | || |   | | | .---'| | ");
            System.out.println ("    | |  | |\___,_\ /_\ _      //       | |     | \_/ || |   | | | |  /\| | ");
            System.out.println ("    /_\  | |           //_____//       .||`      `._,' | |   | | \ `-' /| | ");
            System.out.println ("         /_\           `------'        \ |              `.\  | |  `._,' /_\ ");
            System.out.println ("                                        \|                   `.\ ");             
             */

            System.out.println ("                                         _ __ ");
            System.out.println ("         ___                             | '  \\ ");
            System.out.println ("    ___  \\ /  ___         ,'\\_         | .-. \\        /| ");
            System.out.println ("    \\ /  | |,'__ \\  ,'\\_  |   \\      | | | |      ,' |_   /| ");
            System.out.println ("  _ | |  | |\\/  \\ \\ |   \\ | |\\_|    | |_| |   _ '-. .-',' |_   _ ");
            System.out.println (" // | |  | |____| | | |\\_|| |__     //  |     | ,'_`. | | '-. .-',' `. ,'\\_ ");
            System.out.println (" \\_| |_,' .-, _  | | |   | |\\ \\  //  .| |\\_/ | // \\ || |   | | / |\\  \\|   \\ ");
            System.out.println ("  `-. .-'| |/ / | | | |   | | \\ \\//    | |     | | | || |   | | | |_\\ || |\\_| ");
            System.out.println ("    | |  | || \\_| | | |   /_\\  \\//    | |`    | | | || |   | | | .---'| | ");
            System.out.println ("    | |  | |\\___,_\\ /_\\ _     //      | |     | \\_/ || |   | | | |  /\\| | ");
            System.out.println ("    /_\\  | |           //_____//       .||`      `._,' | |   | | \\ `-' /| | ");
            System.out.println ("         /_\\           `------'       \\ |              `.\\  | |  `._,' /_\\ ");
            System.out.println ("                                        \\|                   `.\\ ");             

            System.out.println ("WELCOME TO THE HARRY POTTER GAME!\n");
            //a backstory of the character for the user to read if they're unfamiliar with the Harry Potter series
            System.out.println ("You: Harry Potter are known as “The Boy Who Lived” because Voldemort came "); 
            System.out.println ("to your house at Godric’s Hollow when you were about a year old. He attacked");
            System.out.println ("and managed to kill both of your parents (James and Lily Potter). However, ");
            System.out.println ("something about you had stopped him that night. People say that some of his ");
            System.out.println ("powers transferred to you, and that's why he became very weak and wasn't able ");
            System.out.println ("to kill you. All he managed to do was give you a lightning bolt shaped scar ");
            System.out.println ("on your forehead. Later that night, Professor Dumbledore and Professor McGonagall ");
            System.out.println ("placed you on the doormat of your uncle Vernon and aunt Petunia’s house (your ");
            System.out.println ("mom’s sister’s family). You’ve been living there ever since that night, they ");
            System.out.println ("treat you terribly but you have no other choice because they are the only family ");
            System.out.println ("you have left.");

            //back to the present story
            System.out.println ("\nYou are 11 years old, you just got your letter to Hogwarts School of ");
            System.out.println ("Witchcraft and Wizardry. This is the best thing that has ever happened to ");
            System.out.println ("you because now, you get the chance to leave your aunt and uncle's house for ");
            System.out.println ("the entire year, but you have to return for summer vacation. Your aunt ");
            System.out.println ("and uncle don't want you to leave because they don't want you to become ");
            System.out.println ("part of the wizarding world and turn into a “freak” like your parents. ");
            System.out.println ("Of course, your decision is to still go to Hogwarts!");

            System.out.println ("\nNow that you'll be a student at Hogwarts, you need to get the necessary ");
            System.out.println ("materials. You'll need a wand, wizard robes, textbooks, an animal of your ");
            System.out.println ("choice (an owl, cat or a toad), etc. You'll need to go to Diagon Alley. ");
            System.out.println ("Hagrid (Hogwarts' Gamekeeper), will assist you since it's your first time ");
            System.out.println ("going there. The first thing on your list is a wand.\n");

            //More ASCII Art
            System.out.println ("                /\\                                       ");
            System.out.println ("    /vvvvvvvvvvvv \\--------------------------------------");
            System.out.println ("    `^^^^^^^^^^^^ /=====================================");
            System.out.println ("                \\/                                      ");


            //calling the method for the magic 8 ball program, the user will get selected a random wand to feel like they're a real Hogwarts student
            magic8ball ();

            System.out.println ("\nNow you have all of your materials and are now ready to go to Hogwarts! You're at ");
            System.out.println ("Kings Cross station in London and it’s your first time going through the barrier for ");
            System.out.println ("platform 9 ¾. You hear a lady talking about Hogwarts, and you follow her and her ");
            System.out.println ("children. She helps you get through the barrier, and you befriend her children: Ron, ");
            System.out.println ("Fred and George Weasley. You are on the Hogwarts Express with Ron, who is also a ");
            System.out.println ("first year student.");

            System.out.println ("\nOn the train to Hogwarts, you meet Hermione Granger who comes looking for");
            System.out.println ("Neville Longbottom’s pet toad. She sees that Ron is trying to do some magic, ");
            System.out.println ("she is a know-it-all and has already mastered all of the spells in the textbook.");
            System.out.println ("She starts testing you and Ron on some basic arithmetic questions.");

            //calling the first math question method (one of the challenges for the user to complete)
            p1=mathQ ();

            System.out.println ("\nWhen you arrive at Hogwarts, you and all the other first years are following ");
            System.out.println ("Professor McGonagall to the Great Hall where you will be sorted into your Hogwarts ");
            System.out.println ("houses. Professor McGonagall says that the houses are Gryffindor, Hufflepuff, ");
            System.out.println ("Ravenclaw and Slytherin. Professor Dumbledore introduces some of the other professors ");
            System.out.println ("(Professor Snape, Professor Flitwick, Madam Hooch, Professor Quirrell). Out of the ");
            System.out.println ("corner of your eye, you see Professor Snape (the Head of Slytherin house) looking at ");
            System.out.println ("you with a smirk on his face. Try to steer clear of him, he seems suspicious. It’s your ");
            System.out.println ("turn to put on the sorting hat, it will decide which house you belong in. The sorting ");
            System.out.println ("hat says: GRYFFINDOR! Ron and Hermione also got sorted into Gryffindor.");

            System.out.println ("\nYou and the other Gryffindors follow the Prefect of Gryffindor: Percy Weasley, to the ");
            System.out.println ("Gryffindor Common Room.");

            //calling the unscramble method (a game where the user has to unsramble letters)
            p2=unscramble();

            System.out.println ("You and Ron are sharing a dormitory with Seamus Finnigan and Dean Thomas. The next ");
            System.out.println ("morning, you meet Ron and Hermione down at the Great Hall for breakfast.");

            System.out.println ("\nYour first class of the day is “Flying” with Madam Hooch. When you get on the ");
            System.out.println ("broomstick and start flying, it feels like you've been doing it for ages, it’s ");
            System.out.println ("a lot of fun! At the end of the lesson, Professor McGonagall comes up to you and ");
            System.out.println ("starts talking to you because she says she observed your flying class and that ");
            System.out.println ("you have real talent. You will be the Gryffindor Quidditch Team’s new seeker!\n ");

            System.out.println ("After one of the quidditch practices, you, Ron and Hermione are just strolling around ");
            System.out.println ("Hogwarts. You see some of the teachers gathered around talking about You-Know-Who, ");
            System.out.println ("you realize that they're talking about Voldemort! You also hear something about a ");
            System.out.println ("three-headed dog and the philosopher's stone. This is very strange, you should leave ");
            System.out.println ("before anyone sees you!");

            System.out.println ("\nYou are all suspicious and extremely curious about what the teachers were talking about.");
            System.out.println ("Hermione remembers that they talked about the philosopher's stone and she recalls reading");
            System.out.println ("about it, it’s a stone that transforms any metal into pure gold. It produces the ultimate ");
            System.out.println ("Elixir of Life, anyone who drinks it will become immortal. This is exactly what Voldemort ");
            System.out.println ("must want! And that's what the three-headed dog must be guarding.\n ");

            System.out.println ("You, Ron and Hermione make a plan to sneak out at night to see the stone and stop ");
            System.out.println ("Voldemort from getting it. You see that Neville is standing near the door that you ");
            System.out.println ("need to go through.");

            //calling the first multiple choice method (one of the challenges for the user to complete)
            p3=multipleChoice ();

            System.out.println ("You entered through the door and are now standing in front of a sleeping three-headed ");
            System.out.println ("dog, and under its leg, there is a small trap door. You carefully lift the dog's leg ");
            System.out.println ("and enter through the trap door. Suddenly, now you're trapped in the devil's snare ");
            System.out.println ("(a plant that essentially has the magical ability to strangle anyone that surrounds it).\n ");

            //calling the riddle method (one of the challenges for the user to complete)
            p4=riddle ();

            System.out.println ("\nAfter you exit that room, there is a house elf guarding the door to a different ");
            System.out.println ("room. It asks you for the answer to a math question.");

            //calling the math question method (one of the challenges for the user to complete)
            p5=mathQ2 ();

            System.out.println ("\nIn the final room, you see Professor Quirrell staring at you with an evil smirk ");
            System.out.println ("on his face. Professor Quirrell says he has been plotting to kill you and that ");
            System.out.println ("Professor Snape was actually trying to save you! You soon find out that Professor ");
            System.out.println ("Quirrell has Voldemort’s face on the back of his head (underneath his turban).");
            System.out.println ("You must pull out all your best spells and tricks to put an end to Voldemort and ");
            System.out.println ("Professor Quirrel, once and for all.\n");

            //calling the second multiple choice method(one of the challenges for the user to complete)
            p6=multipleChoice2 ();

            //calculates user's total score
            totalpts = p1+p2+p3+p4+p5+p6;

            //prints the user's total score after all 5 challenges
            System.out.println("TOTAL SCORE: "+totalpts);

            //asking the user if they would like to play again
            again = IBIO.inputChar ("\nDo you want to play again? (y/n) \n");
        }
    }

    public void magic8ball ()
    //the magic 8 ball will randomly selects a wand for the user
    {
        int num = (int) (Math.random () * 10) + 1;
        System.out.println ("\nThe Magic 8 ball Wand Selector says that you have: \n");
        if (num == 1)
            System.out.println ("An 11” Holly wand with a Phoenix feather!");
        else if (num == 2)
            System.out.println ("A 10 ¾” Vine wand with a dragon heartstring!");
        else if (num == 3)
            System.out.println ("A 10 ¼” Hornbeam wand with a dragon heartstring!");
        else if (num == 4)
            System.out.println ("A 10” Hawthorn wand with unicorn hair!");
        else if (num == 5)
            System.out.println ("A 14” Willow wand with unicorn hair!");
        else if (num == 6)
            System.out.println ("A 12” Ash wand with unicorn hair!");
        else if (num == 7)
            System.out.println ("A 13” Cherry wand with unicorn hair!");
        else if (num == 8)
            System.out.println ("A 10 ¼” Cypress wand with unicorn hair!");
        else if (num == 9)
            System.out.println ("A 13 ½” Yew wand with a Phoenix feather!");
        else
            System.out.println ("An 11” Mahogany wand (very pliable)!");
    }

    public int mathQ ()
    //first challenge, answer this math question correctly and 1 point will be added to the user's final score
    {
        int question = IBIO.inputInt ("\nThis is your first challenge, what is 6÷2(1+2)? ");
        int points = 0;
        if (question==9)
        {
            System.out.println ("\nCorrect!");
            //adds a point if the answer is correct
            points++;
        }

        else 
            System.out.println ("\nIncorrect.");
        //no points will be added if it's incorrect

        return points++;
    }

    public int unscramble ()
    //second challenge, unscramble the letters and a point will be added to the user's final score
    {
        System.out.println ("\nEvery house's common room has a password.");
        String word = IBIO.inputString ("\nUnscramble the following letters to figure out the password: dlnoon ");
        int points = 0;
        if (word.toLowerCase().equals ("london"))
        {
            System.out.println ("\nCorrect! You can go onto the next challenge!\n");
            //adds a point if the answer is correct
            points++;
        }

        else

            System.out.println ("\nIncorrect.\n");
        //no points will be added if it's incorrect

        return points;
    }

    public int multipleChoice ()
    //first multiple choice question, user has to type in a number to represent which choice of spell they would 
    //use to get themselves out of this situation. 1 point will be added to the final score if answered correctly 
    {
        System.out.println ("\nThis is your second challenge, you must use one of these spells you learned in ");
        System.out.println ("Charms class to get past Neville without telling him the plan and getting caught.");
        System.out.println ("1. Alohomora (opens doors)");
        System.out.println ("2. Lumos (flashlight on your wand)");
        System.out.println ("3. Petrificus Totalus (temporarily paralyses someone)\n");
        int choice = IBIO.inputInt ("Which spell will you choose? (1,2,3) ");
        int points = 0;
        if (choice==3)
        {
            System.out.println ("\nCorrect! You need to use the Petrificus Totalus spell.\n");
            //adds a point if the answer is correct
            points++;
        }

        else
            System.out.println ("\nIncorrect.\n");
        //no points will be added if it's incorrect

        return points;
    }

    public int riddle ()
    //answer this riddle correctly, and 1 point will be added to the user's final score
    {
        System.out.println ("This is your third challenge, you must answer a riddle to get freed from the arms ");
        System.out.println ("of the devil's snare.\n");
        int points = 0;
        String riddle = IBIO.inputString ("RIDDLE: What has hands but cannot clap? ");
        if (riddle.toLowerCase().equals ("clock"))
        {
            System.out.println ("\nCorrect, great job!");
            //adds a point if the answer is correct
            points ++;
        }

        else 
            System.out.println ("\nIncorrect.");
        //no points will be added if it's incorrect

        return points;
    }

    public int mathQ2 ()
    //answer this simple math question and if done correctly, 1 point will be added to the user's final score
    {
        System.out.println ("\nThis is your fourth challenge, you must answer this math question correctly.");
        int points = 0;
        String question2 = IBIO.inputString ("Math Question: What is 10% of 20? ");
        if (question2.equals ("2"))
        {
            System.out.println ("\nCorrect, great job!");
            //adds a point if the answer is correct
            points ++;
        }

        else
            System.out.println ("\nIncorrect.");
        //no points will be added if it's incorrect

        return points;
    }

    public int multipleChoice2 ()
    //second multiple choice question, if answered correcly, 1 point will be added to the user's final score
    {
        System.out.println ("This is your final challenge! Use all of your magical powers, spells and abilities");
        System.out.println ("to destroy Voldemort and Professor Quirrel.");
        System.out.println ("1. Avada Kedavra (powerful spell which instantly kills the victim)");
        System.out.println ("2. Revelio (spell to reveal intruders and imposters)");
        System.out.println ("3. Accio (a charm that allows the caster to summon an object)\n");
        int choice = IBIO.inputInt ("Which spell will you choose? (1,2,3) ");
        int points = 0;
        if (choice==1)
        {
            System.out.println ("\nCorrect, and congratulations, you defeated Voldemort!\n");
            //adds a point if the answer is correct
            points++;
        }   
        else
            System.out.println ("\nIncorrect.\n");
        //no points will be added if it's incorrect

        return points;
    }

}