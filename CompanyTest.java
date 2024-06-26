

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    Company company;
    User client1,client2,seller1,seller2;
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
        
    }
    
    @Test
    public void testConstructor(){
         assertNotNull(company.getClients());
         assertNotNull(company.getSellers());
    }
    
    @Test
    public void testRegisterClient(){
        assertTrue(company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClients(){
        assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull(){
        assertTrue(company.registerClient(null));
    }
    
    @Test
    public void testRegisterSeller(){
        assertTrue(company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellers(){
        assertTrue(company.registerSeller(seller1));
        assertTrue(company.registerSeller(seller2));
    }
    
    @Test
    public void testRegisterSellerDuplicate(){
        assertTrue(company.registerSeller(seller1));
        assertTrue(company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellerNull(){
        assertTrue(company.registerSeller(null));
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        this.company=new Company();
        this.client1=new User("José Manuel ","911111111","zemanel@yahoo.com");
        this.client2=new User("António Francisco","922222222","tochico@hotmail.com");
        this.seller1=new User("Fernando Fernandes","966777101","fefe@remax.pt");
        this.seller2=new User("Rodrigo Rodrigues","966777152","roro@remax.pt");
        /*
        this.company.registerClient(client1);
        this.company.registerClient(client2);
        this.company.registerSeller(seller1);
        this.company.registerSeller(seller2);
        */
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
