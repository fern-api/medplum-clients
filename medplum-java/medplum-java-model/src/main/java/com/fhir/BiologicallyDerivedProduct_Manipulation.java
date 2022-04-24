package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<String> timeDateTime();

  Optional<Period> timePeriod();

  static ImmutableBiologicallyDerivedProduct_Manipulation.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Manipulation.builder();
  }
}
