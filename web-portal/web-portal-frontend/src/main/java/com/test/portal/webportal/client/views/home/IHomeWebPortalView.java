package com.test.portal.webportal.client.views.home;

import org.dominokit.domino.api.client.mvp.view.HasUiHandlers;
import org.dominokit.domino.api.client.mvp.view.UiHandlers;
import org.dominokit.domino.api.client.mvp.view.View;
import com.test.portal.webportal.client.views.home.IHomeWebPortalView.HomeWebPortalUiHandlers;
import com.test.portal.webportal.shared.extension.WebPortalContext.WebPortalMainContent;

/**
 * IHomeWebPortalView.
 *
 * @author Aliaksei Labotski.
 * @since 4/4/18.
 */
public interface IHomeWebPortalView extends View, HasUiHandlers<HomeWebPortalUiHandlers> {

  WebPortalMainContent getContent();

  interface HomeWebPortalUiHandlers extends UiHandlers {

  }
}
