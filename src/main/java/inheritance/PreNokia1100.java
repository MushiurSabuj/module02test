package inheritance;

public abstract class PreNokia1100 implements SymbianPhone {

    @Override
    public void sendText() {
        System.out.println("We can send a text message to our friends using sendText method.");

    }

    @Override
    public void makeCall() {
        System.out.println("User can make a phone call");
    }

    @Override
    public void contactList() {
        System.out.println("We can Save user contact number in here");
    }
    public void hangout(){
        System.out.println("We can do hangout here using this phone.");
    }

    public abstract void camera();
}

    /**
     *
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     *
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     *
     *
     **/

