import java.util.ArrayList;

public class Database
{
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        cds = new ArrayList<CD>();
        dvds = new ArrayList<DVD>();
    }

    /**
     * Add a CD to the database.
     * @param theCD The CD to be added.
     */
    public void addCD(CD theCD)
    {
        cds.add(theCD);
    }
    
    /**
     * Add a DVD to the database.
     * @param theDVD The DVD to be added.
     */
    public void addDVD(DVD theDVD)
    {
        dvds.add(theDVD);
    }

    /**
     * Print a list of all currently stored CDs and DVDs to the
     * text terminal.
     */
    public void list()
    {
        // print list of CDs
        for(CD cd : cds) {
            cd.print();
            System.out.println();   // empty line between items
        }

        // print list of DVDs
        for(DVD dvd : dvds) {
            dvd.print();
            System.out.println();   // empty line between items
        }
    }
}