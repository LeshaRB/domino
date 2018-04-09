package com.test.portal.webportal.client;

import com.google.gwt.core.client.EntryPoint;
import org.dominokit.domino.api.client.ModuleConfigurator;
import org.dominokit.domino.api.client.annotations.ClientModule;
import com.test.portal.webportal.client.ui.views.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ClientModule(name = "WebPortalUI")
public class WebPortalUIClientModule implements EntryPoint {

  private static final Logger LOGGER = LoggerFactory.getLogger(WebPortalUIClientModule.class);

  public void onModuleLoad() {
    LOGGER.info("Initializing WebPortal frontend UI module ...");
    Bundle.INSTANCE.style()
        .ensureInjected();
    new ModuleConfigurator().configureModule(new WebPortalUIModuleConfiguration());
  }
}
