
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PropertyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PropertyTest
{
    Property property1;
    String description;
    /**
     * Construtor default para a classe de teste PropertyTest
     */
    public PropertyTest()
    {
        this.description = "T3 Monte Belo";
    }

    @Test
    public void testConstructor(){
        assertEquals(150000.0,property1.getPrice());
        assertEquals(this.description,property1.getDescription());
    }

    @Test
    public void testToString(){
        assertEquals("Descricao  : "+this.description+"\nPreco : 150000.0", property1.toString());
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        this.property1 = new Property(this.description,150000.0);
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
