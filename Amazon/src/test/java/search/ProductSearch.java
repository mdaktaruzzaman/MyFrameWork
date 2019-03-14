package search;

import base.CommonApi;
import org.testng.annotations.Test;

public class ProductSearch extends CommonApi {
    @Test
    public void search() {typeOnCss("#twotabsearchtextbox");}
}
