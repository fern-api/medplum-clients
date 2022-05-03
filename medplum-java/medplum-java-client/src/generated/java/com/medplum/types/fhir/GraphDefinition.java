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
  Optional<GraphdefinitionStatus> status();

  Optional<Boolean> experimental();

  Optional<Canonical> profile();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<DateTime> date();

  Optional<List<Extension>> extension();

  Optional<List<GraphDefinition_Link>> link();

  Optional<Uri> url();

  Optional<List<ContactDetail>> contact();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<String> version();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<String> publisher();

  Optional<Id> id();

  Optional<List<UsageContext>> useContext();

  Optional<Code> start();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> name();

  Optional<Markdown> description();

  String resourceType();

  Optional<Markdown> purpose();

  static ImmutableGraphDefinition.ResourceTypeBuildStage builder() {
    return ImmutableGraphDefinition.builder();
  }
}
