package com.lordnighton;

import java.util.List;

public class RelationsData {

    private String code;
    private List<FamilyMember> family;
    private List<Community> communities;

    public List<FamilyMember> getFamily() {
        return family;
    }

    public void setFamily(List<FamilyMember> family) {
        this.family = family;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }
}
