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
  Optional<DateTime> recorded();

  Optional<Reference> location();

  Optional<Boolean> primarySource();

  Optional<List<Immunization_ProtocolApplied>> protocolApplied();

  Optional<List<Immunization_Reaction>> reaction();

  Optional<CodeableConcept> fundingSource();

  Optional<List<CodeableConcept>> subpotentReason();

  Optional<List<Extension>> extension();

  Optional<List<Immunization_Performer>> performer();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Immunization_Education>> education();

  Optional<Boolean> isSubpotent();

  Optional<List<ResourceList>> contained();

  CodeableConcept vaccineCode();

  Optional<Reference> encounter();

  Optional<CodeableConcept> statusReason();

  Optional<List<Extension>> modifierExtension();

  Optional<Date> expirationDate();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> site();

  Optional<String> occurrenceString();

  Optional<String> occurrenceDateTime();

  Optional<Code> status();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<Quantity> doseQuantity();

  Optional<Reference> manufacturer();

  Optional<List<Annotation>> note();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<CodeableConcept> route();

  Optional<String> lotNumber();

  Reference patient();

  Optional<CodeableConcept> reportOrigin();

  Optional<List<CodeableConcept>> programEligibility();

  Optional<Id> id();

  Optional<List<Reference>> reasonReference();

  static ImmutableImmunization.VaccineCodeBuildStage builder() {
    return ImmutableImmunization.builder();
  }
}
