import java.net.URLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import java.io.*;

public class URLExample
{
   public static void main(String[] args)
   {
      URL url = null;
      URLConnection connection = null;
      try//cannot do try with resources
      {
         URI uri = new URI("https://www.daltonstate.edu");
         url = uri.toURL();
         connection = url.openConnection();
      }
      catch(URISyntaxException e)
      {
         System.out.printf("Invalid URI Syntax: %s", e.getMessage());
         return;
      }
      catch(MalformedURLException e)
      {
         System.out.printf("Bad URL: %s", e.getMessage());
         return;
      }
      catch(IOException e)
      {
         System.out.printf("IO Exception: %s", e.getMessage());
         return;
      }
      
      String contentType = connection.getContentType();
      System.out.println(contentType);
      
      if(contenttype != null && !contentType.startsWith("text"))
      {
         System.out.println("Incorrect content type");
         return;
      }
      
      try(InputStream is = connection.getInputStream();
         InputStreamReader isr = new InputStreamReader(is);
         BufferedReader br = new BufferedReader(isr))
      {
      String line = br.readLine();
      while(line != null)
      {
         System.out.println(line);
         line = br.readLine
      }
   }
   catch(IOException e)
   {
      System.out.printf(
}