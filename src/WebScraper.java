import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static String[] toStringArray(String input) {
        String[] wordsArray = input.split("\\s+");
        return wordsArray;
    }

    public static int wordCount(String s) {
        String[] arrayWords = toStringArray(s);
        int wordCount =- 0;
        wordCount = arrayWords.length;
        return wordCount;
    }

    public static int reoccur(String s, String wordToFind) {
        String[] arrayWords = toStringArray(s);
        int reoccurs = 0;
        for (String x: arrayWords) {
            if (x.equalsIgnoreCase(wordToFind)) {
                reoccurs ++;
            }
        }
        return reoccurs;
    }

    public static void main(String[] args) {
        System.out.print(wordCount(urlToString("http://erdani.com/tdpl/hamlet.txt")));
        System.out.print(reoccur(urlToString("http://erdani.com/tdpl/hamlet.txt")), "hi");
    }
}
