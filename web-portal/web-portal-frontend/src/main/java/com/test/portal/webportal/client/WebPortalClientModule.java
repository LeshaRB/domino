package com.test.portal.webportal.client;

import com.google.gwt.core.client.EntryPoint;
import org.dominokit.domino.api.client.ModuleConfigurator;
import org.dominokit.domino.api.client.annotations.ClientModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ClientModule(name = "WebPortal")
public class WebPortalClientModule implements EntryPoint {

  private static final Logger LOGGER = LoggerFactory.getLogger(WebPortalClientModule.class);

  public void onModuleLoad() {
    LOGGER.info("Initializing WebPortal frontend module ...");
    new ModuleConfigurator().configureModule(new WebPortalModuleConfiguration());
  }
}
