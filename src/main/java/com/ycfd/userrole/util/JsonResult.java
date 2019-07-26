package com.ycfd.userrole.util;

/**
 * Created by dl on 2017-12-15.
 */
public class JsonResult<T> {

    private final String code;

    private final T data;

    private final String error;

    private JsonResult(JsonResultBuilder<T> builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.error = builder.error;
    }

    public static <T> JsonResult.JsonResultBuilder<T> builder() {
        return new JsonResultBuilder<>();
    }


    public String getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    public String getError() {
        return error == null ? "" : error;
    }

    @Override
    public String toString() {

        return "JsonResult{" +
                "code=" + code +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }

    public static final class JsonResultBuilder<T> {

        private String code;

        private T data;

        private String error;

        private JsonResultBuilder() {

        }

        public JsonResultBuilder error(String error) {
            this.error = error;
            this.code = "500";
            this.data = (T)"";
            return this;
        }

        public JsonResultBuilder data(T data) {
            this.data = data;
            this.code = "200";
            return this;
        }

        public JsonResult build() {
            return new JsonResult<>(this);
        }
    }

    public static void main(String[] args) {
        System.out.print(JsonResult.<String>builder().data("asd").build().toString());
        System.out.print(JsonResult.<String>builder().error("123").build().toString());
    }

}
