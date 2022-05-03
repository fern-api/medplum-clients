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
  Optional<List<UsageContext>> useContext();

  Optional<List<ExampleScenario_Instance>> instance();

  Optional<List<Canonical>> workflow();

  Optional<String> name();

  Optional<Markdown> copyright();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<Markdown> purpose();

  Optional<ExamplescenarioStatus> status();

  Optional<Narrative> text();

  Optional<String> publisher();

  Optional<Uri> url();

  Optional<List<ExampleScenario_Actor>> actor();

  Optional<String> version();

  Optional<List<Extension>> extension();

  Optional<Boolean> experimental();

  Optional<List<Identifier>> identifier();

  Optional<List<ExampleScenario_Process>> process();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactDetail>> contact();

  String resourceType();

  Optional<Id> id();

  static ImmutableExampleScenario.ResourceTypeBuildStage builder() {
    return ImmutableExampleScenario.builder();
  }
}
