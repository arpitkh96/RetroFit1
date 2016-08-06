package com.example.arpitkh996.retrofit.utils;

import com.example.arpitkh996.retrofit.B2C;
import com.example.arpitkh996.retrofit.model.ApiError;

import java.io.IOException;
import java.lang.annotation.Annotation;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;

/**
 * Created by arpitkh996 on 05-08-2016.
 */

public class ErrorHandler {

        public static ApiError parseError(Response<?> response) {
            Converter<ResponseBody, ApiError> converter =
                    B2C.getRetrofitInstance()
                            .responseBodyConverter(ApiError.class, new Annotation[0]);

            ApiError error;

            try {
                error = converter.convert(response.errorBody());
            } catch (IOException e) {
                return new ApiError();
            }

            return error;
        }

}
