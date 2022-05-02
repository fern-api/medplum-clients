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
  Optional<String> id();

  Optional<CodeableConcept> organismType();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> source();

  Optional<Range> amountRange();

  Optional<CodeableConcept> type();

  Optional<String> amountString();

  Optional<CodeableConcept> interaction();

  Optional<Identifier> target();

  Optional<CodeableConcept> organism();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> amountQuantity();

  Optional<CodeableConcept> amountType();

  static ImmutableSubstanceReferenceInformation_Target.Builder builder() {
    return ImmutableSubstanceReferenceInformation_Target.builder();
  }
}
