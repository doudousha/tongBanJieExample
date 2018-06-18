package wq.com.tbjexample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import wq.com.tbjexample.R;

/**
 */
public class DetailSafeCategoryFragment extends BaseFragment {

    public static DetailSafeCategoryFragment newInstance() {
        DetailSafeCategoryFragment fragment = new DetailSafeCategoryFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail_safe_category, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initTitle() {
    }

    @Override
    public void initView() {
    }

    @Override
    public void setListener() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}
