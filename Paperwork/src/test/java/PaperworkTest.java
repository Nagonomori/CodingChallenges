import org.example.paperwork.Paper;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PaperworkTest
{
    @Test
    public void Test()
    {
        final int five = 5;
        final int twentyFive = 25;
        assertThat(Paper.Paperwork(five, five), equalTo(twentyFive));
    }
}
