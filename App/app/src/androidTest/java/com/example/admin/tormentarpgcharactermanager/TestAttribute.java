package com.example.admin.tormentarpgcharactermanager;

import android.test.ApplicationTestCase;
import android.app.Application;
import com.example.admin.tormentarpgcharactermanager.Attribute;

import java.util.Random;

/**
 * Created by admin on 12/20/2014.
 */
public class TestAttribute extends ApplicationTestCase {
    public TestAttribute() {
        super(Application.class);
    }

    public void testSetBonus12() {
        Attribute attr12 = new Attribute();
        attr12.setValue(12);

        attr12.setBonus();

        assertEquals(1, attr12.getBonus());
    }
    public void testSetBonus8() {
        Attribute attr8 = new Attribute();
        attr8.setValue(8);

        attr8.setBonus();

        assertEquals(-1, attr8.getBonus());
    }
    public void testSetBonus14() {
        Attribute attr14 = new Attribute();
        attr14.setValue(14);

        attr14.setBonus();

        assertEquals(2, attr14.getBonus());
    }
    public void testSetBonus9() {
        Attribute attr9 = new Attribute();
        attr9.setValue(9);

        attr9.setBonus();

        assertEquals(-1, attr9.getBonus());
    }
    public void testSetBonus7() {
        Attribute attr7 = new Attribute();
        attr7.setValue(7);

        attr7.setBonus();

        assertEquals(-2, attr7.getBonus());
    }
    public void testSetBonus17() {
        Attribute attr17 = new Attribute();
        attr17.setValue(17);

        attr17.setBonus();

        assertEquals(3, attr17.getBonus());
    }
    public void testAddOne10() {
        Attribute attr = new Attribute();
        attr.setValue(10);
        attr.setBonus();

        attr.addOne();

        assertEquals(attr.getValue(), 11);
        assertEquals(attr.getBonus(), 0);
    }
    public void testAddOne11() {
        Attribute attr = new Attribute();
        attr.setValue(11);
        attr.setBonus();

        attr.addOne();

        assertEquals(attr.getValue(), 12);
        assertEquals(attr.getBonus(), 1);
    }
}
