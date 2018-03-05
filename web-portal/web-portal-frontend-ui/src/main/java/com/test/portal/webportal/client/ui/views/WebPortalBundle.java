package com.test.portal.webportal.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface WebPortalBundle extends ClientBundle{

    interface Style extends CssResource {
        String WebPortal();
    }

    @Source("css/WebPortal.gss")
    Style style();
}