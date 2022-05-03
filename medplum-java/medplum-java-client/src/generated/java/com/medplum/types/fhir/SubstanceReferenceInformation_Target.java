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
  Optional<String> amountString();

  Optional<List<Extension>> extension();

  Optional<Quantity> amountQuantity();

  Optional<Range> amountRange();

  Optional<CodeableConcept> amountType();

  Optional<CodeableConcept> organismType();

  Optional<Identifier> target();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> interaction();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> organism();

  Optional<String> id();

  Optional<List<Reference>> source();

  static ImmutableSubstanceReferenceInformation_Target.Builder builder() {
    return ImmutableSubstanceReferenceInformation_Target.builder();
  }
}
