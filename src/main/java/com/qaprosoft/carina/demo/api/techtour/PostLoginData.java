package com.qaprosoft.carina.demo.api.techtour;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class PostLoginData extends AbstractApiMethodV2 {
    public PostLoginData() {
        super(null, "api/albums/_post/rs.json", "api/techtour/_post/logindata.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
