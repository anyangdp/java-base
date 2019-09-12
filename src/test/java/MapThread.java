import java.util.Map;

/**
 * @Author anyang
 * @CreateTime 2019/8/16
 * @Des
 */
public class MapThread implements Runnable {
    private Integer key;
    private String value;
    private Map<Integer, String> map;
    public MapThread(Integer key, String value, Map<Integer, String> map) {
        this.key = key;
        this.value = value;
        this.map = map;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId()+",key:"+ key+ ",value:"+value);
        map.remove(key);
    }
}
