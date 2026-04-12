class Speaker {
    // Method to speak a message
    public void speak(String message) {
        System.out.println("Speaker says: " + message);
    }

    //Overloaded method to speak a message with a volume level
    public void speak(String message, int volume) {
        System.out.println("Speaker says: " + message + "at volume " + volume);
    }

    // Overloaded method to speak a message in a specific language
    public void speak(String message, String language) {
        System.out.println("Speaker says: " + message + " in " + language);
    }
}

//calling above methods in main method
public class MethodOverloading{
    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        speaker.speak("Hello,World!");
        speaker.speak("Hello,World!",5);
        speaker.speak("Hello,World!","English");
    }
}
