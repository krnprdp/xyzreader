// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleListActivity$$ViewBinder<T extends com.example.xyzreader.ui.ArticleListActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361894, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = finder.castView(view, 2131361894, "field 'mSwipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131361895, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131361895, "field 'mRecyclerView'");
    view = finder.findRequiredView(source, 2131361896, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131361896, "field 'mToolbar'");
  }

  @Override public void unbind(T target) {
    target.mSwipeRefreshLayout = null;
    target.mRecyclerView = null;
    target.mToolbar = null;
  }
}
