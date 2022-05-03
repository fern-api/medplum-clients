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
  Optional<Code> status();

  Optional<List<ResourceList>> contained();

  Optional<List<Procedure_FocalDevice>> focalDevice();

  Optional<List<Procedure_Performer>> performer();

  Optional<List<CodeableConcept>> complication();

  Optional<String> performedString();

  Optional<List<CodeableConcept>> followUp();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Reference> recorder();

  Optional<List<Reference>> complicationDetail();

  Optional<List<Reference>> usedReference();

  Optional<List<Reference>> basedOn();

  Optional<List<CodeableConcept>> usedCode();

  Optional<List<Reference>> partOf();

  Reference subject();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> reasonReference();

  Optional<Age> performedAge();

  Optional<CodeableConcept> outcome();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<String> performedDateTime();

  Optional<List<CodeableConcept>> bodySite();

  Optional<CodeableConcept> category();

  String resourceType();

  Optional<Range> performedRange();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<Annotation>> note();

  Optional<Period> performedPeriod();

  Optional<CodeableConcept> statusReason();

  Optional<Reference> encounter();

  Optional<List<Reference>> report();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Reference> location();

  Optional<Reference> asserter();

  Optional<List<Uri>> instantiatesUri();

  static ImmutableProcedure.SubjectBuildStage builder() {
    return ImmutableProcedure.builder();
  }
}
