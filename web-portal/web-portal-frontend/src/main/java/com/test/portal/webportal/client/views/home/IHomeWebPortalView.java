package com.test.portal.webportal.client.views.home;

import com.progressoft.brix.domino.api.client.mvp.view.HasUiHandlers;
import com.progressoft.brix.domino.api.client.mvp.view.UiHandlers;
import com.progressoft.brix.domino.api.client.mvp.view.View;
import com.test.portal.webportal.client.views.home.IHomeWebPortalView.HomeWebPortalUiHandlers;
import com.test.portal.webportal.shared.extension.WebPortalContext.WebPortalContent;

/**
 * IHomeWebPortalView.
 *
 * @author Aliaksei Labotski.
 * @since 4/4/18.
 */
public interface IHomeWebPortalView extends View, HasUiHandlers<HomeWebPortalUiHandlers> {

  WebPortalContent getContent();

  interface HomeWebPortalUiHandlers extends UiHandlers {

  }
}
