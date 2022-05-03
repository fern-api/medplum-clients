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
  Optional<CodeableConcept> businessStatus();

  Optional<List<Reference>> relevantHistory();

  Optional<CodeableConcept> code();

  Optional<Reference> focus();

  Optional<CodeableConcept> reasonCode();

  Optional<List<CodeableConcept>> performerType();

  Optional<List<Task_Input>> input();

  Optional<TaskStatus> status();

  Optional<TaskIntent> intent();

  Optional<Period> executionPeriod();

  Optional<List<Identifier>> identifier();

  Optional<Code> priority();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> instantiatesUri();

  Optional<List<Task_Output>> output();

  Optional<Identifier> groupIdentifier();

  Optional<List<Reference>> basedOn();

  @JsonProperty("for")
  Optional<Reference> _for();

  Optional<List<Reference>> insurance();

  Optional<Reference> encounter();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> statusReason();

  Optional<Reference> requester();

  Optional<Reference> owner();

  Optional<Reference> reasonReference();

  Optional<Task_Restriction> restriction();

  Optional<List<Annotation>> note();

  Optional<Reference> location();

  Optional<List<Reference>> partOf();

  Optional<Uri> implicitRules();

  Optional<DateTime> lastModified();

  Optional<Id> id();

  Optional<DateTime> authoredOn();

  Optional<Canonical> instantiatesCanonical();

  String resourceType();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<String> description();

  static ImmutableTask.ResourceTypeBuildStage builder() {
    return ImmutableTask.builder();
  }
}
