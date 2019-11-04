/** Scott Craig
 * Template Design Pattern Project
 * CSCE 247 Portia Plante
 * 04 1200 Nov2019
 *
 * This project utilizes the template design pattern to implement the algorithm to build a house
 * It takes nothing in from the user and utilizes an instructor supplied driver
 * The UML had methods improperly categorized as abstract, so shared code in the installDrywall, addElectrical, and
 *      addPlumbing has been properly encapsulated, while createFrame has been abstracted.
 */

public abstract class House {

    /**
     * The collection of methods used to output a series a texts describing building a house
     */
    public final void buildHouse(){
        prepFoundation();
        createFrame();
        installDrywall();
        addWindows();
        addElectrical();
        addPlumbing();
    }

    public void prepFoundation(){System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");}
    public abstract void  createFrame();
    public void installDrywall(){System.out.println("Drywall: Creating the interior walls.");}
    public void addWindows(){System.out.println("Windows: Putting in the glass for the windows.");}
    public void addElectrical(){System.out.println("Electrical: Running all the wires and hooking up the power.");}
    public void addPlumbing(){System.out.println("Plumbing: Letting water run through the house.");}
}
