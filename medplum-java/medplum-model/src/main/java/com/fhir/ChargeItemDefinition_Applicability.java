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
    as = ImmutableChargeItemDefinition_Applicability.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ChargeItemDefinition_Applicability {
  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<String> expression();

  Optional<String> id();

  Optional<String> language();

  Optional<List<Extension>> modifierExtension();

  static ImmutableChargeItemDefinition_Applicability.Builder builder() {
    return ImmutableChargeItemDefinition_Applicability.builder();
  }
}
