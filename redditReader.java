import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
public class redditReader {
		
		String fileToAnalyze;
		
		redditReader()
		{
			
			fileToAnalyze="";
			
		}	
		
		void getPostsReddit(String fileToRead, String keyword1)
		{
			redditPosts [] theDonaldPosts=new redditPosts[6466];
			
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				int postCounter=0;
				while ((line=myBufferReader.readLine())!=null)
				{
					line=myBufferReader.readLine();
					theDonaldPosts[postCounter]=new redditPosts(line);
					postCounter+=1;
				
					String lineToAnalyzeLowerCase=line.toLowerCase();
					
					if (lineToAnalyzeLowerCase.contains(keyword1)) {
					
						
						System.out.println(postCounter +": " +line);
					}
					
					else
					{
						;
					}
					
						
					
					
					
				}
				
				
				
			}
			catch (Exception ex)
			{
				System.out.println("I don't think I was able to find your file");
			}
			
			
			
		}
		
		//
		void getAuthorReddit(String fileToRead, int linenumber)
		{
			redditAuthor [] theDonaldAuthors=new redditAuthor[6466];
			
			if (linenumber>=0 && linenumber<=6466)
			{
			
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				int postCounter=0;
				while ((line=myBufferReader.readLine())!=null)
				{
					line=myBufferReader.readLine();
					theDonaldAuthors[postCounter]=new redditAuthor(line);
					postCounter+=1;
				
								
					
				}
				
				
				
			}
			catch (Exception ex)
			{
				System.out.println("I don't think I was able to find your file");
			}
			
			System.out.println("The author of this post is " +theDonaldAuthors[linenumber].author);
			}
			
			else
			{
				System.out.println("I'm sorry. You must have picked a line number that doesn't exist.");
			}
		}
		
		
		
		//
		void getUpvotesReddit(String fileToRead, int linenumber)
		{
			redditUpvotes [] theDonaldUpvotes=new redditUpvotes[6466];
			
			if (linenumber>=0 && linenumber<=6466)
			{
			
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				int postCounter=0;
				while ((line=myBufferReader.readLine())!=null)
				{
					line=myBufferReader.readLine();
					theDonaldUpvotes[postCounter]=new redditUpvotes(line);
					postCounter+=1;
				
								
					
				}
				
				
				
			}
			catch (Exception ex)
			{
				System.out.println("I don't think I was able to find your file");
			}
			
			System.out.println("The score of this post is: " +theDonaldUpvotes[linenumber].upvotes);
			}
			
			else
			{
				System.out.println("I'm sorry. You must have picked a line number that doesn't exist.");
			}
		}
		
		
		//
		void getCommentsReddit(String fileToRead, int linenumber)
		{
			redditComments [] theDonaldComments=new redditComments[6466];
			
			if (linenumber>=0 && linenumber<=6466)
			{
			
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				int postCounter=0;
				while ((line=myBufferReader.readLine())!=null)
				{
					line=myBufferReader.readLine();
					theDonaldComments[postCounter]=new redditComments(line);
					postCounter+=1;
				
								
					
				}
				
				
				
			}
			catch (Exception ex)
			{
				System.out.println("I don't think I was able to find your file");
			}
			
			System.out.println("The number of comments on this post is: " +theDonaldComments[linenumber].comments);
			}
			
			else
			{
				System.out.println("I'm sorry. You must have picked a line number that doesn't exist.");
			}
		}
		
		//

	}

	
