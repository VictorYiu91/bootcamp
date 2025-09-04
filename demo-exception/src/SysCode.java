public enum SysCode {
  LOGIN_FAIL(1,"Login Fail."),//
  ;
  private int code;
  private String desc;

  private SysCode(int code, String desc){
    this.code = code;
    this.desc = desc;
  }
  public int getCode() {
    return this.code;
  }
  public String getDesc() {
    return this.desc;
  }
}
