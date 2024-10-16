
public class GarbageDisposal extends Place {
  private int pollution; // 0 - 10
    
  public GarbageDisposal(String address, String id, String name, int pollution) {
      super(address, id, name);

      this.pollution = pollution;
    }

    
    public int getPollution() {
        return pollution;
    }

    public void setPollution(int pollution) {
        this.pollution = pollution;
    }
}
