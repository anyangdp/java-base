package com.thinkInJava.chapter12;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut, BaseBallException {
    }
    public StormyInning(String s) throws Foul, BaseBallException {}
    public void rainHard() throws RainedOut {}
    public void event() {}
    public void atBat() throws PopFoul{
        throw new PopFoul();
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseBallException e) {
            System.out.println("base ball exception");
        }

//        try {
//            Inning i = new StormyInning();
//            i.atBat();
//        } catch (Strike e) {
//            System.out.println("Strike e");
//        } catch (Foul e) {
//            System.out.println("Foul");
//        } catch (RainedOut e) {
//            System.out.println("RainedOut");
//        } catch (BaseBallException e) {
//            System.out.println("Base ball Exception");
//        }
    }
}
