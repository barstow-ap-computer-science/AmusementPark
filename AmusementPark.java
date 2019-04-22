import java.util.ArrayList;
/**
 * An AmusementPark. Has a name and some attractions.
 *
 * @4/22/2019
 */
public class AmusementPark
{
    private String name;
    private ArrayList<Attraction> attractions;

    public AmusementPark(String inputName)
    {
        name = inputName;
        attractions = new ArrayList<Attraction>();
    }

    public String getName()
    {
        return name;
    }

    public ArrayList getAttractions()
    {
        return attractions;
    }

    public void addAddtraction(Attraction attraction)
    {
        attractions.add(attraction);
    }
}
