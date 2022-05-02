package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTask.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Task {
  Optional<CodeableConcept> code();

  Optional<Canonical> instantiatesCanonical();

  Optional<String> description();

  Optional<Reference> focus();

  Optional<List<Reference>> insurance();

  Optional<List<Task_Output>> output();

  Optional<Reference> reasonReference();

  Optional<List<CodeableConcept>> performerType();

  Optional<Narrative> text();

  Optional<Reference> requester();

  Optional<List<Reference>> relevantHistory();

  Optional<TaskIntent> intent();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> statusReason();

  Optional<Reference> location();

  Optional<TaskStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<Reference> encounter();

  String resourceType();

  Optional<List<Task_Input>> input();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Uri> instantiatesUri();

  Optional<DateTime> lastModified();

  Optional<List<Annotation>> note();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> partOf();

  Optional<DateTime> authoredOn();

  Optional<Reference> owner();

  Optional<Code> priority();

  @JsonProperty("for")
  Optional<Reference> _for();

  Optional<Period> executionPeriod();

  Optional<CodeableConcept> businessStatus();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> basedOn();

  Optional<Identifier> groupIdentifier();

  Optional<CodeableConcept> reasonCode();

  Optional<Task_Restriction> restriction();

  static ImmutableTask.ResourceTypeBuildStage builder() {
    return ImmutableTask.builder();
  }
}
