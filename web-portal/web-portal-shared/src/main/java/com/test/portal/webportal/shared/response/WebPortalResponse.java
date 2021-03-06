package com.test.portal.webportal.shared.response;

import org.dominokit.domino.api.shared.request.ResponseBean;

public class WebPortalResponse implements ResponseBean {

  private static final long serialVersionUID = 1179108139222325795L;
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
