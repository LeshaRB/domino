package com.test.portal.controller;

import org.dominokit.domino.api.server.context.DefaultExecutionContext;
import org.dominokit.domino.api.server.request.RequestContext;
import org.dominokit.domino.api.shared.request.RequestBean;
import org.dominokit.domino.api.shared.request.ResponseBean;

public class SpringExecutionContext<R extends RequestBean, S extends ResponseBean> extends
    DefaultExecutionContext<R, S> {

  private final SpringResponseContext<S> responseContext;

  public SpringExecutionContext(RequestContext<R> requestContext,
      SpringResponseContext<S> responseContext) {
    super(requestContext, responseContext);
    this.responseContext = responseContext;
  }

  public SpringResponseContext<S> getResponseContext() {
    return responseContext;
  }
}
