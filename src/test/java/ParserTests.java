import org.testng.Assert;
import org.testng.annotations.Test;
import parser.XMLParser;

public class ParserTests {

    @Test
    public void validFileTest(){
        XMLParser xmlParser = new XMLParser("src/test/resources/valid.xml");
        try {
            xmlParser.parseDocument();
        } catch (Exception exception){
            Assert.fail("file should be parsed");
        }

    }
}
