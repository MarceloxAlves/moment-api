package helper;

import java.util.HashMap;
import java.util.Map;

public class ResultData {

    private Map<String, Object> result;

    private Map<String, Object> data;

    private final String STATUS =  "status";
    private final String RESPONSE =  "response";

    public ResultData() {
        result = new HashMap<>();
        data = new HashMap<>();
        result.put(STATUS,"success");
        result.put(RESPONSE,data);
    }

    public void error(){
        result.put(STATUS,"error");
    }

    public void success(){
        result.put(STATUS,"success");
    }

    public void setField(String key, Object object){
        this.data.put(key,object);
    }

    public void setMessage(String message){
        this.data.put("msg",message);
    }

    public Map<String, Object> getResult(){
        return this.result;
    }


}

