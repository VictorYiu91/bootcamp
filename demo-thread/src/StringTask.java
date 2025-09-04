public class StringTask implements Runnable{
  //private String str <- if String is null in the beginnig, the default value will be "null"
  private String str = "";
  
  @Override
  public synchronized void run() {
    for (int i = 0; i < 100_000; i++) {
      this.str+="a";
    }
  }
  public String getStr() {
    return this.str;
  }
}
