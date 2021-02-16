package com.hub.programminghub;

class DataManager  {

    private String codetitle, code, coderesult, codedescription,
            postid;

    public DataManager()
    {

    }

    public DataManager(String codetitle, String code, String coderesult, String codedescription, String postid) {
        this.code = code;
        this.coderesult = coderesult;
        this.codedescription = codedescription;
        this.postid = postid;
        this.codetitle = codetitle;
    }

    public String getCodetitle() {
        return codetitle;
    }

    public String getCode() {
        return code;
    }

    public String getCoderesult() {
        return coderesult;
    }

    public String getCodedescription() {
        return codedescription;
    }

    public String getPostid() {
        return postid;
    }
}
