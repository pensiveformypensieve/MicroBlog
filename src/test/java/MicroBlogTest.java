import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class MicroBlogTest {

    private final MicroBlog microBlog = new MicroBlog();
    
    @Test
    public void englishLanguageShort() {
        String expected = "Hi";
        assertEquals(expected, microBlog.truncate("Hi"));
    }

//    @Ignore("Remove to run test")
    @Test
    public void englishLanguageLong() {
        String expected = "Hello";
        assertEquals(expected, microBlog.truncate("Hello there"));
    }
    
//    @Ignore("Remove to run test")
    @Test
    public void germanLanguageShort_broth() {
        String expected = "brühe";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("brühe"));
    }

//    @Ignore("Remove to run test")
    @Test
    public void germanLanguageLong_bearCarpet_to_beards() {
        String expected = "Bärte";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("Bärteppich"));
    }
    
//    @Ignore("Remove to run test")
    @Test
    public void bulgarianLanguageShort_good() {
        String expected = "Добър";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("Добър"));
    }

//    @Ignore("Remove to run test")
    @Test
    public void greekLanguageShort_health() {
        String expected = "υγειά";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("υγειά"));
    }
    
//    @Ignore("Remove to run test")
    @Test
    public void mathsShort() {
        String expected = "a=πr²";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("a=πr²"));
    }

//    @Ignore("Remove to run test")
    @Test
    public void mathsLong() {
        String expected = "∅⊊ℕ⊊ℤ";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("∅⊊ℕ⊊ℤ⊊ℚ⊊ℝ⊊ℂ"));
    }
    
//    @Ignore("Remove to run test")
    @Test
    public void englishAndEmojiShort() {
        String expected = "Fly 🛫";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("Fly 🛫"));
    }
    
//    @Ignore("Remove to run test")
    @Test
    public void emojiShort() {
        String expected = "💇";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("💇"));
    }
    
//    @Ignore("Remove to run test")
    @Test
    public void emojiLong() {
        String expected = "❄🌡🤧🤒🏥";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("❄🌡🤧🤒🏥🕰😀"));
    }
    
//    @Ignore("Remove to run test")
    @Test
    public void royalFlush() {
        String expected = "🃎🂸🃅🃋🃍";
        System.out.println(expected);
        assertEquals(expected, microBlog.truncate("🃎🂸🃅🃋🃍🃁🃊"));
    }
}
