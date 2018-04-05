package com.test.portal.webportal.shared.extension;

import com.progressoft.brix.domino.api.shared.extension.Context;

public interface WebPortalContext extends Context {

  void setContent(WebPortalContent content);

  @FunctionalInterface
  interface WebPortalContent<T> {

    T get();
  }

  class ContentConnotBeNullException extends RuntimeException {

  }
}
