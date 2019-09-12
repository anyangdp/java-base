import org.junit.Test;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;

/**
 * @Author anyang
 * @CreateTime 2019/8/14
 * @Des
 */
public class TestDemo {
    public static final Map<Integer, String> map = new ConcurrentHashMap<>();
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(9);
        BigDecimal b = new BigDecimal("0.000000000000000");
        System.out.println(b);
        System.out.println(b.toString());
        System.out.println(b.toPlainString());

        String  a = "13434 or";
        System.out.println(a.substring(0, a.length() - 3));
        System.out.println();
        for (int i = 0; i < 100; i++) {
            map.put(i , "value"+i);
        }
        Iterator<Map.Entry<Integer, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, String> temp = iter.next();
            executorService.execute(new MapThread(temp.getKey(), temp.getValue(), map));
        }

    }

    @Test
    public void testListForeach() {
        List<String> list = null;
        list.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    public void testDate() {
        Calendar c = Calendar.getInstance();
        long now = c.getTimeInMillis();
        c.add(Calendar.DAY_OF_MONTH, 0);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(c.getTime());
    }

    @Test
    public void testMapLimit() {
        Map<Integer, String> map = new HashMap<>(2000000);
        LocalDateTime beginDateTime = LocalDateTime.now();
        for (int i = 0, j = 200000; i<j; i++) {
            map.put(i, "测试内容读书读书读书读书的说三读书的说三读书的说三读书的说三读书的说三读书的说三读书的说三读书的说三");
        }
        LocalDateTime endDateTime = LocalDateTime.now();
        System.out.println(Duration.between(beginDateTime, endDateTime).toMillis());
        Iterator<Map.Entry<Integer, String>> inter = map.entrySet().iterator();
        while (inter.hasNext()) {
            System.out.println(inter.next());
            inter.remove();
            System.out.println(map.size());
        }

        System.out.println(map.size());
    }

    public int count = 6;

    public int temp = 0;
    @Test
    public void testExecutor() {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < count; i++) {
            es.execute(() -> {
                System.out.println(1);
            });
        }
        es.shutdown();
        temp+=1;
        System.out.println("temp:"+temp);
        while (true) {
            if (es.isShutdown()) {
                if (temp == 2) {
                    System.out.println("退出");
                    break;
                }
                System.out.println("执行第二次");
                testExecutor();
            }
        }
    }
}
