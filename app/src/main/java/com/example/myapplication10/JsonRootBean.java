/**
  * Copyright 2021 bejson.com 
  */
package com.example.myapplication10;
import java.util.List;

/**
 * Auto-generated: 2021-10-30 1:31:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean  {

    private String reason;
    private List<Result> result;
    private int error_code;
    public void setReason(String reason) {
         this.reason = reason;
     }
     public String getReason() {
         return reason;
     }

    public void setResult(List<Result> result) {
         this.result = result;
     }
     public List<Result> getResult() {
         return result;
     }

    public void setError_code(int error_code) {
         this.error_code = error_code;
     }
     public int getError_code() {
         return error_code;
     }

    @Override
    public String toString() {
        return "JsonRootBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }


}