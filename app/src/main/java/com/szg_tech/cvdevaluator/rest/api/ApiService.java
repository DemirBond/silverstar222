package com.szg_tech.cvdevaluator.rest.api;

import com.szg_tech.cvdevaluator.rest.responses.BaseResponse;
import com.szg_tech.cvdevaluator.rest.responses.EvaluationResponse;
import com.szg_tech.cvdevaluator.rest.responses.SavedEvaluationResponse;
import com.szg_tech.cvdevaluator.rest.responses.SavedEvaluationSummaryResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by ahmetkucuk on 3/16/17.
 *
 * Provided API should be revised!!
 */

public interface ApiService {

    /**
     * Somehow compute evaluation and saveEvaluation has same api query
     * Only difference is that save evaluation passes an extra parameter called name.
     * Therefore, in this query is joined
     *
     */
    @GET("/api/api/values")
    public Call<EvaluationResponse> computeOrSaveEvaluation(@QueryMap(encoded = true) Map<String, Object> options);


    @GET("/api/api/values")
    public Call<SavedEvaluationSummaryResponse> retrieveSavedEvaluations();

    @GET("/api/api/values")
    public Call<SavedEvaluationResponse> retrieveEvaluationByID(@Query("ID") int id);
}
