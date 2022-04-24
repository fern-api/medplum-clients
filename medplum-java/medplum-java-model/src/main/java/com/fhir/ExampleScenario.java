package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<dateTime> date();

  Optional<List<ExampleScenario_Process>> process();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<uri> url();

  Optional<String> name();

  Optional<uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  Optional<markdown> purpose();

  Optional<String> version();

  Optional<Meta> meta();

  Optional<List<ExampleScenario_Instance>> instance();

  Optional<List<ContactDetail>> contact();

  Optional<List<canonical>> workflow();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ExampleScenario_Actor>> actor();

  String resourceType();

  Optional<ExamplescenarioStatus> status();

  Optional<Narrative> text();

  Optional<Boolean> experimental();

  Optional<code> language();

  Optional<String> publisher();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<markdown> copyright();

  static ImmutableExampleScenario.ResourceTypeBuildStage builder() {
    return ImmutableExampleScenario.builder();
  }
}
