package org.stategen.framework.progen.wrap;

import org.stategen.framework.util.StringUtil;

public class ReferConfigWrap {
    private String api;
    private String none ;
    private String changeBy ;
    private String referField;

    public String getNone() {
        return none;
    }


    public String getApi() {
        return api;
    }
    
    public void setApi(String api) {
        this.api = api;
    }
    
    
    public void setNone(String none) {
        if (StringUtil.isEmpty(none)){
            return;
        }
        this.none = none;
    }

    public String getChangeBy() {
        return changeBy;
    }
    
    public void setChangeBy(String changeBy) {
        if (StringUtil.isEmpty(changeBy)){
            return;
        }
        this.changeBy = changeBy;
    }
    
    public String getReferField() {
        return referField;
    }
    
    public void setReferField(String referField) {
        if (StringUtil.isEmpty(referField)){
            return;
        }
        this.referField = referField;
    }
}