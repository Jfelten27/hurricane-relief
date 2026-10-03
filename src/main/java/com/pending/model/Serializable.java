package com.pending.model;

import org.json.simple.JSONObject;

public interface Serializable {
    public JSONObject serialize();
    public void deserialize(JSONObject object);
}
