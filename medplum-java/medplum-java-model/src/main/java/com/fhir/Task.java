package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Reference>> basedOn();

  Optional<uri> implicitRules();

  Optional<CodeableConcept> statusReason();

  @JsonProperty("for")
  Optional<Reference> _for();

  Optional<List<Extension>> extension();

  Optional<uri> instantiatesUri();

  Optional<TaskIntent> intent();

  Optional<Identifier> groupIdentifier();

  Optional<List<Annotation>> note();

  Optional<TaskStatus> status();

  Optional<List<Task_Output>> output();

  Optional<Reference> owner();

  Optional<id> id();

  Optional<CodeableConcept> code();

  Optional<List<Task_Input>> input();

  Optional<Narrative> text();

  Optional<Task_Restriction> restriction();

  Optional<Reference> encounter();

  Optional<Reference> focus();

  Optional<Reference> location();

  Optional<List<Identifier>> identifier();

  Optional<Reference> requester();

  Optional<List<CodeableConcept>> performerType();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> insurance();

  Optional<List<Reference>> relevantHistory();

  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> lastModified();

  Optional<canonical> instantiatesCanonical();

  Optional<Period> executionPeriod();

  Optional<CodeableConcept> businessStatus();

  Optional<Reference> reasonReference();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<dateTime> authoredOn();

  String resourceType();

  Optional<code> language();

  Optional<code> priority();

  Optional<List<Reference>> partOf();

  Optional<CodeableConcept> reasonCode();

  static ImmutableTask.ResourceTypeBuildStage builder() {
    return ImmutableTask.builder();
  }
}
