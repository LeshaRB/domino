package com.test.portal.webportal.shared.extension;

import org.dominokit.domino.api.shared.extension.Context;

public interface WebPortalContext extends Context {

  void setContentMain(WebPortalMainContent content);

  void setContentLoading(WebPortalLoadingContent content);

  @FunctionalInterface
  interface WebPortalMainContent<T> {

    T get();
  }

  @FunctionalInterface
  interface WebPortalLoadingContent<T> {

    T get();
  }

  class ContentConnotBeNullException extends RuntimeException {

  }
}
