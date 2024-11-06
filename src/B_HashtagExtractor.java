/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    } //psvm

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    } //constructor

    public void extractHashtags(String post) {
        /* TODO: your code goes here */

        try {
            String[] words = post.split(" "); //split functions splits a String into an array of Strings
            // regex defines the separators where the string is split

            for (String postWord : words){  //where postWord is each individual word

                if (postWord.startsWith("#")){

                    System.out.println("Hashtag: " + postWord + " and " + postWord);
                    //int index = post.indexOf("#");
                }

                //why isn't catching the "#coding" ???
                //also, neither indexOf() nor substring() are working to parse

            }

        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

    }

}
