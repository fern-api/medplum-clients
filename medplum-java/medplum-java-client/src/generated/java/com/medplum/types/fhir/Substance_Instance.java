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
    as = ImmutableSubstance_Instance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Substance_Instance {
  Optional<String> id();

  Optional<DateTime> expiry();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<List<Extension>> extension();

  Optional<Quantity> quantity();

  static ImmutableSubstance_Instance.Builder builder() {
    return ImmutableSubstance_Instance.builder();
  }
}
