import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Date;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class StatPAL {
    private final static int CELL_AUTHOR_AFFILIATION = 3;
    
    //listing the column numbers
    private final static int CELL_AUTHOR_NAMES = 2;
    private final static int CELL_PROHIBITION_START_DATE = 6;
    private final static int CELL_PROHIBITION_END_DATE = 7;
    private final static int CELL_PAPAER_LIST = 4;

    private String datapath;
    protected Workbook workbook;
    protected ArrayList<String> affiliations;
    protected ArrayList<String> countries;

    //Arraylist to store prohibited names
    protected ArrayList<String> prohibitedauthornames;

    //Arraylist to store start prohibition date
    protected ArrayList<Date> prohibitionstartdate;

    //Arraylist to store end prohibition date
    protected ArrayList<Date> prohibitionenddate;

    //Arraylist to store papertitles
    protected ArrayList<String> paperlist;

    public StatPAL(String path) {
        this.datapath = path;
        this.workbook = null;
        this.affiliations = null;
        this.countries = null;

        //initialise all the arraylist
        this.prohibitedauthornames = null;
        this.prohibitionstartdate = null;
        this.prohibitionenddate = null;
        this.paperlist = null;
    }

    public boolean start() {
        try {
            this.workbook = new XSSFWorkbook(this.datapath);
            this.affiliations = new ArrayList<String>(1024);
 
            //assigning minimum size for all the arraylist
            this.prohibitedauthornames = new ArrayList<String> (1024);
            this.paperlist = new ArrayList<String> (1024);
            this.prohibitionstartdate = new ArrayList<Date> (1024);
            this.prohibitionenddate = new ArrayList<Date> (1024);
            

            return true;
        } catch (IOException ex) {}

        return (this.workbook != null);
    }

    public void finish() {
        try {
            this.workbook.close();
        } catch (IOException ex) {} 
    }

    public void analyze() {
        if (this.workbook.getNumberOfSheets() == 0) return;

        Iterator<Sheet> sheets = this.workbook.sheetIterator();
        while (sheets.hasNext()) {
            this.analyzeSheet(sheets.next());
        }
    }

    protected void analyzeSheet(Sheet s) {
        assert(s != null);
        Iterator<Row> rows = s.iterator();
        while (rows.hasNext()) {
            this.analyzeRow(rows.next());
        }
    }

    protected void analyzeRow(Row r) {
        assert(r != null);
        int ncells = r.getPhysicalNumberOfCells();
        if (ncells < 9) return;
        
        Cell caf = r.getCell(CELL_AUTHOR_AFFILIATION);
        if (caf.getCellType() != Cell.CELL_TYPE_STRING) return;
        String saf = caf.getStringCellValue();
        
        this.affiliations.add(saf);

        //Reading prohibited nameslist and storing them
        caf = r.getCell(CELL_AUTHOR_NAMES);
        if (caf.getCellType() != Cell.CELL_TYPE_STRING) return;
        String names = caf.getStringCellValue();
        this.prohibitedauthornames.add(names);

        //Reading and storing paper title for each author
        caf = r.getCell(CELL_PAPAER_LIST);
        if (caf.getCellType() != Cell.CELL_TYPE_STRING) return;
        String topic = caf.getStringCellValue();
        this.paperlist.add(topic); 

        //reading and storing prohibition start date
        caf = r.getCell(CELL_PROHIBITION_START_DATE);
        if (caf.getCellType() != Cell.CELL_TYPE_NUMERIC) return;
        Date probstartdate = caf.getDateCellValue();
        this.prohibitionstartdate.add(probstartdate); 

        //reading and storing prohibition end date
        caf = r.getCell(CELL_PROHIBITION_END_DATE);
        if (caf.getCellType() != Cell.CELL_TYPE_NUMERIC) return;
        Date probenddate = caf.getDateCellValue();
        this.prohibitionenddate.add(probenddate); 
    }

    
    public ArrayList<String> getAffilications() {
        return this.affiliations;
    }

    public void collectCountryNames() {
        if (this.affiliations != null) {
            this.countries = new ArrayList<String>(32);
            for (String saf: this.affiliations) {
                String[] parts = saf.split(",");
                int countryIndex = parts.length - 1;
                this.countries.add(parts[countryIndex].trim());
            }
        }
    }
}
