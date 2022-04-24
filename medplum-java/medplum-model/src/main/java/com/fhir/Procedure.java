package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<canonical>> instantiatesCanonical();

  Optional<CodeableConcept> statusReason();

  Optional<List<Reference>> basedOn();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> code();

  Optional<Reference> encounter();

  Optional<String> performedDateTime();

  Optional<Period> performedPeriod();

  Optional<Age> performedAge();

  Optional<Range> performedRange();

  Optional<CodeableConcept> category();

  String resourceType();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<id> id();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> usedReference();

  Optional<Reference> location();

  Optional<Reference> recorder();

  Optional<List<Reference>> reasonReference();

  Optional<List<CodeableConcept>> followUp();

  Optional<code> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> complication();

  Optional<List<Procedure_Performer>> performer();

  Optional<List<Reference>> report();

  Optional<String> performedString();

  Reference subject();

  Optional<List<Annotation>> note();

  Optional<List<Procedure_FocalDevice>> focalDevice();

  Optional<Reference> asserter();

  Optional<code> language();

  Optional<CodeableConcept> outcome();

  Optional<List<uri>> instantiatesUri();

  Optional<List<CodeableConcept>> bodySite();

  Optional<List<CodeableConcept>> usedCode();

  Optional<uri> implicitRules();

  Optional<List<Reference>> complicationDetail();

  Optional<List<CodeableConcept>> reasonCode();

  static ImmutableProcedure.ResourceTypeBuildStage builder() {
    return ImmutableProcedure.builder();
  }
}
