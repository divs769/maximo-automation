package com.shopdirect.maximoautomation.infrastructure.maximo.client;

import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;

public interface MaximoClient {
    String createChange(BuildInfo buildInfo);

    void updateChange(BuildInfo buildInfo);
}
