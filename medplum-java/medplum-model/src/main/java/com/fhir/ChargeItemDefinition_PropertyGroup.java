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
    as = ImmutableChargeItemDefinition_PropertyGroup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ChargeItemDefinition_PropertyGroup {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ChargeItemDefinition_Applicability>> applicability();

  Optional<String> id();

  Optional<List<ChargeItemDefinition_PriceComponent>> priceComponent();

  static ImmutableChargeItemDefinition_PropertyGroup.Builder builder() {
    return ImmutableChargeItemDefinition_PropertyGroup.builder();
  }
}
