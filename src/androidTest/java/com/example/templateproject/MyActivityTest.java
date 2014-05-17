package com.example.templateproject;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {
    @Test
    public void testPlaceholderIsThere() {
        Activity sut = Robolectric.buildActivity(MyActivity.class).create().start().resume().get();
        TextView placeholder = (TextView) sut.findViewById(R.id.placeholder);
        assertEquals("Hello", placeholder.getText());
    }
}
