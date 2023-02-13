package models;
public class resume {
    public String study;
    public String group;
    public String branch;
    public String CClass;
    public String s_ID;
    public String name;
    public String nickname;
    public String ID_card;
    public String birthday;
    public String ethnicity;
    public double weight;
    public double height;
    public String canton;
    public String district;
    public String province;
    public int ZIP_code;
    public String face , email;

    public resume(String study, String group, String branch, String CClass, String s_ID, String name, String nickname, String ID_card, String birthday, String ethnicity, double weight, double height, String canton, String district, String province, int ZIP_code, String face, String email) {
        this.study = study;
        this.group = group;
        this.branch = branch;
        this.CClass = CClass;
        this.s_ID = s_ID;
        this.name = name;
        this.nickname = nickname;
        this.ID_card = ID_card;
        this.birthday = birthday;
        this.ethnicity = ethnicity;
        this.weight = weight;
        this.height = height;
        this.canton = canton;
        this.district = district;
        this.province = province;
        this.ZIP_code = ZIP_code;
        this.face = face;
        this.email = email;


    }
            public void setStudy (String study){
            this.study = study;
        }

            public void setGroup (String group){
            this.group = group;
        }

            public void setBranch (String branch){
            this.branch = branch;
        }

            public void setCClass (String CClass){
            this.CClass = CClass;
        }

            public void setS_ID_ID (String s_ID){
            this.s_ID = s_ID;
        }

            public void setName (String name){
            this.name = name;
        }

            public void setNickname (String nickname){
            this.nickname = nickname;
        }

            public void setID_card (String ID_card){
            this.ID_card = ID_card;
        }

            public void setBirthday (String birthday){
            this.birthday = birthday;
        }

            public void setEthnicity (String ethnicity){
            this.ethnicity = ethnicity;
        }

            public void setWeight ( double weight){
            this.weight = weight;
        }

            public void setHeight ( double height){
            this.height = height;
        }

            public void setCanton (String canton){
            this.canton = canton;
        }

            public void setDistrict (String district){
            this.district = district;
        }

            public void setProvince (String province){
            this.province = province;
        }

            public void setZIP_code ( int ZIP_code){
            this.ZIP_code = ZIP_code;
        }

            public void setFace ( String face){ this.face = face;}

            public void setEmail (String email){ this.email = email;}

            //getter//

            public String getStudy () {
            return study;
        }

            public String getGroup () {
            return group;
        }

            public String getBranch () {
            return branch;
        }

            public String getCClass () {
            return CClass;
        }

            public String getS_ID () {
            return s_ID;
        }

            public String getName () {
            return name;
        }

            public String getNickname () {
            return nickname;
        }

            public String getID_card () {
            return ID_card;
        }

            public String getBirthday () {
            return birthday;
        }

            public String getEthnicity () {
            return ethnicity;
        }

            public double getWeight () {
            return weight;
        }

            public double getHeight () {
            return height;
        }

            public String getCanton () {
            return canton;
        }

            public String getDistrict () {
            return district;
        }

            public String getProvince () {
            return province;
        }

            public int getZIP_code () {
            return ZIP_code;
        }

            public String getFace () { return face;}

            public String getEmail(){ return email;}


}