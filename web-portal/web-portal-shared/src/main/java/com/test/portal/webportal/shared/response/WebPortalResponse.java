package com.test.portal.webportal.shared.response;

import com.progressoft.brix.domino.api.shared.request.ResponseBean;

public class WebPortalResponse implements ResponseBean {

  private String serverMessage;

  public WebPortalResponse() {
  }

  public WebPortalResponse(String serverMessage) {
    this.serverMessage = serverMessage;
  }

  public String getServerMessage() {
    return serverMessage;
  }

  public void setServerMessage(String serverMessage) {
    this.serverMessage = serverMessage;
  }
}
