package models.alignment;

public enum AlignmentIndex {
    CN("chaotic-neutral"),
    CE("chaotic-evil"),
    CG("chaotic-good"),
    LN("lawful-neutral"),
    LE("lawful-evil"),
    LG("lawful-good"),
    N("neutral"),
    NE("neutral-evil"),
    NG("neutral-good");

    private String description;

    AlignmentIndex(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
