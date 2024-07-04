package com.rinam.cuaca;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootModel {
    @SerializedName("city")
    public CityModel getCityModel;
    @SerializedName("list")
    private List<ListModel> listModelList;

    public RootModel() {
    }

    public List<ListModel> getListModelList() {
        return listModelList;
    }

    public void setListModelList(List<ListModel> listModelList) {
        this.listModelList = listModelList;
    }

    public CityModel getGetCityModel() {
        return getCityModel;
    }

    public void setGetCityModel(CityModel getCityModel) {
        this.getCityModel = getCityModel;
    }
}
