package com.test.portal.webportal.client.requests;

import org.dominokit.domino.api.client.annotations.Path;
import org.dominokit.domino.api.client.annotations.Request;
import org.dominokit.domino.api.client.request.ServerRequest;
import com.test.portal.webportal.shared.request.WebPortalRequest;
import com.test.portal.webportal.shared.response.WebPortalResponse;

@Request
@Path("WebPortalRequest")
public class WebPortalServerRequest extends ServerRequest<WebPortalRequest, WebPortalResponse> {

  public WebPortalServerRequest(WebPortalRequest requestBean) {
    super(requestBean);
  }
}
