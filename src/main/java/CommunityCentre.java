
public class CommunityCentre extends InstitutionalBuilding {
    private boolean hasPool;
    private boolean hasGym;
    private boolean hasRink;
  
    public CommunityCentre(String address, String id, String name, int sustainabilityRating, int numFloors, boolean hasPool, boolean hasGym, boolean hasRink) {
        super(address, id, name, sustainabilityRating, numFloors);
        
        this.hasPool = hasPool;
        this.hasGym = hasGym;
        this.hasRink = hasRink;
      }

    public boolean hasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }
    
    public boolean hasGym() {
        return hasGym;
    }

    public void setHasGym(boolean hasGym) {
        this.hasGym = hasGym;
    }

    public boolean hasRink() {
        return hasRink;
    }

    public void setHasRink(boolean hasRink) {
        this.hasRink = hasRink;
    }
    
}
