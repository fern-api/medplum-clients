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
  Optional<List<Immunization_Performer>> performer();

  Optional<CodeableConcept> route();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Immunization_Education>> education();

  Optional<String> occurrenceDateTime();

  Optional<Reference> encounter();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<CodeableConcept>> subpotentReason();

  Optional<Boolean> primarySource();

  Optional<CodeableConcept> statusReason();

  Optional<DateTime> recorded();

  Optional<List<Annotation>> note();

  Optional<Boolean> isSubpotent();

  Optional<String> occurrenceString();

  CodeableConcept vaccineCode();

  Optional<CodeableConcept> fundingSource();

  Optional<Uri> implicitRules();

  Optional<List<Immunization_Reaction>> reaction();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Reference patient();

  Optional<CodeableConcept> reportOrigin();

  Optional<Code> status();

  Optional<String> lotNumber();

  Optional<List<Reference>> reasonReference();

  Optional<List<Identifier>> identifier();

  Optional<Date> expirationDate();

  Optional<Reference> manufacturer();

  Optional<List<Immunization_ProtocolApplied>> protocolApplied();

  Optional<Reference> location();

  Optional<Quantity> doseQuantity();

  Optional<CodeableConcept> site();

  Optional<List<CodeableConcept>> programEligibility();

  Optional<Code> language();

  String resourceType();

  static ImmutableImmunization.VaccineCodeBuildStage builder() {
    return ImmutableImmunization.builder();
  }
}
