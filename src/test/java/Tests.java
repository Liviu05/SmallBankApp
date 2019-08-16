import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class Tests {

    ArrayList<ContBancar> contAlex = new ArrayList<ContBancar>();


    @Test
    public void Test1Salariu() {

        contAlex.add(new Depunere(1, "Salariu luna mai", "20190505", 10));

        InterogareSold interogare = new InterogareSold(contAlex);
        System.out.println(interogare.getBalance());//
        Assert.assertEquals(10, interogare.getBalance());
    }


    @Test
    public void Test2Demo() {

        contAlex.add(new Depunere(2, "Salariu luna mai", "20190505", 15));

        InterogareSold interogare = new InterogareSold(contAlex);
        System.out.println(interogare.getBalance());//
        Assert.assertEquals(15, interogare.getBalance());
    }

    @Test
    public void Test3Demo() {
        contAlex.add(new Depunere(3, "Salariu luna iunie", "20190615", 25));

        InterogareSold interogare = new InterogareSold(contAlex);
        System.out.println(interogare.getBalance());
        Assert.assertEquals(25, interogare.getBalance());

    }
    @Test
    public void Test4demo() {

        contAlex.add(new Depunere(4, "Incasare chirie transa 1", "20190620", 515));
        contAlex.add(new Depunere(4, "Incasare chirie transa 2", "20190620", 100));

        contAlex.add(new Retragere(5, "Plata rata iunie", "2019/06/22", 300, "plata rata"));

        InterogareSold interogare = new InterogareSold(contAlex);
        System.out.println(interogare.getBalance());
        Assert.assertEquals(315, interogare.getBalance());
    }
}
