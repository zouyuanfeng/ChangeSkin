package com.zhy.changeskin.attr;

import android.view.View;

/**
 * Created by zhy on 15/9/22.
 */
public class SkinAttr {
    private String resName;
    private SkinAttrType attrType;


    SkinAttr(SkinAttrType attrType, String resName) {
        this.resName = resName;
        this.attrType = attrType;
    }

    void apply(View view) {
        attrType.apply(view, resName);
    }
}
