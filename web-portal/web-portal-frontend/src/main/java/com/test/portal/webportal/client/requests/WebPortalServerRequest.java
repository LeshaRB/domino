package com.test.portal.webportal.client.requests;

import com.progressoft.brix.domino.api.client.request.ServerRequest;
import com.test.portal.webportal.shared.response.WebPortalResponse;
import com.test.portal.webportal.shared.request.WebPortalRequest;
import com.progressoft.brix.domino.api.client.annotations.Request;
import com.progressoft.brix.domino.api.client.annotations.Path;

@Request
@Path("WebPortalRequest")
public class WebPortalServerRequest extends ServerRequest<WebPortalRequest, WebPortalResponse> {
    public WebPortalServerRequest(WebPortalRequest requestBean) {
        super(requestBean);
    }
}
