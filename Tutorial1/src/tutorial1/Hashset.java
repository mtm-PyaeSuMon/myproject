package tutorial1;

import java.util.HashSet;

public class Hashset {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
