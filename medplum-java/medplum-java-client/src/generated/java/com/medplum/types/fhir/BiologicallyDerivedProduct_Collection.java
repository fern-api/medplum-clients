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
  Optional<Period> collectedPeriod();

  Optional<List<Extension>> extension();

  Optional<Reference> source();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> collector();

  Optional<String> collectedDateTime();

  static ImmutableBiologicallyDerivedProduct_Collection.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Collection.builder();
  }
}
