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
    as = ImmutableSubstanceReferenceInformation_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation_Target {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> amountString();

  Optional<List<Reference>> source();

  Optional<Range> amountRange();

  Optional<CodeableConcept> organismType();

  Optional<Identifier> target();

  Optional<CodeableConcept> organism();

  Optional<CodeableConcept> type();

  Optional<Quantity> amountQuantity();

  Optional<CodeableConcept> interaction();

  Optional<CodeableConcept> amountType();

  Optional<String> id();

  static ImmutableSubstanceReferenceInformation_Target.Builder builder() {
    return ImmutableSubstanceReferenceInformation_Target.builder();
  }
}
