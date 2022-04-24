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
    as = ImmutableSubstance_Instance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Substance_Instance {
  Optional<List<Extension>> extension();

  Optional<Identifier> identifier();

  Optional<String> id();

  Optional<dateTime> expiry();

  Optional<Quantity> quantity();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSubstance_Instance.Builder builder() {
    return ImmutableSubstance_Instance.builder();
  }
}
