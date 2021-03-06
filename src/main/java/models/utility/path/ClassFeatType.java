package models.utility.path;


public enum ClassFeatType {
    FEATS("api/feats/{index}"),
    MONSTER("api/monsters/{index}"),
    RACES("api/races/{index}"),
    RULES_SECTIONS("api/rule-sections/{index}"),
    RULES("api/rules/{index}");


    private String endpoint;

    ClassFeatType(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Gets endpoint.
     *
     * @return the endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     *
     * @param endpoint the endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Endpoint replace string.
     *
     * @param index the index
     * @return the string
     */
    public String endpointReplace(String index) {
        return getEndpoint().replace("{index}", index);
    }
}
