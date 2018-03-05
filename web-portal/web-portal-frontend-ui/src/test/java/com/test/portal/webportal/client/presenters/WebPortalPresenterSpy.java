package com.test.portal.webportal.client.presenters;

import com.test.portal.webportal.client.presenters.DefaultWebPortalPresenter;
import com.progressoft.brix.domino.api.shared.extension.MainContext;

public class WebPortalPresenterSpy extends DefaultWebPortalPresenter{

    private MainContext mainContext;

    @Override
    public void contributeToMainModule(MainContext context) {
        super.contributeToMainModule(context);
        this.mainContext=context;
    }

    public MainContext getMainContext() {
        return mainContext;
    }

    @Override
    protected String getConcrete() {
        return DefaultWebPortalPresenter.class.getCanonicalName();
    }
}
