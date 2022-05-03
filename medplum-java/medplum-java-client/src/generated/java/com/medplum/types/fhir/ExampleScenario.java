package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableExampleScenario.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario {
  Optional<String> name();

  Optional<List<Canonical>> workflow();

  Optional<Boolean> experimental();

  Optional<Markdown> purpose();

  Optional<List<ExampleScenario_Actor>> actor();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> publisher();

  Optional<List<ExampleScenario_Instance>> instance();

  Optional<List<Identifier>> identifier();

  Optional<List<UsageContext>> useContext();

  String resourceType();

  Optional<Code> language();

  Optional<List<ContactDetail>> contact();

  Optional<List<ExampleScenario_Process>> process();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Markdown> copyright();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<DateTime> date();

  Optional<String> version();

  Optional<Uri> url();

  Optional<ExamplescenarioStatus> status();

  static ImmutableExampleScenario.ResourceTypeBuildStage builder() {
    return ImmutableExampleScenario.builder();
  }
}
