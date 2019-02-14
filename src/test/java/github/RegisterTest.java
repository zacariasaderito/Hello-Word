package github;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegisterTest {

    @Test
    public void readName()
    {
        Register register = new Register();
        String name = "Aderito";
        Assert.assertEquals("Aderito", register.getName(name));

    }

    @Test
    public void readSurname()
    {
        Register register = new Register();
        String surname = "Zacaria";
        Assert.assertEquals("Zacarias", register.getSurname(surname));
    }

}
