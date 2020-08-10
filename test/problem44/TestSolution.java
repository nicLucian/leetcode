package problem44;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    private Solution mSolution;

    @Before
    public void setup() {
        mSolution = new Solution();
    }

    @Test
    public void should_be_false() {
        String text = "aa";
        String pattern = "a";
        assertThat(false, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_true() {
        String text = "aa";
        String pattern = "*";
        assertThat(true, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_false1() {
        String text = "cb";
        String pattern = "?a";
        assertThat(false, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_true1() {
        String text = "adceb";
        String pattern = "*a*b";
        assertThat(true, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_true10() {
        String text = "";
        String pattern = "*a*";
        assertThat(false, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_true2() {
        String text = "ab";
        String pattern = "**?a*";
        assertThat(false, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_true20() {
        String text = "ab";
        String pattern = "**?a*";
        assertThat(false, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_true3() {
        String text = "b";
        String pattern = "*c?b";
        assertThat(false, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_true4() {
        String text = "";
        String pattern = "*c?b";
        assertThat(false, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_true5() {
        String text = "";
        String pattern = "";
        assertThat(true, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void should_be_true6() {
        String text = "ho";
        String pattern = "ho*";
        assertThat(true, equalTo(mSolution.isMatch(text, pattern)));
    }

    @Test
    public void testRemoveStar() {
        String pattern = "ho**";
        assertThat("ho*", equalTo(mSolution.removeDuplicateStar(pattern)));
    }

    @Test
    public void testRemoveStar1() {
        String pattern = "a*c?b";
        assertThat("a*c?b", equalTo(mSolution.removeDuplicateStar(pattern)));
    }
}
