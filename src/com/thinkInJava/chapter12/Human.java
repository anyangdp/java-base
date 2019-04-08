package com.thinkInJava.chapter12;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance e) {
            System.out.println("Caught Annoyance");
        }

        try {
            throw new Sneeze();
        } catch (Annoyance sneeze) {
            System.out.println("Caught Annoyance2");
        }
    }
}
