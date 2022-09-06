package com.turcato.ticiane.londonairportdistance.proxy;

/**
 * The Result from the json returned by the postcode.io API
 */
public class Result {

    private String postcode;
    private int quality;
    private int eastings;
    private int northings;
    private String country;
    private String nhs_ha;
    private double longitude;
    private double latitude;
    private String european_electoral_region;
    private String primary_care_trust;
    private String region;
    private String lsoa;
    private String msoa;
    private String incode;
    private String outcode;
    private String parliamentary_constituency;
    private String admin_district;
    private String parish;
    private Object admin_county;
    private String admin_ward;
    private Object ced;
    private String ccg;
    private String nuts;
    private Codes codes;
    private boolean result;

    /**
     * Default constructor
     */
    public Result() {
    }

    /**
     * Constructor to check the postcode validation
     * @param result boolean
     */
    public Result(boolean result) {
        this.result = result;
    }

    /**
     * Result constructor with all the parameters returned by the API in json format
     * @param postcode                      searched
     * @param quality                       of the postcode
     * @param eastings                      of the postcode
     * @param northings                     of the postcode
     * @param country                       of the postcode
     * @param nhs_ha                        of the postcode
     * @param longitude                     of the postcode
     * @param latitude                      of the postcode
     * @param european_electoral_region     of the postcode
     * @param primary_care_trust            of the postcode
     * @param region                        of the postcode
     * @param lsoa                          of the postcode
     * @param msoa                          of the postcode
     * @param incode                        of the postcode
     * @param outcode                       of the postcode
     * @param parliamentary_constituency    of the postcode
     * @param admin_district                of the postcode
     * @param parish                        of the postcode
     * @param admin_county                  of the postcode
     * @param admin_ward                    of the postcode
     * @param ced                           of the postcode
     * @param ccg                           of the postcode
     * @param nuts                          of the postcode
     * @param codes                         of the postcode
     */
    public Result(String postcode, int quality, int eastings, int northings, String country,
                  String nhs_ha, double longitude, double latitude, String european_electoral_region,
                  String primary_care_trust, String region, String lsoa, String msoa, String incode,
                  String outcode, String parliamentary_constituency, String admin_district,
                  String parish, Object admin_county, String admin_ward, Object ced, String ccg,
                  String nuts, Codes codes) {
        this.postcode = postcode;
        this.quality = quality;
        this.eastings = eastings;
        this.northings = northings;
        this.country = country;
        this.nhs_ha = nhs_ha;
        this.longitude = longitude;
        this.latitude = latitude;
        this.european_electoral_region = european_electoral_region;
        this.primary_care_trust = primary_care_trust;
        this.region = region;
        this.lsoa = lsoa;
        this.msoa = msoa;
        this.incode = incode;
        this.outcode = outcode;
        this.parliamentary_constituency = parliamentary_constituency;
        this.admin_district = admin_district;
        this.parish = parish;
        this.admin_county = admin_county;
        this.admin_ward = admin_ward;
        this.ced = ced;
        this.ccg = ccg;
        this.nuts = nuts;
        this.codes = codes;
    }

    /**
     * Gets the postcode searched
     * @return the postcode searched
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the postcode searched
     * @param postcode searched
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Gets the postcode quality
     * @return quality of the postcode
     */
    public int getQuality() {
        return quality;
    }

    /**
     * Sets the postcode quality
     * @param quality of the postcode
     */
    public void setQuality(int quality) {
        this.quality = quality;
    }

    /**
     * Gets the postcode eastings
     * @return the postcode eastings
     */
    public int getEastings() {
        return eastings;
    }

    /**
     * Sets the postcode eastings
     * @param eastings of the postcode
     */
    public void setEastings(int eastings) {
        this.eastings = eastings;
    }

    /**
     * Gets the postcode northings
     * @return the postcode northings
     */
    public int getNorthings() {
        return northings;
    }

    /**
     * Sets the postcode northings
     * @param northings of the postcode
     */
    public void setNorthings(int northings) {
        this.northings = northings;
    }

    /**
     * Gets the postcode country
     * @return the postcode country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the postcode country
     * @param country of the postcode
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the postcode nhs ha
     * @return the postcode nhs ha
     */
    public String getNhs_ha() {
        return nhs_ha;
    }

    /**
     * Sets the postcode nhs ha
     * @param nhs_ha of the postcode
     */
    public void setNhs_ha(String nhs_ha) {
        this.nhs_ha = nhs_ha;
    }

    /**
     * Gets the postcode longitude
     * @return the postcode longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the postcode longitude
     * @param longitude of the postcode
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets the postcode latitude
     * @return the postcode latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the postcode latitude
     * @param latitude of the postcode
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets the postcode european electoral region
     * @return the postcode european electoral region
     */
    public String getEuropean_electoral_region() {
        return european_electoral_region;
    }

    /**
     * Sets the postcode european electoral region
     * @param european_electoral_region of the postcode
     */
    public void setEuropean_electoral_region(String european_electoral_region) {
        this.european_electoral_region = european_electoral_region;
    }

    /**
     * Gets the postcode primary care trust
     * @return the postcode primary care trust
     */
    public String getPrimary_care_trust() {
        return primary_care_trust;
    }

    /**
     * Sets the postcode primary care trust
     * @param primary_care_trust of the postcode
     */
    public void setPrimary_care_trust(String primary_care_trust) {
        this.primary_care_trust = primary_care_trust;
    }

    /**
     * Gets the postcode region
     * @return the postcode region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the postcode region
     * @param region of the postcode
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the postcode lsoa
     * @return the postcode lsoa
     */
    public String getLsoa() {
        return lsoa;
    }

    /**
     * Sets the postcode lsoa
     * @param lsoa of the postcode
     */
    public void setLsoa(String lsoa) {
        this.lsoa = lsoa;
    }

    /**
     * Gets the postcode msoa
     * @return the postcode msoa
     */
    public String getMsoa() {
        return msoa;
    }

    /**
     * Sets the postcode msoa
     * @param msoa of the postcode
     */
    public void setMsoa(String msoa) {
        this.msoa = msoa;
    }

    /**
     * Gets the postcode incode
     * @return the postcode incode
     */
    public String getIncode() {
        return incode;
    }

    /**
     * Sets the postcode incode
     * @param incode of the postcode
     */
    public void setIncode(String incode) {
        this.incode = incode;
    }

    /**
     * Gets the postcode outcode
     * @return the postcode outcode
     */
    public String getOutcode() {
        return outcode;
    }

    /**
     * Sets the postcode outcode
     * @param outcode of the postcode
     */
    public void setOutcode(String outcode) {
        this.outcode = outcode;
    }

    /**
     * Gets the postcode parliamentary constituency
     * @return the postcode parliamentary constituency
     */
    public String getParliamentary_constituency() {
        return parliamentary_constituency;
    }

    /**
     * Sets the postcode parliamentary constituency
     * @param parliamentary_constituency of the postcode
     */
    public void setParliamentary_constituency(String parliamentary_constituency) {
        this.parliamentary_constituency = parliamentary_constituency;
    }

    /**
     * Gets the postcode admin district
     * @return the postcode admin district
     */
    public String getAdmin_district() {
        return admin_district;
    }

    /**
     * Sets the postcode admin district
     * @param admin_district of the postcode
     */
    public void setAdmin_district(String admin_district) {
        this.admin_district = admin_district;
    }

    /**
     * Gets the postcode parish
     * @return the postcode parish
     */
    public String getParish() {
        return parish;
    }

    /**
     * Sets the postcode parish
     * @param parish of the postcode
     */
    public void setParish(String parish) {
        this.parish = parish;
    }

    /**
     * Gets the postcode admin country
     * @return the postcode admin country
     */
    public Object getAdmin_county() {
        return admin_county;
    }

    /**
     * Sets the postcode admin country
     * @param admin_county of the postcode
     */
    public void setAdmin_county(Object admin_county) {
        this.admin_county = admin_county;
    }

    /**
     * Gets the postcode admin ward
     * @return the postcode admin ward
     */
    public String getAdmin_ward() {
        return admin_ward;
    }

    /**
     * Sets the postcode admin ward
     * @param admin_ward of the postcode
     */
    public void setAdmin_ward(String admin_ward) {
        this.admin_ward = admin_ward;
    }

    /**
     * Gets the postcode ced
     * @return the postcode ced
     */
    public Object getCed() {
        return ced;
    }

    /**
     * Sets the postcode ced
     * @param ced of the postcode
     */
    public void setCed(Object ced) {
        this.ced = ced;
    }

    /**
     * Gets the postcode ccg
     * @return the postcode ccg
     */
    public String getCcg() {
        return ccg;
    }

    /**
     * Sets the postcode ccg
     * @param ccg of the postcode
     */
    public void setCcg(String ccg) {
        this.ccg = ccg;
    }

    /**
     * Gets the postcode nuts
     * @return the postcode nuts
     */
    public String getNuts() {
        return nuts;
    }

    /**
     * Sets the postcode nuts
     * @param nuts of the postcode
     */
    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    /**
     * Gets the postcode codes
     * @return the postcode codes
     */
    public Codes getCodes() {
        return codes;
    }

    /**
     * Sets the postcode codes
     * @param codes of the postcode
     */
    public void setCodes(Codes codes) {
        this.codes = codes;
    }

    /**
     * Gets the postcode result
     * @return the postcode result
     */
    public boolean isResult() {
        return result;
    }

    /**
     * Sets the postcode result
     * @param result of the postcode
     */
    public void setResult(boolean result) {
        this.result = result;
    }
}
