package com.happycoderz.cryptfolio.utils;

import io.realm.DynamicRealm;
import io.realm.RealmMigration;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;

public class RealmMigrations implements RealmMigration {

    @Override
    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {
        final RealmSchema schema = realm.getSchema();

        if (oldVersion == 1) {
            schema.create("Coin");
            oldVersion ++;
        }

        if (oldVersion == 2) {
            schema.create("Transaction");
            oldVersion++;
        }
    }
}