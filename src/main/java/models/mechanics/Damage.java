package models.mechanics;

import models.mechanics.enums.DamageType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.annotations.TypedForge;
import models.utility.path.ClassGameMechanics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

@TypedForge(name="damage_types", forge= DamageType.class)
public class Damage extends DefaultDataAPI {
    private String[] desc;

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }


    /**
     * Get list.
     *
     * @return the list
     * @throws IOException the io exception
     */
    public static List<Damage> get() throws IOException {
        List<Damage> damage_list = new ArrayList<>();
        DamageType[] values = DamageType.values();

        for (DamageType type : values) {
            Damage index = getIndex(type);
            damage_list.add(index);
        }

        return damage_list;
    }

    /**
     * Gets index.
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static Damage getIndex(DamageType type) throws IOException {
        String path = getServer() + ClassGameMechanics.DAMAGE_TYPES.endpointReplace(type.name());
        return (Damage) RequestAPI.GET(path, Damage.class);
    }
}