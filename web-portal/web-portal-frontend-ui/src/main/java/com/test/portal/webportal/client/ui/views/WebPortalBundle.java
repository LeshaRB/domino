package com.test.portal.webportal.client.ui.views;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface WebPortalBundle extends ClientBundle {

  @Source("css/WebPortal.gss")
  Style style();

  interface Style extends CssResource {

    //    String WebPortal();
  }
}