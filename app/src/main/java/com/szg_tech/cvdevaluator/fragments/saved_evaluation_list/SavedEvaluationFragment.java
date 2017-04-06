package com.szg_tech.cvdevaluator.fragments.saved_evaluation_list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.szg_tech.cvdevaluator.R;
import com.szg_tech.cvdevaluator.core.ConfigurableFragment;

/**
 * Created by ahmetkucuk on 4/5/17.
 */
public class SavedEvaluationFragment extends ConfigurableFragment implements SavedEvaluationView {


    private RecyclerView recyclerView;
    private SavedEvaluationPresenter presenter = createPresenter();


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.saved_evaluations, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        presenter.onCreate();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    @Override
    public SavedEvaluationPresenter createPresenter() {
        return new SavedEvaluationPresenterImpl(this);
    }
}
