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
  Optional<List<ContactDetail>> contact();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ExampleScenario_Process>> process();

  Optional<Uri> implicitRules();

  Optional<String> publisher();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> date();

  Optional<Markdown> copyright();

  Optional<Uri> url();

  Optional<String> name();

  Optional<List<ResourceList>> contained();

  Optional<List<ExampleScenario_Instance>> instance();

  Optional<Id> id();

  Optional<List<UsageContext>> useContext();

  Optional<List<Canonical>> workflow();

  String resourceType();

  Optional<Meta> meta();

  Optional<ExamplescenarioStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> experimental();

  Optional<String> version();

  Optional<Markdown> purpose();

  Optional<Code> language();

  Optional<List<ExampleScenario_Actor>> actor();

  static ImmutableExampleScenario.ResourceTypeBuildStage builder() {
    return ImmutableExampleScenario.builder();
  }
}
