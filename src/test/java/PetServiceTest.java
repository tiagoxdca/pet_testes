import dao.PetDAO;
import org.junit.Assert;
import org.junit.Test;
import services.PetService;

public class PetServiceTest {
    @Test
    public void testServicePet(){
        PetService petService = new PetService(new PetDAO());
        Assert.assertNotNull(petService);
    }
}
