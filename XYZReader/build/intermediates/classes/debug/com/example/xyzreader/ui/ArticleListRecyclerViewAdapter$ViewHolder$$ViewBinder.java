// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleListRecyclerViewAdapter$ViewHolder$$ViewBinder<T extends com.example.xyzreader.ui.ArticleListRecyclerViewAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361901, "field 'imageView'");
    target.imageView = finder.castView(view, 2131361901, "field 'imageView'");
    view = finder.findRequiredView(source, 2131361905, "field 'titleView'");
    target.titleView = finder.castView(view, 2131361905, "field 'titleView'");
    view = finder.findRequiredView(source, 2131361906, "field 'subtitleView'");
    target.subtitleView = finder.castView(view, 2131361906, "field 'subtitleView'");
  }

  @Override public void unbind(T target) {
    target.imageView = null;
    target.titleView = null;
    target.subtitleView = null;
  }
}
