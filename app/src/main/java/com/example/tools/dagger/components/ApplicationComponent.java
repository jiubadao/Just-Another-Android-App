package com.example.tools.dagger.components;

import com.example.App;
import com.example.dagger.modules.BuildTypeAwareModule;
import com.example.networking.BaseUrlInterceptor;
import com.example.networking.RestService;
import com.example.tools.analytics.AnalyticsHelper;
import com.example.tools.dagger.modules.AndroidModule;
import com.example.tools.dagger.modules.ApplicationModule;
import com.example.tools.dagger.modules.NetworkModule;
import com.example.tools.images.ImageLoader;
import com.example.util.testing.ForTestingPurposes;
import dagger.Component;
import okreplay.OkReplayInterceptor;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ApplicationModule.class, NetworkModule.class, AndroidModule.class, BuildTypeAwareModule.class})
public interface ApplicationComponent {

    RestService restService();

    AnalyticsHelper analyticsHelper();

    App application();

    ImageLoader imageLoader();

    void inject(App application);

    @ForTestingPurposes
    BaseUrlInterceptor baseUrlInterceptor();

    @ForTestingPurposes
    OkReplayInterceptor okReplayInterceptor();

}
