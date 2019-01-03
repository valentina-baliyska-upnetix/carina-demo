package com.qaprosoft.carina.demo.api.techtour;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetLoginForm extends AbstractApiMethodV2 {
    public GetLoginForm() {
        super(null, "api/techtour/_get/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
