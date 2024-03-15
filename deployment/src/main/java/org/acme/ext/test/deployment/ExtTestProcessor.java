package org.acme.ext.test.deployment;

import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class ExtTestProcessor {

    private static final String FEATURE = "ext-test";

    @BuildStep
    FeatureBuildItem feature(MySimpleBuildItem mySimpleBuildItem) {
        if (mySimpleBuildItem == null) {
            throw new NullPointerException("MySimpleBuildItem is null!");
        }
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    void produceMyBuildItem(BuildProducer<MySimpleBuildItem> producer) {
    }

}
