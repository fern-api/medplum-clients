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
  Optional<List<Annotation>> note();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Reference> reasonReference();

  @JsonProperty("for")
  Optional<Reference> _for();

  Optional<CodeableConcept> statusReason();

  Optional<CodeableConcept> code();

  Optional<Meta> meta();

  Optional<TaskIntent> intent();

  Optional<Period> executionPeriod();

  Optional<List<Reference>> relevantHistory();

  Optional<Uri> implicitRules();

  Optional<Reference> location();

  Optional<Task_Restriction> restriction();

  Optional<List<Task_Output>> output();

  Optional<List<Identifier>> identifier();

  Optional<Code> priority();

  Optional<DateTime> authoredOn();

  Optional<Reference> requester();

  Optional<Uri> instantiatesUri();

  Optional<List<Reference>> basedOn();

  Optional<Id> id();

  Optional<String> description();

  Optional<Canonical> instantiatesCanonical();

  Optional<Identifier> groupIdentifier();

  Optional<Reference> encounter();

  Optional<TaskStatus> status();

  Optional<List<Reference>> insurance();

  Optional<DateTime> lastModified();

  Optional<CodeableConcept> reasonCode();

  Optional<List<Task_Input>> input();

  String resourceType();

  Optional<Code> language();

  Optional<CodeableConcept> businessStatus();

  Optional<Reference> owner();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> focus();

  Optional<List<CodeableConcept>> performerType();

  Optional<List<Reference>> partOf();

  static ImmutableTask.ResourceTypeBuildStage builder() {
    return ImmutableTask.builder();
  }
}
