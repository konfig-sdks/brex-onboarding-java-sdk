package com.konfigthis.client;

import com.konfigthis.client.api.ReferralsApi;

public class BrexOnboarding {
    private ApiClient apiClient;
    public final ReferralsApi referrals;

    public BrexOnboarding() {
        this(null);
    }

    public BrexOnboarding(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.referrals = new ReferralsApi(this.apiClient);
    }

}
