package com.alipay.openapi.entity;



public class ant_merchant_expand_shop_query_response {

    private String shop_id;
    private business_address business_address;
    public static class business_address{
        private String city_code;
        private String district_code;
        private String address;
        private String province_code;
        private String poiid;
        private String longitude;
        private String latitude;
        private String type;

        public String getCity_code() {
            return city_code;
        }

        public void setCity_code(String city_code) {
            this.city_code = city_code;
        }

        public String getDistrict_code() {
            return district_code;
        }

        public void setDistrict_code(String district_code) {
            this.district_code = district_code;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getProvince_code() {
            return province_code;
        }

        public void setProvince_code(String province_code) {
            this.province_code = province_code;
        }

        public String getPoiid() {
            return poiid;
        }

        public void setPoiid(String poiid) {
            this.poiid = poiid;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    private String shop_category;
    private String shop_type;
    private String ip_role_id;
    private String shop_name;
    private String contact_phone;
    private String contact_mobile;
    private String cert_no;
    private String[] out_door_images;
    private qualifications[] qualifications;
    public static class qualifications{
        private String industry_qualification_type;
        private String industry_qualification_image;

        public String getIndustry_qualification_type() {
            return industry_qualification_type;
        }

        public void setIndustry_qualification_type(String industry_qualification_type) {
            this.industry_qualification_type = industry_qualification_type;
        }

        public String getIndustry_qualification_image() {
            return industry_qualification_image;
        }

        public void setIndustry_qualification_image(String industry_qualification_image) {
            this.industry_qualification_image = industry_qualification_image;
        }
    }

    private String cert_type;
    private String cert_name;
    private String cert_image;
    private String legal_name;
    private String legal_cert_no;
    private String license_auth_letter_image;
    private String settle_alipay_logon_id;
    private ext_infos[] ext_infos;
    public static class ext_infos{
        private String key_name;
        private String value;

        public String getKey_name() {
            return key_name;
        }

        public void setKey_name(String key_name) {
            this.key_name = key_name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    private business_time[] business_time;
    public static class business_time{
        private String week_day;
        private String open_time;
        private String close_time;

        public String getWeek_day() {
            return week_day;
        }

        public void setWeek_day(String week_day) {
            this.week_day = week_day;
        }

        public String getOpen_time() {
            return open_time;
        }

        public void setOpen_time(String open_time) {
            this.open_time = open_time;
        }

        public String getClose_time() {
            return close_time;
        }

        public void setClose_time(String close_time) {
            this.close_time = close_time;
        }
    }

    private contact_infos[] contact_infos;
    public static class contact_infos{
        private String name;
        private String phone;
        private String mobile;
        private String email;
        private String[] tag;
        private String type;
        private String id_card_no;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String[] getTag() {
            return tag;
        }

        public void setTag(String[] tag) {
            this.tag = tag;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId_card_no() {
            return id_card_no;
        }

        public void setId_card_no(String id_card_no) {
            this.id_card_no = id_card_no;
        }
    }

    private String memo;
    private String brand_id;
    private String scene;

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public ant_merchant_expand_shop_query_response.business_address getBusiness_address() {
        return business_address;
    }

    public void setBusiness_address(ant_merchant_expand_shop_query_response.business_address business_address) {
        this.business_address = business_address;
    }

    public String getShop_category() {
        return shop_category;
    }

    public void setShop_category(String shop_category) {
        this.shop_category = shop_category;
    }

    public String getShop_type() {
        return shop_type;
    }

    public void setShop_type(String shop_type) {
        this.shop_type = shop_type;
    }

    public String getIp_role_id() {
        return ip_role_id;
    }

    public void setIp_role_id(String ip_role_id) {
        this.ip_role_id = ip_role_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_mobile() {
        return contact_mobile;
    }

    public void setContact_mobile(String contact_mobile) {
        this.contact_mobile = contact_mobile;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String[] getOut_door_images() {
        return out_door_images;
    }

    public void setOut_door_images(String[] out_door_images) {
        this.out_door_images = out_door_images;
    }

    public ant_merchant_expand_shop_query_response.qualifications[] getQualifications() {
        return qualifications;
    }

    public void setQualifications(ant_merchant_expand_shop_query_response.qualifications[] qualifications) {
        this.qualifications = qualifications;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_name() {
        return cert_name;
    }

    public void setCert_name(String cert_name) {
        this.cert_name = cert_name;
    }

    public String getCert_image() {
        return cert_image;
    }

    public void setCert_image(String cert_image) {
        this.cert_image = cert_image;
    }

    public String getLegal_name() {
        return legal_name;
    }

    public void setLegal_name(String legal_name) {
        this.legal_name = legal_name;
    }

    public String getLegal_cert_no() {
        return legal_cert_no;
    }

    public void setLegal_cert_no(String legal_cert_no) {
        this.legal_cert_no = legal_cert_no;
    }

    public String getLicense_auth_letter_image() {
        return license_auth_letter_image;
    }

    public void setLicense_auth_letter_image(String license_auth_letter_image) {
        this.license_auth_letter_image = license_auth_letter_image;
    }

    public String getSettle_alipay_logon_id() {
        return settle_alipay_logon_id;
    }

    public void setSettle_alipay_logon_id(String settle_alipay_logon_id) {
        this.settle_alipay_logon_id = settle_alipay_logon_id;
    }

    public ant_merchant_expand_shop_query_response.ext_infos[] getExt_infos() {
        return ext_infos;
    }

    public void setExt_infos(ant_merchant_expand_shop_query_response.ext_infos[] ext_infos) {
        this.ext_infos = ext_infos;
    }

    public ant_merchant_expand_shop_query_response.business_time[] getBusiness_time() {
        return business_time;
    }

    public void setBusiness_time(ant_merchant_expand_shop_query_response.business_time[] business_time) {
        this.business_time = business_time;
    }

    public ant_merchant_expand_shop_query_response.contact_infos[] getContact_infos() {
        return contact_infos;
    }

    public void setContact_infos(ant_merchant_expand_shop_query_response.contact_infos[] contact_infos) {
        this.contact_infos = contact_infos;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }
}
