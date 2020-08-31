package inheritance;

public class Nokia1100 extends PreNokia1100 {
   public static void main(String[] args) {
      PreNokia1100 preNokia1100 = new PreNokia1100() {
         @Override
         public void camera() {
            System.out.println("We can take photo.");
         }
      };
      preNokia1100.makeCall();
      preNokia1100.sendText();
      preNokia1100.contactList();
      preNokia1100.hangout();
      preNokia1100.camera();
   }

   public void photoGallery() {
      System.out.println("We can save our photo here.");
   }

   @Override
   public void camera() {

   }
}


    /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     **/


