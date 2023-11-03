package com.failall.cultivation_miracle.cultivation;

public class CultivationStage {

    private final String name;

    public CultivationStage(String name) {
        this.name = name;
    }

    // A CultivationStage should belong to a Realm and has several ranks.
    // All ranks are divided overall over the Realm(stats including), but still the stage number can be checked
    // e.g. One Realm has a Stage that has 10 levels.
    // all stats/limits we define for that stage are divided by 10(should be a nice number) and thus we need no
    // definition of each level of the stage.
    // e.g. If realm is called "EARTH_REALM", the Stage is called "EARTH_STAGE" and has - for example - 10 levels

    // TODO we need to define a method for ranking up
    // TODO look at old repo

}
