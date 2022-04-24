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
    as = ImmutableSubstanceAmount_ReferenceRange.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceAmount_ReferenceRange {
  Optional<List<Extension>> extension();

  Optional<Quantity> highLimit();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Quantity> lowLimit();

  static ImmutableSubstanceAmount_ReferenceRange.Builder builder() {
    return ImmutableSubstanceAmount_ReferenceRange.builder();
  }
}
