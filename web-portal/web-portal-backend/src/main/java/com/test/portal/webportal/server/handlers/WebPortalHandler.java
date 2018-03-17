package com.test.portal.webportal.server.handlers;

import com.progressoft.brix.domino.api.server.context.ExecutionContext;
import com.progressoft.brix.domino.api.server.handler.Handler;
import com.progressoft.brix.domino.api.server.handler.RequestHandler;
import com.test.portal.webportal.shared.request.WebPortalRequest;
import com.test.portal.webportal.shared.response.WebPortalResponse;
import java.util.logging.Logger;

/**
 * Sample request class.
 */
@Handler("WebPortalRequest")
public class WebPortalHandler implements RequestHandler<WebPortalRequest, WebPortalResponse> {

  private static final Logger LOGGER = Logger.getLogger(WebPortalHandler.class.getName());

  @Override
  public void handleRequest(ExecutionContext<WebPortalRequest, WebPortalResponse> executionContext) {
    LOGGER.info("message recieved from client : " + executionContext.getRequestBean()
        .getMessage());
    executionContext.end(new WebPortalResponse("Server message"));
  }
}
