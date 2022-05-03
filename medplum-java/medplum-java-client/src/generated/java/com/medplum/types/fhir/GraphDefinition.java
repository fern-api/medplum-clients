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
    as = ImmutableGraphDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface GraphDefinition {
  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<String> publisher();

  Optional<String> name();

  Optional<Boolean> experimental();

  Optional<List<UsageContext>> useContext();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<Uri> url();

  Optional<Meta> meta();

  Optional<Markdown> purpose();

  Optional<List<GraphDefinition_Link>> link();

  String resourceType();

  Optional<GraphdefinitionStatus> status();

  Optional<DateTime> date();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> contact();

  Optional<Canonical> profile();

  Optional<String> version();

  Optional<Markdown> description();

  Optional<Code> language();

  Optional<Code> start();

  static ImmutableGraphDefinition.ResourceTypeBuildStage builder() {
    return ImmutableGraphDefinition.builder();
  }
}
