package com.test.portal.webportal.client.ui.views.loading;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import org.dominokit.domino.api.client.annotations.UiView;
import com.test.portal.webportal.client.presenters.loading.ILoadingWebPortalPresenter;
import com.test.portal.webportal.client.views.loading.ILoadingWebPortalView;
import com.test.portal.webportal.shared.extension.WebPortalContext.WebPortalLoadingContent;
import gwt.material.design.client.ui.MaterialPanel;

/**
 * LoadingWebPortalView.
 *
 * @author Aliaksei Labotski.
 * @since 4/6/18.
 */
@UiView(presentable = ILoadingWebPortalPresenter.class)
public class LoadingWebPortalView extends Composite implements ILoadingWebPortalView,
    WebPortalLoadingContent<MaterialPanel> {

  private static LoadingWebPortalViewUiBinder ourUiBinder = GWT.create(LoadingWebPortalViewUiBinder.class);

  @UiField
  MaterialPanel loadingPanel;

  @Override
  public void setUiHandlers(LoadingWebPortalUiHandlers uiHandlers) {
  }

  public LoadingWebPortalView() {
    initWidget(ourUiBinder.createAndBindUi(this));
  }

  @Override
  public WebPortalLoadingContent getContent() {
    return this;
  }

  @Override
  public MaterialPanel get() {
    return loadingPanel;
  }

  interface LoadingWebPortalViewUiBinder extends UiBinder<MaterialPanel, LoadingWebPortalView> {

  }
}
