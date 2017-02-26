import java.util.Random;
import java.util.*;

public class random21questions {

	static void randomquestion(String[] questionbank) {

		int maximum = questionbank.length;
		int min = 0;
		
		Random rn = new Random();
		int range = maximum - min + 1;
		int randomNum = rn.nextInt(range) + min;
		
		System.out.println(questionbank[randomNum]);
		
		
	}
	
	public static void main(String[] args) {
		
		String[] questions = {"Given the choice of anyone in the world, whom would you want as a dinner guest? Would you like to be famous? In what way?", 
		  "If you were to live to the age of 90 and retain either the mind or body of a 30-year-old for the last 60 years of your life, which would you want?",
		  "Do you have a secret hunch of how you will die?",
		  "For what in life do you feel most grateful?",
		  "If you could change anything about how you were raised, what would it be?",
		  "If you could wake up tomorrow having gained one quality or one ability, what would it be?",
		  "If a crystal ball could tell you the truth about yourself, your life, the future or anything else, what would you want to know?",
		  "What is the greatest accomplishment of your life?",
		  "What do you value most in a friendship?",
		  "If you knew that in one year you would die suddenly, would you change anything about the way you are now living?",
		  "Do you feel your childhood compared to most other people’s?",
		  "What do you wish you could share with most people?",
		  "When did you last cry?",
		  "What do you regret most?",
		  "Your house, containing everything you own.  After saving your loved ones and pets, you have time for one final dash to save any one item.  What would it be and why?",
		  "What would you wish you had more of?",
		  "What were any films or TVs shows that have left a lasting impression on you?",
		  "What is something that’s true that almost no one agrees with you on?",
		  "What do you believe is the true secret to success in the world?",
		  "What does it mean to be successful?",
		  "How weird are you?",
		  "Is there a book do you think everyone should read?",
		  "How lucky do you consider yourself?",
		  "What is something that really bothers you but most people don’t seem to mind?",
		  "What is something you love that most people don’t like?",
		  "What is something about yourself that you are working to improve?",
		  "What’s a memorable moment from your childhood?",
		  "What’s your favorite place in the entire world?",
		  "What do you look forward to the most every day?",
		  "What do you look forward to the least every day?",
		  "What are you afraid of the most?",
		  "What are you most excited for?",
		  "What's a weird habit of yours?",
		  "What’s one thing you like to do when you’re not working?  Why?"};

		randomquestion(questions);


	}

}
