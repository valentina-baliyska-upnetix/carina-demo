package com.qaprosoft.carina.demo.techtour;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.demo.api.techtour.PostValidLoginData;
import org.testng.annotations.Test;

public class loginValidDataTest extends AbstractTest {

    @Test
    public void testPostValidLoginData(){
        PostValidLoginData postValidLoginData = new PostValidLoginData();
        //postValidLoginData.expectResponseStatus(HttpResponseStatusType.OK_200);
        postValidLoginData.callAPI();
        postValidLoginData.validateResponse();
    }
}
