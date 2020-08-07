package com.oyd.decorator;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author ouyangduan
 * @version 1.0
 * @date 2020/8/6 16:55
 */
public class MorriganAensland {
    public static void main(String[] args) {
        Morrigan m0 = new Original();
        m0.display();
        Morrigan m1 = new Succubus(m0);
        m1.display();
        Morrigan m2 = new Girl(m0);
        m2.display();
    }
}
