/**
 * @Author anyang
 * @CreateTime 2018/6/12
 * @Des
 */
public enum  RigistPlatform {
    PC("pc"), SYSTEM("system");
    private String name;
    RigistPlatform(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
