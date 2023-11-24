package week1.day1.task2;

public class Browsers {
	
	

	 public String launchbrowser(String BrowserName) { // acces modifier returnvalue method name
		
		 System.out.println("The Browser is launched successfully");
         return BrowserName;
	 }
	 
	 public String loadUrl (String loadUrl) {
			
		 System.out.println("Application URL Loaded successfully");
         return loadUrl;
	 }
	 public static void main(String[] args) {
		 Browsers display=new Browsers();
         display.launchbrowser("Firefox");
		 display.loadUrl("www.gmail.com");
		
	}
         
        

         
     

     
       
       

    

}
