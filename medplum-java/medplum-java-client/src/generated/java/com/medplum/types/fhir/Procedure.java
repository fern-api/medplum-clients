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
  Optional<List<Identifier>> identifier();

  Optional<List<Uri>> instantiatesUri();

  Optional<CodeableConcept> code();

  Optional<Reference> asserter();

  Optional<List<Reference>> complicationDetail();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> instantiatesCanonical();

  Reference subject();

  Optional<List<Procedure_Performer>> performer();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Reference> encounter();

  Optional<List<Reference>> report();

  Optional<Period> performedPeriod();

  Optional<List<CodeableConcept>> followUp();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Annotation>> note();

  Optional<Meta> meta();

  Optional<String> performedDateTime();

  Optional<Age> performedAge();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> partOf();

  Optional<Code> language();

  Optional<Reference> recorder();

  Optional<Range> performedRange();

  Optional<String> performedString();

  Optional<List<CodeableConcept>> bodySite();

  Optional<List<CodeableConcept>> usedCode();

  Optional<List<Reference>> usedReference();

  Optional<List<Reference>> reasonReference();

  Optional<CodeableConcept> category();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Procedure_FocalDevice>> focalDevice();

  Optional<CodeableConcept> outcome();

  Optional<CodeableConcept> statusReason();

  Optional<Code> status();

  Optional<Reference> location();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> complication();

  static ImmutableProcedure.SubjectBuildStage builder() {
    return ImmutableProcedure.builder();
  }
}
