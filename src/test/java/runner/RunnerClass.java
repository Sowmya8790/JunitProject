package runner;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"PkgA","PkgB"})
@IncludeTags({"Sanity","Regression"})

public class RunnerClass {

}
