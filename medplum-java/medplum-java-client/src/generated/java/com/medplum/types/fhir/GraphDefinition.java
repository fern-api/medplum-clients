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
  Optional<Meta> meta();

  Optional<DateTime> date();

  Optional<Code> language();

  Optional<String> publisher();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> jurisdiction();

  String resourceType();

  Optional<List<UsageContext>> useContext();

  Optional<Uri> url();

  Optional<String> name();

  Optional<String> version();

  Optional<Markdown> purpose();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<Code> start();

  Optional<List<GraphDefinition_Link>> link();

  Optional<List<ContactDetail>> contact();

  Optional<GraphdefinitionStatus> status();

  Optional<Id> id();

  Optional<Markdown> description();

  Optional<List<Extension>> extension();

  Optional<Boolean> experimental();

  Optional<Canonical> profile();

  Optional<List<ResourceList>> contained();

  static ImmutableGraphDefinition.ResourceTypeBuildStage builder() {
    return ImmutableGraphDefinition.builder();
  }
}
