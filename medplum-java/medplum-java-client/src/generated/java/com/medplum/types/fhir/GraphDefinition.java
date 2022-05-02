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
  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Canonical> profile();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  Optional<String> publisher();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  Optional<GraphdefinitionStatus> status();

  Optional<Markdown> purpose();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> contact();

  Optional<Narrative> text();

  Optional<Uri> url();

  Optional<Meta> meta();

  Optional<String> version();

  Optional<DateTime> date();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<GraphDefinition_Link>> link();

  Optional<Code> language();

  Optional<Boolean> experimental();

  Optional<Markdown> description();

  Optional<Code> start();

  static ImmutableGraphDefinition.ResourceTypeBuildStage builder() {
    return ImmutableGraphDefinition.builder();
  }
}
