// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleDetailFragment$$ViewBinder<T extends com.example.xyzreader.ui.ArticleDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361901, "field 'mPhoto'");
    target.mPhoto = finder.castView(view, 2131361901, "field 'mPhoto'");
    view = finder.findRequiredView(source, 2131361896, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131361896, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131361903, "field 'mSubTitle'");
    target.mSubTitle = finder.castView(view, 2131361903, "field 'mSubTitle'");
    view = finder.findRequiredView(source, 2131361902, "field 'mDesc'");
    target.mDesc = finder.castView(view, 2131361902, "field 'mDesc'");
    view = finder.findRequiredView(source, 2131361900, "field 'layout'");
    target.layout = finder.castView(view, 2131361900, "field 'layout'");
    view = finder.findRequiredView(source, 2131361904, "field 'mShareFab'");
    target.mShareFab = finder.castView(view, 2131361904, "field 'mShareFab'");
  }

  @Override public void unbind(T target) {
    target.mPhoto = null;
    target.mToolbar = null;
    target.mSubTitle = null;
    target.mDesc = null;
    target.layout = null;
    target.mShareFab = null;
  }
}
