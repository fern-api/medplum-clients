package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableImmunization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Immunization {
  Reference patient();

  CodeableConcept vaccineCode();

  Optional<code> status();

  Optional<Quantity> doseQuantity();

  Optional<CodeableConcept> reportOrigin();

  Optional<String> lotNumber();

  Optional<dateTime> recorded();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> reasonReference();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<CodeableConcept> statusReason();

  Optional<List<Immunization_Education>> education();

  Optional<date> expirationDate();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> site();

  Optional<List<Immunization_Reaction>> reaction();

  Optional<Narrative> text();

  Optional<String> occurrenceDateTime();

  Optional<List<CodeableConcept>> programEligibility();

  Optional<CodeableConcept> route();

  Optional<CodeableConcept> fundingSource();

  Optional<Reference> manufacturer();

  Optional<id> id();

  Optional<List<Immunization_Performer>> performer();

  Optional<Boolean> isSubpotent();

  Optional<Reference> encounter();

  Optional<Boolean> primarySource();

  Optional<List<Extension>> extension();

  Optional<List<Immunization_ProtocolApplied>> protocolApplied();

  Optional<Reference> location();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<uri> implicitRules();

  Optional<List<Annotation>> note();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> subpotentReason();

  Optional<String> occurrenceString();

  static ImmutableImmunization.PatientBuildStage builder() {
    return ImmutableImmunization.builder();
  }
}
