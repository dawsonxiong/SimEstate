
public class Park extends Place {
    private double surfaceArea;
    private int cleanRating;
    private boolean hasBaseballDiamond;
    private boolean hasSoccerField;
    private boolean hasSplashPad;
	
    public Park(String address, String id, String name, double surfaceArea, int cleanRating, boolean hasBaseballDiamond, boolean hasSoccerField, boolean hasSplashPad) {
        super(address, id, name);

        this.surfaceArea = surfaceArea;
        this.cleanRating = cleanRating;
        this.hasBaseballDiamond = hasBaseballDiamond;
        this.hasSoccerField = hasSoccerField;
        this.hasSplashPad = hasSplashPad;
    }


    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getCleanRating() {
        return cleanRating;
    }

    public void setCleanRating(int cleanRating) {
        this.cleanRating = cleanRating;
    }

    public boolean hasBaseballDiamond() {
        return hasBaseballDiamond;
    }

    public void setHasBaseballDiamond(boolean hasBaseballDiamond) {
        this.hasBaseballDiamond = hasBaseballDiamond;
    }

    public boolean hasSoccerField() {
        return hasSoccerField;
    }

    public void setHasSoccerField(boolean hasSoccerField) {
        this.hasSoccerField = hasSoccerField;
    }

    public boolean hasSplashPad() {
        return hasSplashPad;
    }

    public void setHasSplashPad(boolean hasSplashPad) {
        this.hasSplashPad = hasSplashPad;
    }

}

