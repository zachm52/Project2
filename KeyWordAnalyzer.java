import java.util.Scanner;

public class KeyWordAnalyzer {
	

		public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);	
			
			int loop=0;
			
			
			
			
			System.out.println("Hello! I am a Bot!");
			System.out.println("It is my job to help you analyze posts made in r/TheDonald.");
			System.out.println("I can provide information for over 6,000 posts.");
			while (loop == 0)
			{
			
			
			System.out.println("What key word would you like to search for?");
			
			
			String keyword1 = input.nextLine();
			
			
			
			System.out.println("Here are the posts containing the keyword you searched for: ");
			redditReader myreader=new redditReader();
			myreader.getPostsReddit("redditPosts.txt",keyword1);
			
			//
			System.out.println("Would you like more information on any of the posts?");
			
			String moreinfo = input.nextLine();
			if (moreinfo.equalsIgnoreCase("yes"))
			{
				
				System.out.println("What post number would you like more information on?");
				
				
				int linenumber = input.nextInt();
				
				
				
				
				redditReader myreader2=new redditReader();
				myreader2.getAuthorReddit("redditAuthors.txt",linenumber);
				
				redditReader myreader3=new redditReader();
				myreader3.getUpvotesReddit("redditUpvotes.txt",linenumber);
				
				redditReader myreader4=new redditReader();
				myreader4.getCommentsReddit("redditComments.txt",linenumber);
			
			}
			else
			{
				
			}
			
			
			
			System.out.println("Would you like to search for a different keyword?");
			
			
			String nothing = input.nextLine();
			String again = input.nextLine();
			
			if (again.equalsIgnoreCase("yes"))
			{
				loop=0;
			}
			else
			{
				loop=1;
			}
		
			
		
		}
		}
}

	
	
	
	
	

