package com.qaprosoft.carina.demo.api.techtour;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class GetAccountData extends AbstractApiMethodV2 {
    public GetAccountData() {
        super(null, null);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
