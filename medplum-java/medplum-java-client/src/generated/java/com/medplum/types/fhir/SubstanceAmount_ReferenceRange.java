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
    as = ImmutableSubstanceAmount_ReferenceRange.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceAmount_ReferenceRange {
  Optional<Quantity> lowLimit();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Quantity> highLimit();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceAmount_ReferenceRange.Builder builder() {
    return ImmutableSubstanceAmount_ReferenceRange.builder();
  }
}
