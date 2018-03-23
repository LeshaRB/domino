package com.test.portal.webportal.shared.request;

import com.progressoft.brix.domino.api.shared.request.RequestBean;

public class WebPortalRequest implements RequestBean {

  private static final long serialVersionUID = -994169651659332894L;
  private String message;

  public WebPortalRequest() {
  }

  public WebPortalRequest(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
