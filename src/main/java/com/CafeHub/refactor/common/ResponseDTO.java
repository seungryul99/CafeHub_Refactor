package com.CafeHub.refactor.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ResponseDTO <T>{

    private Boolean success;

    private  T data;

    private ErrorMessage errorMessage;


    public static <T> ResponseDTO<T>  success(T data){

        return new ResponseDTO<>(true,data,null);
    }

    public static <T> ResponseDTO<T> fail(ErrorMessage errorMessage){
        return new ResponseDTO<>(false,null,errorMessage);
    }
}
