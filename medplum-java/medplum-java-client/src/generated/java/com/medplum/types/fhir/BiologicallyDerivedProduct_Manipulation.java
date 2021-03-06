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
    as = ImmutableBiologicallyDerivedProduct_Manipulation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface BiologicallyDerivedProduct_Manipulation {
  Optional<String> id();

  Optional<String> timeDateTime();

  Optional<List<Extension>> extension();

  Optional<Period> timePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  static ImmutableBiologicallyDerivedProduct_Manipulation.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Manipulation.builder();
  }
}
