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
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> owner();

  Optional<Period> executionPeriod();

  Optional<Reference> requester();

  Optional<Identifier> groupIdentifier();

  Optional<List<CodeableConcept>> performerType();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> relevantHistory();

  Optional<Code> priority();

  Optional<Task_Restriction> restriction();

  Optional<CodeableConcept> statusReason();

  Optional<TaskStatus> status();

  Optional<List<Annotation>> note();

  Optional<CodeableConcept> reasonCode();

  Optional<List<Reference>> basedOn();

  Optional<List<Task_Input>> input();

  Optional<Uri> instantiatesUri();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> partOf();

  String resourceType();

  Optional<Meta> meta();

  @JsonProperty("for")
  Optional<Reference> _for();

  Optional<List<Reference>> insurance();

  Optional<Id> id();

  Optional<String> description();

  Optional<TaskIntent> intent();

  Optional<DateTime> authoredOn();

  Optional<List<Task_Output>> output();

  Optional<Narrative> text();

  Optional<CodeableConcept> code();

  Optional<Reference> encounter();

  Optional<Reference> reasonReference();

  Optional<Code> language();

  Optional<Canonical> instantiatesCanonical();

  Optional<Reference> location();

  Optional<DateTime> lastModified();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> businessStatus();

  Optional<Reference> focus();

  static ImmutableTask.ResourceTypeBuildStage builder() {
    return ImmutableTask.builder();
  }
}
