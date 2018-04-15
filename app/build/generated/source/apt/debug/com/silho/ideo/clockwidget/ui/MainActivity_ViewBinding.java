// Generated code from Butter Knife. Do not modify!
package com.silho.ideo.clockwidget.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.silho.ideo.clockwidget.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mTempValue = Utils.findRequiredViewAsType(source, R.id.temperatureLabel, "field 'mTempValue'", TextView.class);
    target.mLocationValue = Utils.findRequiredViewAsType(source, R.id.locationLabel, "field 'mLocationValue'", TextView.class);
    target.mHumidityValue = Utils.findRequiredViewAsType(source, R.id.humidityValue, "field 'mHumidityValue'", TextView.class);
    target.mPrecipValue = Utils.findRequiredViewAsType(source, R.id.precipValue, "field 'mPrecipValue'", TextView.class);
    target.mIconTime = Utils.findRequiredViewAsType(source, R.id.iconTime, "field 'mIconTime'", ImageView.class);
    target.mHumidityLabel = Utils.findRequiredViewAsType(source, R.id.humidityLabel, "field 'mHumidityLabel'", TextView.class);
    target.mWindSpeedLabel = Utils.findRequiredViewAsType(source, R.id.precipLabel, "field 'mWindSpeedLabel'", TextView.class);
    target.mSwipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefresher, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTempValue = null;
    target.mLocationValue = null;
    target.mHumidityValue = null;
    target.mPrecipValue = null;
    target.mIconTime = null;
    target.mHumidityLabel = null;
    target.mWindSpeedLabel = null;
    target.mSwipeRefreshLayout = null;
  }
}
