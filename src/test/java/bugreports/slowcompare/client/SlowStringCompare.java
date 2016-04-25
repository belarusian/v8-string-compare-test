package bugreports.slowcompare.client;

import com.google.gwt.core.client.EntryPoint;
import bugreports.slowcompare.client.StringTests;
import jetbrains.datapad.js.tests.client.KarmaTestSuiteRunner;

public class SlowStringCompare implements EntryPoint {
  public void onModuleLoad() {
    KarmaTestSuiteRunner.run(new StringTests());
  }
}
