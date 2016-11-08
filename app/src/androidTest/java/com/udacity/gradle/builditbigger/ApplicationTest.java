package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Context;
import android.support.v4.util.Pair;
import android.test.ApplicationTestCase;
import android.text.TextUtils;

import java.util.concurrent.CountDownLatch;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
    String mString = null;
    Exception mError = null;
    CountDownLatch signal = null;

    @Override
    protected void setUp() throws Exception {
        signal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception {
        signal.countDown();
    }

    public void testTask() throws InterruptedException {
        MainActivity activity = new MainActivity();
        MainActivity.EndpointsAsyncTask task = activity.new EndpointsAsyncTask();
        task.setListener(new MainActivity.TaskListener() {
            @Override
            public void onComplete(String tString) {
                mString = tString;
                signal.countDown();
            }
        }).execute("");

        signal.await();

        assertFalse(TextUtils.isEmpty(mString));
        assertTrue(mString.startsWith("Hi"));

    }
}
