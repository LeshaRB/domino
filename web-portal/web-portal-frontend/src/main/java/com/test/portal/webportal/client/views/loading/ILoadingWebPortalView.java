package com.test.portal.webportal.client.views.loading;

import org.dominokit.domino.api.client.mvp.view.HasUiHandlers;
import org.dominokit.domino.api.client.mvp.view.UiHandlers;
import org.dominokit.domino.api.client.mvp.view.View;
import com.test.portal.webportal.client.views.loading.ILoadingWebPortalView.LoadingWebPortalUiHandlers;
import com.test.portal.webportal.shared.extension.WebPortalContext.WebPortalLoadingContent;

/**
 * ILoadingWebPortalView.
 *
 * @author Aliaksei Labotski.
 * @since 4/6/18.
 */
public interface ILoadingWebPortalView extends View, HasUiHandlers<LoadingWebPortalUiHandlers> {

  WebPortalLoadingContent getContent();

  interface LoadingWebPortalUiHandlers extends UiHandlers {

  }

}
