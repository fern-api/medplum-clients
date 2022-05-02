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
    as = ImmutableProcedure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Procedure {
  Optional<Code> language();

  Optional<Reference> encounter();

  Optional<String> performedDateTime();

  Optional<Age> performedAge();

  Optional<Period> performedPeriod();

  Optional<List<CodeableConcept>> usedCode();

  Optional<CodeableConcept> category();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> complicationDetail();

  Optional<Narrative> text();

  Optional<CodeableConcept> statusReason();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Reference>> partOf();

  String resourceType();

  Optional<List<Reference>> reasonReference();

  Optional<List<Reference>> basedOn();

  Optional<Code> status();

  Optional<List<CodeableConcept>> bodySite();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> code();

  Optional<Reference> location();

  Optional<String> performedString();

  Optional<Id> id();

  Optional<Reference> asserter();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<CodeableConcept>> complication();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> outcome();

  Optional<List<Reference>> report();

  Optional<List<Procedure_Performer>> performer();

  Optional<List<Annotation>> note();

  Optional<List<Procedure_FocalDevice>> focalDevice();

  Optional<List<CodeableConcept>> followUp();

  Optional<Reference> recorder();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<List<Reference>> usedReference();

  Reference subject();

  Optional<List<Extension>> extension();

  Optional<Range> performedRange();

  static ImmutableProcedure.ResourceTypeBuildStage builder() {
    return ImmutableProcedure.builder();
  }
}
