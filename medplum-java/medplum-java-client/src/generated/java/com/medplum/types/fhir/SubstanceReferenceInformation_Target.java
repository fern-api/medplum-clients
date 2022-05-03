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
    as = ImmutableSubstanceReferenceInformation_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation_Target {
  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<Identifier> target();

  Optional<CodeableConcept> organism();

  Optional<Range> amountRange();

  Optional<String> amountString();

  Optional<Quantity> amountQuantity();

  Optional<CodeableConcept> interaction();

  Optional<String> id();

  Optional<CodeableConcept> amountType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> source();

  Optional<CodeableConcept> organismType();

  static ImmutableSubstanceReferenceInformation_Target.Builder builder() {
    return ImmutableSubstanceReferenceInformation_Target.builder();
  }
}
