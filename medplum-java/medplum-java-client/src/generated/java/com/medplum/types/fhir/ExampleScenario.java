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
  Optional<String> version();

  Optional<Id> id();

  Optional<String> name();

  String resourceType();

  Optional<List<UsageContext>> useContext();

  Optional<List<Canonical>> workflow();

  Optional<List<ResourceList>> contained();

  Optional<ExamplescenarioStatus> status();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<ExampleScenario_Instance>> instance();

  Optional<List<Extension>> extension();

  Optional<List<ExampleScenario_Process>> process();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> url();

  Optional<Meta> meta();

  Optional<String> publisher();

  Optional<List<ContactDetail>> contact();

  Optional<List<Identifier>> identifier();

  Optional<Markdown> copyright();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ExampleScenario_Actor>> actor();

  Optional<Boolean> experimental();

  Optional<DateTime> date();

  Optional<Markdown> purpose();

  static ImmutableExampleScenario.ResourceTypeBuildStage builder() {
    return ImmutableExampleScenario.builder();
  }
}
