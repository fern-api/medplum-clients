package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<CodeableConcept>> programEligibility();

  Optional<Uri> implicitRules();

  Optional<List<Immunization_Performer>> performer();

  Optional<String> occurrenceDateTime();

  Optional<Date> expirationDate();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<Reference> encounter();

  Optional<CodeableConcept> site();

  Optional<Meta> meta();

  Optional<Reference> location();

  Optional<Quantity> doseQuantity();

  Optional<List<Reference>> reasonReference();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<Code> status();

  Optional<List<Annotation>> note();

  Reference patient();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> subpotentReason();

  String resourceType();

  Optional<Boolean> isSubpotent();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> fundingSource();

  Optional<List<Immunization_Education>> education();

  Optional<CodeableConcept> statusReason();

  Optional<Boolean> primarySource();

  Optional<Reference> manufacturer();

  Optional<CodeableConcept> route();

  Optional<CodeableConcept> reportOrigin();

  CodeableConcept vaccineCode();

  Optional<List<Immunization_ProtocolApplied>> protocolApplied();

  Optional<Code> language();

  Optional<DateTime> recorded();

  Optional<String> lotNumber();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Immunization_Reaction>> reaction();

  Optional<String> occurrenceString();

  static ImmutableImmunization.PatientBuildStage builder() {
    return ImmutableImmunization.builder();
  }
}
