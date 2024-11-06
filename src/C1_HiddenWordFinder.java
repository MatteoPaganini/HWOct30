/***
 * Problem: You are given a long string containing a hidden word.
 * Write a function that finds and prints
 * the word hidden between two markers ("start" and "end").
 * Expected output: Hidden word: Hello
 */

public class C1_HiddenWordFinder {

    public static void main(String[] args) {
        C1_HiddenWordFinder c = new C1_HiddenWordFinder();
    }

    public C1_HiddenWordFinder() {
        String sentence = "This is a test startHelloend string.";
        findHiddenWord(sentence);  // Output: Hidden word: Hello
    }

    public void findHiddenWord(String sentence) {
        /* TODO: your code goes here */

        try {
            int startIndex = sentence.indexOf("start");  // Returns the position of "start"
            int endIndex = sentence.indexOf("end");  //returns position of "end"

            if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) { //if "start" and "end" are present, and "start" comes before "end," then...

                String hiddenWord = sentence.substring(startIndex, endIndex); //define hiddenWord as substring() function of predefined "start" and "end" indexes
                System.out.println("Hidden word: " + hiddenWord); //print text and hiddenWord

                //how do I get rid of "start" before "Hello"???

            } else {
                System.out.println("Failed");
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

    }

}
