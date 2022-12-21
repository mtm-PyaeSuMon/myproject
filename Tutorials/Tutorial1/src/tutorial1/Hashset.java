package tutorial1;

import java.util.HashSet;

/**
 * <h2>HashsetClass</h2>
 * <p>
 * Process for DisplayingHashset
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class Hashset {

    /**
     * <h2>main
     * <p>
     *
     * </p>
     *
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        HashSet<String> language = new HashSet<String>();
        language.add("C#");
        language.add("Java");
        language.add("PHP");
        language.add("Java");
        language.add("Ruby");
        System.out.println(language.contains("C#"));
        System.out.println(language);
        System.out.println(language.size());
        language.remove("PHP");
        System.out.println(language);
        language.clear();
        System.out.println(language);
    }
}
