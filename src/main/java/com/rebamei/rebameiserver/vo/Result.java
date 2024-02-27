package com.rebamei.rebameiserver.vo;

public class Result<T> {
  public int code;
  public String msg;
  public T data;

  public static <T> Result success() {
    Result res = new Result("success", 0, null);
    
    return res;
  }

  public static <T> Result success(T data) {
    Result res = new Result("success", 0, data);

    return res;
  }

  private Result(String msg, int code, T data) {
    this.msg = msg;
    this.code = code;
    this.data = data;
  }
}
