package com.qaprosoft.carina.demo.api.techtour;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class PostLoginData extends AbstractApiMethodV2 {
    public PostLoginData() {
        super("api/techtour/_post/rq.json", "api/techtour/_post/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
