package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableBiologicallyDerivedProduct_Collection.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface BiologicallyDerivedProduct_Collection {
  Optional<List<Extension>> extension();

  Optional<Period> collectedPeriod();

  Optional<String> id();

  Optional<String> collectedDateTime();

  Optional<Reference> source();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> collector();

  static ImmutableBiologicallyDerivedProduct_Collection.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Collection.builder();
  }
}
