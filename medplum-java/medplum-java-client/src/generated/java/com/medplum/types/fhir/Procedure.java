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
  Optional<CodeableConcept> category();

  Optional<List<Reference>> complicationDetail();

  String resourceType();

  Optional<List<Procedure_FocalDevice>> focalDevice();

  Optional<Age> performedAge();

  Optional<List<Reference>> report();

  Optional<List<Reference>> basedOn();

  Optional<String> performedString();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Reference> recorder();

  Optional<List<Uri>> instantiatesUri();

  Optional<Reference> location();

  Optional<List<Reference>> reasonReference();

  Optional<CodeableConcept> outcome();

  Optional<Id> id();

  Optional<Reference> encounter();

  Reference subject();

  Optional<List<CodeableConcept>> bodySite();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<CodeableConcept>> followUp();

  Optional<List<Procedure_Performer>> performer();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> usedReference();

  Optional<String> performedDateTime();

  Optional<List<Reference>> partOf();

  Optional<List<CodeableConcept>> usedCode();

  Optional<CodeableConcept> code();

  Optional<Code> status();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> complication();

  Optional<Code> language();

  Optional<CodeableConcept> statusReason();

  Optional<Period> performedPeriod();

  Optional<Range> performedRange();

  Optional<List<ResourceList>> contained();

  Optional<Reference> asserter();

  static ImmutableProcedure.ResourceTypeBuildStage builder() {
    return ImmutableProcedure.builder();
  }
}
