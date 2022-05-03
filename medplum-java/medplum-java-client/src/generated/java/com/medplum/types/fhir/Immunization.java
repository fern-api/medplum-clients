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
  Optional<Code> status();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> primarySource();

  Optional<CodeableConcept> reportOrigin();

  String resourceType();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Meta> meta();

  CodeableConcept vaccineCode();

  Optional<Boolean> isSubpotent();

  Optional<List<Immunization_Reaction>> reaction();

  Optional<String> occurrenceString();

  Optional<List<CodeableConcept>> subpotentReason();

  Optional<List<Immunization_Performer>> performer();

  Optional<Uri> implicitRules();

  Optional<String> occurrenceDateTime();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Reference patient();

  Optional<List<Immunization_ProtocolApplied>> protocolApplied();

  Optional<Narrative> text();

  Optional<String> lotNumber();

  Optional<List<Immunization_Education>> education();

  Optional<Id> id();

  Optional<CodeableConcept> site();

  Optional<Quantity> doseQuantity();

  Optional<Reference> manufacturer();

  Optional<List<CodeableConcept>> programEligibility();

  Optional<CodeableConcept> fundingSource();

  Optional<List<Reference>> reasonReference();

  Optional<List<Annotation>> note();

  Optional<List<Identifier>> identifier();

  Optional<Reference> location();

  Optional<CodeableConcept> route();

  Optional<Reference> encounter();

  Optional<CodeableConcept> statusReason();

  Optional<DateTime> recorded();

  Optional<Date> expirationDate();

  Optional<List<Extension>> extension();

  static ImmutableImmunization.ResourceTypeBuildStage builder() {
    return ImmutableImmunization.builder();
  }
}
