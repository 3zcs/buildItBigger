package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by azcs on 30/10/16.
 */

public class FinalTest extends AndroidTestCase {
        public static void testVerifyEchoResponse(String s) {
            Log.v("Connected Test" , s);
 //           new MainActivity.EndpointsAsyncTask().execute(new Pair<Context, String>(MainActivity.context, "Manfred"));


        }

        public void testVerifyLoggingEchoResponse() {
//            assertEquals("hello", Echo.echo("hello", true));
        }
    }

