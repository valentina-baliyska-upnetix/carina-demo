package com.qaprosoft.carina.demo.techtour;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.demo.api.techtour.GetLoginForm;
import com.qaprosoft.carina.demo.api.techtour.PostLoginData;
import org.testng.annotations.Test;

@Test
public class loginInvalidDataTest extends AbstractTest {
    public void testGetLoginForm() {
        PostLoginData postLoginData = new PostLoginData();
        postLoginData.expectResponseStatus(HttpResponseStatusType.UNAUTHORIZED_401);
        postLoginData.callAPI();
        //postLoginData.validateResponse();
        postLoginData.validateResponseAgainstJSONSchema("api/albums/_post/rs.schema");
    }
}

