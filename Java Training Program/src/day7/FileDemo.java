package day7;

import java.io.*;
public class FileDemo {
   public static void main(String[] args) {         
      //Specify the path of the file here
      File file = new File("newfile.txt");
      BufferedInputStream bis = null;
      FileInputStream  fis= null;
      FileOutputStream fos=null;
      String mycontent = "shailesh here";

      try
      {
          //FileInputStream to read the file
          fis = new FileInputStream(file);

          /*Passed the FileInputStream to BufferedInputStream
           *For Fast read using the buffer array.*/
          bis = new BufferedInputStream(fis);
          
          fos = new FileOutputStream(file);
          
          byte[] bytesArray = mycontent.getBytes();

    	  fos.write(bytesArray);
    	  fos.flush();

          /*available() method of BufferedInputStream
           * returns 0 when there are no more bytes
           * present in the file to be read*/
          while( bis.available() > 0 ){             	
              System.out.print((char)bis.read());
          }

       }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe); 
        }
        finally
        {
            try{
               if(bis != null && fis!=null)
               {
       	          fis.close();
                  bis.close();
               }      
             }catch(IOException ioe)
              {
                  System.out.println("Error in InputStream close(): " + ioe);
              }         
        }
   }    
}