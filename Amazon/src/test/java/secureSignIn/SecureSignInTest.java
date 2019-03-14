package secureSignIn;

import base.CommonApi;
import org.testng.annotations.Test;

public class SecureSignInTest extends CommonApi {
    @Test
    public void signIn(){
        SecureSignIn("a-autoid-0-announce","#ap_email");
    }
}
