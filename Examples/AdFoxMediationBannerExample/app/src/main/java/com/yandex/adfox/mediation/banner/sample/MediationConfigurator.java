/*
 * This file is a part of the Yandex Advertising Network
 *
 * Version for Android (C) 2018 YANDEX
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at https://legal.yandex.com/partner_ch/
 */
package com.yandex.adfox.mediation.banner.sample;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

class MediationConfigurator {

    static final Map<String, String> ADFOX_DEMO_BANNER = createAdFoxParameters();
    static final Map<String, String> ADMOB_DEMO_BANNER = createAdMobParameters();
    static final Map<String, String> FACEBOOK_DEMO_BANNER = createFacebookParameters();
    static final Map<String, String> MOPUB_DEMO_BANNER = createMoPubParameters();
    static final Map<String, String> MYTARGET_DEMO_BANNER = createMyTargetParameters();
    static final Map<String, String> STARTAPP_DEMO_BANNER = createStartAppParameters();

    @NonNull
    private static Map<String, String> createAdFoxParameters() {
        final Map<String, String> parameters = new HashMap<>();
        parameters.put("adf_ownerid", "270901");
        parameters.put("adf_p1", "caxrr");
        parameters.put("adf_p2", "fhme");
        parameters.put("adf_pt", "b");

        return parameters;
    }

    @NonNull
    private static Map<String, String> createAdMobParameters() {
        final Map<String, String> parameters = new HashMap<>();
        parameters.put("adf_ownerid", "270901");
        parameters.put("adf_p1", "caaxz");
        parameters.put("adf_p2", "fhme");
        parameters.put("adf_pt", "b");

        return parameters;
    }

    @NonNull
    private static Map<String, String> createFacebookParameters() {
        final Map<String, String> parameters = new HashMap<>();
        parameters.put("adf_ownerid", "270901");
        parameters.put("adf_p1", "caalv");
        parameters.put("adf_p2", "fhme");
        parameters.put("adf_pt", "b");

        return parameters;
    }

    @NonNull
    private static Map<String, String> createMoPubParameters() {
        final Map<String, String> parameters = new HashMap<>();
        parameters.put("adf_ownerid", "270901");
        parameters.put("adf_p1", "caalw");
        parameters.put("adf_p2", "fhme");
        parameters.put("adf_pt", "b");

        return parameters;
    }

    @NonNull
    private static Map<String, String> createMyTargetParameters() {
        final Map<String, String> parameters = new HashMap<>();
        parameters.put("adf_ownerid", "270901");
        parameters.put("adf_p1", "caalx");
        parameters.put("adf_p2", "fhme");
        parameters.put("adf_pt", "b");

        return parameters;
    }

    @NonNull
    private static Map<String, String> createStartAppParameters() {
        final Map<String, String> parameters = new HashMap<>();
        parameters.put("adf_ownerid", "270901");
        parameters.put("adf_p1", "caaly");
        parameters.put("adf_p2", "fhme");
        parameters.put("adf_pt", "b");

        return parameters;
    }
}
