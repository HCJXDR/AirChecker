package com.example.dessusdi.myfirstapp.model;

import com.example.dessusdi.myfirstapp.recycler_view.AqcinListAdapter;
import com.example.dessusdi.myfirstapp.tools.AqcinRequestService;

import java.net.URL;

/**
 * Created by dessusdi on 30/01/2017.
 * DESSUS Dimitri
 */
public class WaqiObject {
    private AqcinRequestService waqiService;
    private GlobalObject globalObject;
    private AqcinListAdapter adpaterList;
    private String url = "";

    public WaqiObject(String url, AqcinRequestService waqiService, AqcinListAdapter adpater) {
        this.url = url;
        this.waqiService = waqiService;
        this.adpaterList = adpater;
    }

    public void fetchData() {
        this.waqiService.sendRequestWithUrl(this.url,
        new AqcinRequestService.VolleyCallback() {
            @Override
            public void onSuccess(GlobalObject global) {
                globalObject = global;
                adpaterList.notifyDataSetChanged();
            }
        });
        // TODO: Completion block and assign to globalobject
    }

    public String getName() {
        String name = "Loading...";
        if (this.globalObject != null) {
            name = this.globalObject.getRxs().getObs().get(0).getMsg().getCity().getName();
        }
        return name;
    }

    public String getId() {
        return this.globalObject.getRxs().getObs().get(0).getMsg().getCity().getId();
    }
}
