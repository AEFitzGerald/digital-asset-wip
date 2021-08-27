package com.fitzgerald.mvc.models.Global;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class Global {
    @JsonProperty("data")
    private GlobalData data;

	public GlobalData getData() {
		return data;
	}

	public void setData(GlobalData data) {
		this.data = data;
	}
    

}
