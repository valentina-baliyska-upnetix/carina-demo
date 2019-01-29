package com.qaprosoft.carina.demo.api.techtour;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class PostInvalidLoginData extends AbstractApiMethodV2 {
    public PostInvalidLoginData() {
        super(null, "api/techtour/_postInvalidDataLogin/rs.json", "api/techtour/_postInvalidDataLogin/invalidlogindata.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
