
public class TestStatPAL {
	
    /*public void printCountries() {
        for (String c: this.countries) {
            System.out.println(c);
        }
    }*/

    public static void main(String[] args) {
        if (args.length < 1) return;
        GetStatCal stats = new GetStatCal(args[0]);
        stats.formatNames();
        stats.collectCountryNames();
        stats.getCountryCount();
        /*  palstat.collectCountryNames();
            palstat.printCountries();
	    }*/

        
    }
}
