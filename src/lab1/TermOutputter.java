package lab1;

/**
 * Implementation of an "outputter" leveraging System.out
 * @author Jared Mallas
 * @version 1.0
 */
public class TermOutputter implements Outputter
{

    @Override
    public void report(String text)
    {
        System.out.println(text);
    }
}
