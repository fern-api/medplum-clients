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
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> amountType();

  Optional<Identifier> target();

  Optional<String> id();

  Optional<Range> amountRange();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> interaction();

  Optional<Quantity> amountQuantity();

  Optional<String> amountString();

  Optional<CodeableConcept> organism();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> source();

  Optional<CodeableConcept> organismType();

  static ImmutableSubstanceReferenceInformation_Target.Builder builder() {
    return ImmutableSubstanceReferenceInformation_Target.builder();
  }
}
