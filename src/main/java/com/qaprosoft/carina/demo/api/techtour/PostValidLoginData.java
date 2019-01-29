package com.qaprosoft.carina.demo.api.techtour;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostValidLoginData extends AbstractApiMethodV2 {
    public PostValidLoginData() {
        super("api/techtour/_postValidDataLogin/rq.json", "api/techtour/_postValidDataLogin/rs.json", "api/techtour/_postValidDataLogin/validlogindata.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
