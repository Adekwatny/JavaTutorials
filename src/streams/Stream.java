package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Stream {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader in = null;
		PrintWriter out = null;
		
		try
		{
			in = new BufferedReader(new FileReader("ttx.txt"));
			out = new PrintWriter(new FileWriter("tttx.txt"),true);
			
			String i;
			while((i = in.readLine()) !=null)
			{
				out.println(i);
			}
		}
		finally
		{
			if (in != null)
			{
				in.close();
				
			}
			if (out != null)
			{
				out.close();
			}
		}
	}

}
