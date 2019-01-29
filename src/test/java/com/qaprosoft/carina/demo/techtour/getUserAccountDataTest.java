package com.qaprosoft.carina.demo.techtour;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.demo.api.techtour.GetAccountData;
import org.testng.annotations.Test;

public class getUserAccountDataTest extends AbstractTest {
    @Test
    public void testUserData(){
        GetAccountData getAccountData = new GetAccountData();
        getAccountData.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAccountData.callAPI();
        getAccountData.validateResponse();
    }
}
