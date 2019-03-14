package FbTest;

import base.CommonApi;
import org.testng.annotations.Test;

public class InvalidSignIn extends CommonApi {

    @Test
    public void invalid(){
        invalidSignInFb("inputtext");
    }
}
