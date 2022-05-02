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
  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<String> timeDateTime();

  Optional<String> id();

  Optional<Period> timePeriod();

  static ImmutableBiologicallyDerivedProduct_Manipulation.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Manipulation.builder();
  }
}
